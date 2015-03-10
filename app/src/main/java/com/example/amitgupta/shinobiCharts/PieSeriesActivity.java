
package com.example.amitgupta.shinobiCharts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;

import com.shinobicontrols.charts.ChartFragment;
import com.shinobicontrols.charts.DataAdapter;
import com.shinobicontrols.charts.DataPoint;
import com.shinobicontrols.charts.PieSeries;
import com.shinobicontrols.charts.PieSeriesStyle;
import com.shinobicontrols.charts.PieDonutSeries.RadialEffect;
import com.shinobicontrols.charts.Series.SelectionMode;
import com.shinobicontrols.charts.ShinobiChart;
import com.shinobicontrols.charts.SimpleDataAdapter;

/**
 * In this sample, we first check for whether it is the first time the Activity
 * is being created as we only want to set it up the once. We then get a
 * reference to the ShinobiChart from the ChartFragment, which is inflated from
 * XML. This allows us to create a PieSeries with some simple data and add it to
 * the Chart. Following this, the series is styled to use green, yellow and pink
 * slices. We then finally go on to apply a style to selected slices.
 */
public class PieSeriesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_series);

        // Only set the chart up the first time the Activity is created
        if (savedInstanceState == null) {

            ChartFragment chartFragment =
                    (ChartFragment) getFragmentManager().findFragmentById(R.id.chart);

            // Get the a reference to the ShinobiChart from the ChartFragment
            ShinobiChart shinobiChart = chartFragment.getShinobiChart();
            shinobiChart.setTitle("Expenses PIE Chart");
            shinobiChart.setLicenseKey(getString(R.string.license));

            // Create our DataAdapter and data
            DataAdapter<String, Double> dataAdapter = new SimpleDataAdapter<String, Double>();
            dataAdapter.add(new DataPoint<String, Double>("Travel", 5.0));      // 5
            dataAdapter.add(new DataPoint<String, Double>("Eating", 12.0));
            dataAdapter.add(new DataPoint<String, Double>("Shopping", 2.0));
            dataAdapter.add(new DataPoint<String, Double>("Hotel", 7.0));

            // Create a PieSeries and give it the data adapter
            PieSeries series = new PieSeries();
            series.setDataAdapter(dataAdapter);
            series.setSelectionMode(SelectionMode.POINT_SINGLE);
            series.setSelectedPosition(0.0f);
            shinobiChart.addSeries(series);

            // Apply styling to the Pie Series
            PieSeriesStyle style = series.getStyle();
            style.setFlavorColors(new int[] {
                    Color.argb(255, 103, 169, 66), // green
                    Color.argb(255, 248, 184, 60), // yellow
                    Color.argb(200, 100, 54, 200), // Blue
                    Color.argb(255, 233, 74, 114) // pink
            });
            style.setRadialEffect(RadialEffect.BEVELLED_LIGHT);
            style.setCrustShown(false);
            style.setLabelTextSize(16.0f);

            // apply style to selected slices
            PieSeriesStyle selectedSeriesStyle = series.getSelectedStyle();
            selectedSeriesStyle.setFlavorColors(new int[] {
                    Color.argb(255, 103, 169, 66), // green
                    Color.argb(255, 248, 184, 60), // yellow
                    Color.argb(200, 100, 54, 200), // Blue
                    Color.argb(255, 233, 74, 114)
            // pink
            });
            selectedSeriesStyle.setCrustThickness(10f);
            selectedSeriesStyle.setCrustColors(new int[] {
                    Color.argb(255, 0, 0, 0), // black
            });
            series.setSelectedStyle(selectedSeriesStyle);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
