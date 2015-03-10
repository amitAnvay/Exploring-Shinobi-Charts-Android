
package com.example.amitgupta.shinobiCharts;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import com.shinobicontrols.charts.CandlestickSeries;
import com.shinobicontrols.charts.ChartFragment;
import com.shinobicontrols.charts.Data;
import com.shinobicontrols.charts.DataAdapter;
import com.shinobicontrols.charts.DateTimeAxis;
import com.shinobicontrols.charts.MultiValueDataPoint;
import com.shinobicontrols.charts.NumberAxis;
import com.shinobicontrols.charts.ShinobiChart;
import com.shinobicontrols.charts.SimpleDataAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class CandlestickActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candelstick_chart);

        // Only set the chart up the first time the Activity is created
        if (savedInstanceState == null) {
            // Get the a reference to the ShinobiChart from the ChartFragment
            ChartFragment chartFragment = (ChartFragment) getFragmentManager().findFragmentById(R.id.chart);
            ShinobiChart shinobiChart = chartFragment.getShinobiChart();
            shinobiChart.setLicenseKey(getString(R.string.license));

            DateTimeAxis xAxis = new DateTimeAxis();
            xAxis.setTitle("Date");
            xAxis.enableGesturePanning(true);
            xAxis.enableGestureZooming(true);
            shinobiChart.addXAxis(xAxis);

            NumberAxis yAxis = new NumberAxis();
            yAxis.setTitle("Price (USD)");
            yAxis.enableGesturePanning(true);
            yAxis.enableGestureZooming(true);
            shinobiChart.addYAxis(yAxis);

            CandlestickSeries series = new CandlestickSeries();
            DataAdapter<Date, Double> dataAdapter = new SimpleDataAdapter<Date, Double>();
            dataAdapter.addAll(LoadStockPriceData("AppleStockPrices.json"));
            series.setDataAdapter(dataAdapter);
            shinobiChart.addSeries(series);
        }

    }

    private List<Data<Date, Double>> LoadStockPriceData(String assetName)
    {
        List<Data<Date, Double>> dataPoints = new ArrayList<Data<Date, Double>>();
        AssetManager assetManager = this.getAssets();
        InputStream stream = null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        try {
            stream = assetManager.open(assetName);
            BufferedReader streamReader = new BufferedReader(new InputStreamReader(stream, "UTF-8"));

            StringBuilder responseStrBuilder = new StringBuilder();
            String inputStr;
            while ((inputStr = streamReader.readLine()) != null) {
                responseStrBuilder.append(inputStr);
            }
            JSONArray jsonArray = new JSONArray(responseStrBuilder.toString());

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                MultiValueDataPoint<Date, Double> dataPoint = new MultiValueDataPoint<Date, Double>(
                        formatter.parse(jsonObject.getString("date")),
                        jsonObject.getDouble("low"),
                        jsonObject.getDouble("high"),
                        jsonObject.getDouble("open"),
                        jsonObject.getDouble("close"));
                dataPoints.add(dataPoint);
            }
        } catch (IOException exc) {
            Log.e("CandlestickChart", "Unable to load asset");
        } catch (JSONException exc) {
            Log.e("CandlestickChart", "Unable to parse JSON data");
        } catch (ParseException exc) {
            Log.e("CandlestickChart", "Unable to parse JSON data");
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException exc) {
                }
            }
        }
        return dataPoints;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
