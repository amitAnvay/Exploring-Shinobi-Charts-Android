package com.example.amitgupta.shinobiCharts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

//    static {
//        System.loadLibrary("myNativeCode");
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_old_);

//        TextView textView = (TextView) findViewById(R.id.textview);
//        textView.setText(getStringFromNative());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//    public native String getStringFromNative();


    public void showPieChart(View view)
    {
        Intent intent = new Intent(MainActivity.this, PieSeriesActivity.class);
        startActivity(intent);
    }

    public void showPanAndZoom(View view)
    {
        Intent intent = new Intent(MainActivity.this, PanAndZoomActivity.class);
        startActivity(intent);
    }

    public void showCandleStickChart(View view)
    {
        Intent intent = new Intent(MainActivity.this, CandlestickActivity.class);
        startActivity(intent);
    }

    public void showColSeriesStacking(View view)
    {
        Intent intent = new Intent(MainActivity.this, ColumnSeriesStackingActivity.class);
        startActivity(intent);
    }

    public void showTickLabelFormating(View view)
    {
        Intent intent = new Intent(MainActivity.this, TickLabelFormattingActivity.class);
        startActivity(intent);
    }
}
