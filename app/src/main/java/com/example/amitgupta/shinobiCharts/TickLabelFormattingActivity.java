
package com.example.amitgupta.shinobiCharts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;

import com.shinobicontrols.charts.ChartFragment;
import com.shinobicontrols.charts.DataAdapter;
import com.shinobicontrols.charts.DataPoint;
import com.shinobicontrols.charts.LineSeries;
import com.shinobicontrols.charts.NumberAxis;
import com.shinobicontrols.charts.NumberRange;
import com.shinobicontrols.charts.ShinobiChart;
import com.shinobicontrols.charts.SimpleDataAdapter;
import com.shinobicontrols.charts.Title;

import java.text.DecimalFormat;

/**
 * In this sample, we first check for whether it is the first time the Activity
 * is being created as we only want to set it up the once. We then get a
 * reference to the ShinobiChart from the ChartFragment, which is inflated from
 * XML. This allows us to create a LineSeries with some simple data and add it
 * to the Chart. Following this, we create and style an X and Y axis. A custom
 * major tick frequency is set on the X axis and the tick mark labels on the Y
 * axis are formatted using a custom formatter.
 */
public class TickLabelFormattingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticklabelformatting);

        // Only set the chart up the first time the Activity is created
        if (savedInstanceState == null) {

            ChartFragment chartFragment = (ChartFragment) getFragmentManager().findFragmentById(R.id.chart);

            // Get a reference to the ShinobiChart from the ChartFragment
            ShinobiChart shinobiChart = chartFragment.getShinobiChart();
            shinobiChart.setLicenseKey(getString(R.string.license));

            // Create our DataAdapter and data
            DataAdapter<Integer, Double> dataAdapter = new SimpleDataAdapter<Integer, Double>();
            dataAdapter.add(new DataPoint<Integer, Double>(0, 0.0));
            dataAdapter.add(new DataPoint<Integer, Double>(1, 1.657));
            dataAdapter.add(new DataPoint<Integer, Double>(2, 2.566));
            dataAdapter.add(new DataPoint<Integer, Double>(3, 3.785));
            dataAdapter.add(new DataPoint<Integer, Double>(4, 4.755));
            dataAdapter.add(new DataPoint<Integer, Double>(5, 5.557));
            dataAdapter.add(new DataPoint<Integer, Double>(6, 6.554));
            dataAdapter.add(new DataPoint<Integer, Double>(7, 7.5489));
            dataAdapter.add(new DataPoint<Integer, Double>(8, 8.406));
            dataAdapter.add(new DataPoint<Integer, Double>(9, 10.564));
            dataAdapter.add(new DataPoint<Integer, Double>(10, 11.123));

            // Create a LineSeries and give it the data adapter
            LineSeries series = new LineSeries();
            series.setDataAdapter(dataAdapter);
            shinobiChart.addSeries(series);

            NumberAxis axisX = createXAxis();
            NumberAxis axisY = createYAxis();

            shinobiChart.setXAxis(axisX);
            shinobiChart.setYAxis(axisY);

            // Give the chart a title
            shinobiChart.setTitle("Crazy Widget Pricing");
        }
    }

    private NumberAxis createXAxis() {
        NumberAxis axisX = new NumberAxis();
        axisX.setDefaultRange(new NumberRange(0.0, 11.0));
        axisX.setTitle("Number of widgets purchased");

        // Style the axis - blue axis line, grid lines and title to the right
        axisX.getStyle().setLineColor(Color.argb(255, 60, 60, 215));
        axisX.getStyle().getGridlineStyle().setGridlinesShown(true);
        axisX.getStyle().getTitleStyle().setPosition(Title.Position.TOP_OR_RIGHT);

        // Set the custom tick mark frequency for the X axis
        axisX.setMajorTickFrequency(2.0);

        return axisX;
    }

    private NumberAxis createYAxis() {
        NumberAxis axisY = new NumberAxis();
        axisY.setDefaultRange(new NumberRange(0.0, 12.5));
        axisY.setTitle("Total price");

        // Style the axis - blue axis line, grid lines
        axisY.getStyle().setLineColor(Color.argb(255, 60, 60, 215));
        axisY.getStyle().getGridlineStyle().setGridlinesShown(true);
        axisY.getStyle().getTickStyle().setMinorTicksShown(true);

        // Set the custom tick mark frequency for the Y axis
        axisY.setMajorTickFrequency(1.0);
        axisY.setMinorTickFrequency(0.25);

        // Set the custom tick mark format for the Y axis
        DecimalFormat formatY = new DecimalFormat("$0.00");
        formatY.setDecimalSeparatorAlwaysShown(true);
        axisY.setLabelFormat(formatY);

        return axisY;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
