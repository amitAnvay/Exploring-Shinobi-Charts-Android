
package com.example.amitgupta.shinobiCharts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;

import com.example.amitgupta.shinobiCharts.panandzoom.model.PanAndZoomApplication;
import com.example.amitgupta.shinobiCharts.panandzoom.model.WeatherReport;
import com.shinobicontrols.charts.Axis;
import com.shinobicontrols.charts.ChartFragment;
import com.shinobicontrols.charts.DataAdapter;
import com.shinobicontrols.charts.DataPoint;
import com.shinobicontrols.charts.DateRange;
import com.shinobicontrols.charts.DateTimeAxis;
import com.shinobicontrols.charts.LineSeries;
import com.shinobicontrols.charts.NumberAxis;
import com.shinobicontrols.charts.ShinobiChart;
import com.shinobicontrols.charts.SimpleDataAdapter;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PanAndZoomActivity extends Activity implements
        ShinobiChart.OnAxisMotionStateChangeListener {

    private final static String title = "Max and Min Temperature (Monthly Mean), Durham Weather Station    ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pan_and_zoom);

        // Only set the chart up the first time the Activity is created
        if (savedInstanceState == null) {

            // Get the a reference to the ShinobiChart from the ChartFragment
            ChartFragment chartFragment =
                    (ChartFragment) getFragmentManager().findFragmentById(R.id.chart);

            ShinobiChart shinobiChart = chartFragment.getShinobiChart();

            // TODO: replace <license_key_here> with you trial license key
            shinobiChart.setLicenseKey(getString(R.string.license));

            // Set up and add the X axis
            DateTimeAxis xAxis = new DateTimeAxis();
            setupXAxis(xAxis);

            DateRange xDefaultRange = new DateRange(
                    new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime(),
                    new GregorianCalendar(2009, Calendar.DECEMBER, 31).getTime());
            xAxis.setDefaultRange(xDefaultRange);

            shinobiChart.addXAxis(xAxis);

            // Add a Y Axis - no need to set it up as we want this to stay fixed
            // and by default gestures are disabled
            NumberAxis yAxis = new NumberAxis();
            shinobiChart.addYAxis(yAxis);

            // Give the chart a title
            setTitle(shinobiChart, xDefaultRange);

            // Put the model data into data adapters for each series
            DataAdapter<Date, Double> minTemperatureDataAdapter = new SimpleDataAdapter<Date, Double>();
            DataAdapter<Date, Double> maxTemperatureDataAdapter = new SimpleDataAdapter<Date, Double>();
            populateDataAdapters(minTemperatureDataAdapter, maxTemperatureDataAdapter);

            // Max Temperature line - give it data and color it red
            LineSeries maxTemperatureLine = new LineSeries();
            maxTemperatureLine.setDataAdapter(maxTemperatureDataAdapter);
            maxTemperatureLine.getStyle().setLineColor(Color.RED);
            maxTemperatureLine.getStyle().setLineColorBelowBaseline(Color.RED);
            shinobiChart.addSeries(maxTemperatureLine);

            // Min Temperature line - give it data and color it blue
            LineSeries minTemperatureLine = new LineSeries();
            minTemperatureLine.setDataAdapter(minTemperatureDataAdapter);
            minTemperatureLine.getStyle().setLineColor(Color.BLUE);
            minTemperatureLine.getStyle().setLineColorBelowBaseline(Color.BLUE);
            shinobiChart.addSeries(minTemperatureLine);

            // Make this activity the listener for axis events
            shinobiChart.setOnAxisMotionStateChangeListener(this);

        }
    }

    // Enable pan and zoom and set a default range
    private void setupXAxis(DateTimeAxis xAxis) {

        xAxis.enableGesturePanning(true);
        xAxis.enableGestureZooming(true);
        xAxis.enableMomentumPanning(true);
        xAxis.enableMomentumZooming(true);

    }

    private void populateDataAdapters(
            DataAdapter<Date, Double> minTemperatureDataAdapter,
            DataAdapter<Date, Double> maxTemperatureDataAdapter) {

        // For convenience our 'model' is stored in our Application object
        PanAndZoomApplication application = (PanAndZoomApplication) getApplication();

        for (WeatherReport report : application.getWeatherModel()) {

            minTemperatureDataAdapter.add(new DataPoint<Date, Double>(
                    report.getDate(), report.getMinTemperature()));

            maxTemperatureDataAdapter.add(new DataPoint<Date, Double>(
                    report.getDate(), report.getMaxTemperature()));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onAxisMotionStateChange(Axis<?, ?> axis) {
        // We're only interested in the X axis here
        if (axis == axis.getChart().getXAxis()) {
            if (axis.getMotionState() == Axis.MotionState.STOPPED) {
                setTitle(axis.getChart(), (DateRange) axis.getCurrentDisplayedRange());
            }
            else {
                axis.getChart().setTitle(title);
            }
        }
    }

    private void setTitle(ShinobiChart chart, DateRange range) {
        DateFormat dateFormat = DateFormat.getDateInstance();
        String titleString = String.format("%s    %s to %s",
                title,
                dateFormat.format(range.getMinimum()),
                dateFormat.format(range.getMaximum()));
        chart.setTitle(titleString);
    }

}
