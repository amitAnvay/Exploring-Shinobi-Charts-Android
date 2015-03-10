
package com.example.amitgupta.shinobiCharts.panandzoom.model;

import android.app.Application;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * For simplicity we're putting the 'model' data into our customized Application
 * class. However, if this data was modifiable, any changes would be lost if
 * Android silently kills the app to reclaim memory. Depending on your app's
 * needs you'll want to think about alternatives like persistent storage
 * instead.
 */
public class PanAndZoomApplication extends Application {

    /**
     * Just use the first day of each month for the date.
     */
    private static final int DAY = 1;

    /**
     * Our 'model' is just a list of WeatherReport objects.
     */
    private List<WeatherReport> weatherModel;

    /**
     * We only load the data when the model is requested.
     * 
     * @return the list of WeatherReport objects that make up the model
     */
    public List<WeatherReport> getWeatherModel() {

        if (weatherModel == null) {
            weatherModel = new ArrayList<WeatherReport>();
            loadWeatherData(weatherModel);
        }

        return weatherModel;
    }

    private void loadWeatherData(List<WeatherReport> weatherModel) {
        weatherModel.add(new WeatherReport(new GregorianCalendar(1884, Calendar.JANUARY, DAY)
                .getTime(), 2.6, 8.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1884, Calendar.FEBRUARY, DAY)
                .getTime(), 1.1, 7.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1884, Calendar.MARCH, DAY)
                .getTime(), 1.7, 9.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1884, Calendar.APRIL, DAY)
                .getTime(), 2, 10.5));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1884, Calendar.MAY, DAY).getTime(), 4.4, 15.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1884, Calendar.JUNE, DAY)
                .getTime(), 7.3, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1884, Calendar.JULY, DAY)
                .getTime(), 9.8, 20.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1884, Calendar.AUGUST, DAY)
                .getTime(), 9.6, 22));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1884, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.5, 17.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1884, Calendar.OCTOBER, DAY)
                .getTime(), 4.4, 12.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1884, Calendar.NOVEMBER, DAY)
                .getTime(), 1.9, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1884, Calendar.DECEMBER, DAY)
                .getTime(), 0.8, 5.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1885, Calendar.JANUARY, DAY)
                .getTime(), 0.1, 4.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1885, Calendar.FEBRUARY, DAY)
                .getTime(), 1.1, 7.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1885, Calendar.MARCH, DAY)
                .getTime(), -0.1, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1885, Calendar.APRIL, DAY)
                .getTime(), 2.4, 11.4));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1885, Calendar.MAY, DAY).getTime(), 3.1, 12.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1885, Calendar.JUNE, DAY)
                .getTime(), 7.6, 17.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1885, Calendar.JULY, DAY)
                .getTime(), 9.7, 21.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1885, Calendar.AUGUST, DAY)
                .getTime(), 8.7, 16.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1885, Calendar.SEPTEMBER, DAY)
                .getTime(), 6.2, 16.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1885, Calendar.OCTOBER, DAY)
                .getTime(), 3.7, 9.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1885, Calendar.NOVEMBER, DAY)
                .getTime(), 2.4, 7.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1885, Calendar.DECEMBER, DAY)
                .getTime(), -0.1, 6.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1886, Calendar.JANUARY, DAY)
                .getTime(), -1.4, 3.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1886, Calendar.FEBRUARY, DAY)
                .getTime(), -1.8, 4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1886, Calendar.MARCH, DAY)
                .getTime(), -0.1, 6.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1886, Calendar.APRIL, DAY)
                .getTime(), 2.4, 10));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1886, Calendar.MAY, DAY).getTime(), 4.7, 12.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1886, Calendar.JUNE, DAY)
                .getTime(), 7.7, 17.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1886, Calendar.JULY, DAY)
                .getTime(), 10.3, 20.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1886, Calendar.AUGUST, DAY)
                .getTime(), 10.3, 19.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1886, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.6, 16.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1886, Calendar.OCTOBER, DAY)
                .getTime(), 7.3, 12.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1886, Calendar.NOVEMBER, DAY)
                .getTime(), 2.5, 9.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1886, Calendar.DECEMBER, DAY)
                .getTime(), -1.4, 3.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1887, Calendar.JANUARY, DAY)
                .getTime(), -1.1, 4.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1887, Calendar.FEBRUARY, DAY)
                .getTime(), 0.1, 7.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1887, Calendar.MARCH, DAY)
                .getTime(), -0.5, 7.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1887, Calendar.APRIL, DAY)
                .getTime(), 0.9, 10.4));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1887, Calendar.MAY, DAY).getTime(), 4.3, 12.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1887, Calendar.JUNE, DAY)
                .getTime(), 9.1, 20.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1887, Calendar.JULY, DAY)
                .getTime(), 11.2, 23));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1887, Calendar.AUGUST, DAY)
                .getTime(), 9.1, 20.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1887, Calendar.SEPTEMBER, DAY)
                .getTime(), 6.9, 15));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1887, Calendar.OCTOBER, DAY)
                .getTime(), 3.3, 10.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1887, Calendar.NOVEMBER, DAY)
                .getTime(), 1.5, 6.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1887, Calendar.DECEMBER, DAY)
                .getTime(), -0.1, 4.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1888, Calendar.JANUARY, DAY)
                .getTime(), 0.3, 6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1888, Calendar.FEBRUARY, DAY)
                .getTime(), -0.4, 4.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1888, Calendar.MARCH, DAY)
                .getTime(), -0.3, 4.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1888, Calendar.APRIL, DAY)
                .getTime(), 1.8, 9.3));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1888, Calendar.MAY, DAY).getTime(), 4.6, 15));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1888, Calendar.JUNE, DAY)
                .getTime(), 7, 15.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1888, Calendar.JULY, DAY)
                .getTime(), 8.6, 16.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1888, Calendar.AUGUST, DAY)
                .getTime(), 9, 17.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1888, Calendar.SEPTEMBER, DAY)
                .getTime(), 6.7, 15.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1888, Calendar.OCTOBER, DAY)
                .getTime(), 4.1, 12.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1888, Calendar.NOVEMBER, DAY)
                .getTime(), 4.4, 9.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1888, Calendar.DECEMBER, DAY)
                .getTime(), 1.3, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1889, Calendar.JANUARY, DAY)
                .getTime(), 0.6, 6.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1889, Calendar.FEBRUARY, DAY)
                .getTime(), -0.5, 5.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1889, Calendar.MARCH, DAY)
                .getTime(), 0.3, 8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1889, Calendar.APRIL, DAY)
                .getTime(), 2.6, 9.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1889, Calendar.MAY, DAY).getTime(), 7, 17));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1889, Calendar.JUNE, DAY)
                .getTime(), 9, 20));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1889, Calendar.JULY, DAY)
                .getTime(), 9.5, 19.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1889, Calendar.AUGUST, DAY)
                .getTime(), 10.4, 18.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1889, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.8, 15.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1889, Calendar.OCTOBER, DAY)
                .getTime(), 5.2, 11.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1889, Calendar.NOVEMBER, DAY)
                .getTime(), 2.6, 8.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1889, Calendar.DECEMBER, DAY)
                .getTime(), -0.2, 5.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1890, Calendar.JANUARY, DAY)
                .getTime(), 1.9, 8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1890, Calendar.FEBRUARY, DAY)
                .getTime(), 0.3, 5.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1890, Calendar.MARCH, DAY)
                .getTime(), 2.5, 9.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1890, Calendar.APRIL, DAY)
                .getTime(), 1.4, 10.6));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1890, Calendar.MAY, DAY).getTime(), 6, 15.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1890, Calendar.JUNE, DAY)
                .getTime(), 8.5, 18.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1890, Calendar.JULY, DAY)
                .getTime(), 9.6, 18.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1890, Calendar.AUGUST, DAY)
                .getTime(), 9.4, 18.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1890, Calendar.SEPTEMBER, DAY)
                .getTime(), 10.3, 19.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1890, Calendar.OCTOBER, DAY)
                .getTime(), 6, 13.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1890, Calendar.NOVEMBER, DAY)
                .getTime(), 1.1, 8.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1890, Calendar.DECEMBER, DAY)
                .getTime(), -1.4, 2.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1891, Calendar.JANUARY, DAY)
                .getTime(), -1.7, 4.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1891, Calendar.FEBRUARY, DAY)
                .getTime(), 0, 9.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1891, Calendar.MARCH, DAY)
                .getTime(), -0.1, 6.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1891, Calendar.APRIL, DAY)
                .getTime(), 1.2, 8.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1891, Calendar.MAY, DAY).getTime(), 3.6, 13.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1891, Calendar.JUNE, DAY)
                .getTime(), 8.9, 18.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1891, Calendar.JULY, DAY)
                .getTime(), 10.6, 19.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1891, Calendar.AUGUST, DAY)
                .getTime(), 10, 17.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1891, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.1, 17.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1891, Calendar.OCTOBER, DAY)
                .getTime(), 4.9, 12.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1891, Calendar.NOVEMBER, DAY)
                .getTime(), 2.2, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1891, Calendar.DECEMBER, DAY)
                .getTime(), -0.5, 5.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1892, Calendar.JANUARY, DAY)
                .getTime(), -1.4, 4.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1892, Calendar.FEBRUARY, DAY)
                .getTime(), -0.6, 5.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1892, Calendar.MARCH, DAY)
                .getTime(), -1.9, 6.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1892, Calendar.APRIL, DAY)
                .getTime(), 1, 11.4));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1892, Calendar.MAY, DAY).getTime(), 5.4, 15.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1892, Calendar.JUNE, DAY)
                .getTime(), 7.4, 17.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1892, Calendar.JULY, DAY)
                .getTime(), 9.2, 17.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1892, Calendar.AUGUST, DAY)
                .getTime(), 9.9, 18.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1892, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.5, 15.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1892, Calendar.OCTOBER, DAY)
                .getTime(), 2.9, 9.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1892, Calendar.NOVEMBER, DAY)
                .getTime(), 2.6, 8.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1892, Calendar.DECEMBER, DAY)
                .getTime(), -1.9, 3.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1893, Calendar.JANUARY, DAY)
                .getTime(), -0.4, 4.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1893, Calendar.FEBRUARY, DAY)
                .getTime(), 0.5, 6.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1893, Calendar.MARCH, DAY)
                .getTime(), 1.7, 12.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1893, Calendar.APRIL, DAY)
                .getTime(), 2.5, 13.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1893, Calendar.MAY, DAY).getTime(), 6.3, 16.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1893, Calendar.JUNE, DAY)
                .getTime(), 9.5, 19.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1893, Calendar.JULY, DAY)
                .getTime(), 10.2, 20));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1893, Calendar.AUGUST, DAY)
                .getTime(), 11.6, 22.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1893, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.4, 16.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1893, Calendar.OCTOBER, DAY)
                .getTime(), 4.9, 13.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1893, Calendar.NOVEMBER, DAY)
                .getTime(), 1.7, 8.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1893, Calendar.DECEMBER, DAY)
                .getTime(), 1.5, 7.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1894, Calendar.JANUARY, DAY)
                .getTime(), -0.6, 5.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1894, Calendar.FEBRUARY, DAY)
                .getTime(), 0.1, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1894, Calendar.MARCH, DAY)
                .getTime(), 0.7, 11.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1894, Calendar.APRIL, DAY)
                .getTime(), 3.3, 13));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1894, Calendar.MAY, DAY).getTime(), 3.4, 11.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1894, Calendar.JUNE, DAY)
                .getTime(), 7.7, 16.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1894, Calendar.JULY, DAY)
                .getTime(), 10.9, 20.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1894, Calendar.AUGUST, DAY)
                .getTime(), 9.3, 18));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1894, Calendar.SEPTEMBER, DAY)
                .getTime(), 6.9, 14.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1894, Calendar.OCTOBER, DAY)
                .getTime(), 4.3, 11.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1894, Calendar.NOVEMBER, DAY)
                .getTime(), 4.5, 10));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1894, Calendar.DECEMBER, DAY)
                .getTime(), 0.8, 7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1895, Calendar.JANUARY, DAY)
                .getTime(), -3.7, 1.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1895, Calendar.FEBRUARY, DAY)
                .getTime(), -4.8, 2.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1895, Calendar.MARCH, DAY)
                .getTime(), 0.8, 8.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1895, Calendar.APRIL, DAY)
                .getTime(), 3.1, 12));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1895, Calendar.MAY, DAY).getTime(), 5.5, 16.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1895, Calendar.JUNE, DAY)
                .getTime(), 7.4, 19.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1895, Calendar.JULY, DAY)
                .getTime(), 9.8, 19.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1895, Calendar.AUGUST, DAY)
                .getTime(), 10.9, 20.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1895, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.4, 20.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1895, Calendar.OCTOBER, DAY)
                .getTime(), 2.4, 10.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1895, Calendar.NOVEMBER, DAY)
                .getTime(), 3.2, 9.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1895, Calendar.DECEMBER, DAY)
                .getTime(), 0.2, 5.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1896, Calendar.JANUARY, DAY)
                .getTime(), 1.5, 7.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1896, Calendar.FEBRUARY, DAY)
                .getTime(), 1.1, 7.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1896, Calendar.MARCH, DAY)
                .getTime(), 1.6, 10.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1896, Calendar.APRIL, DAY)
                .getTime(), 3.8, 13.5));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1896, Calendar.MAY, DAY).getTime(), 5.2, 16.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1896, Calendar.JUNE, DAY)
                .getTime(), 9.8, 20.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1896, Calendar.JULY, DAY)
                .getTime(), 10.1, 21));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1896, Calendar.AUGUST, DAY)
                .getTime(), 9.7, 17.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1896, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.5, 15.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1896, Calendar.OCTOBER, DAY)
                .getTime(), 2.7, 9.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1896, Calendar.NOVEMBER, DAY)
                .getTime(), 1.5, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1896, Calendar.DECEMBER, DAY)
                .getTime(), 0.7, 5.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1897, Calendar.JANUARY, DAY)
                .getTime(), -1.2, 3.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1897, Calendar.FEBRUARY, DAY)
                .getTime(), 1.7, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1897, Calendar.MARCH, DAY)
                .getTime(), 1.9, 8.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1897, Calendar.APRIL, DAY)
                .getTime(), 1.7, 9.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1897, Calendar.MAY, DAY).getTime(), 3.8, 12.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1897, Calendar.JUNE, DAY)
                .getTime(), 9, 17.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1897, Calendar.JULY, DAY)
                .getTime(), 10.2, 20.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1897, Calendar.AUGUST, DAY)
                .getTime(), 10.8, 21.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1897, Calendar.SEPTEMBER, DAY)
                .getTime(), 6.6, 15.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1897, Calendar.OCTOBER, DAY)
                .getTime(), 5.6, 13.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1897, Calendar.NOVEMBER, DAY)
                .getTime(), 4.2, 9.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1897, Calendar.DECEMBER, DAY)
                .getTime(), 0.9, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1898, Calendar.JANUARY, DAY)
                .getTime(), 3, 9.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1898, Calendar.FEBRUARY, DAY)
                .getTime(), 0.3, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1898, Calendar.MARCH, DAY)
                .getTime(), 0.1, 8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1898, Calendar.APRIL, DAY)
                .getTime(), 3.3, 12.1));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1898, Calendar.MAY, DAY).getTime(), 4.1, 12.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1898, Calendar.JUNE, DAY)
                .getTime(), 7.9, 17.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1898, Calendar.JULY, DAY)
                .getTime(), 8.9, 20));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1898, Calendar.AUGUST, DAY)
                .getTime(), 10.4, 20.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1898, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.8, 19.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1898, Calendar.OCTOBER, DAY)
                .getTime(), 7.5, 14.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1898, Calendar.NOVEMBER, DAY)
                .getTime(), 2.9, 9.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1898, Calendar.DECEMBER, DAY)
                .getTime(), 2.9, 9.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1899, Calendar.JANUARY, DAY)
                .getTime(), 0.6, 6.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1899, Calendar.FEBRUARY, DAY)
                .getTime(), -0.5, 7.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1899, Calendar.MARCH, DAY)
                .getTime(), 0.2, 9.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1899, Calendar.APRIL, DAY)
                .getTime(), 2.6, 11.3));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1899, Calendar.MAY, DAY).getTime(), 4.2, 12.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1899, Calendar.JUNE, DAY)
                .getTime(), 8.2, 20.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1899, Calendar.JULY, DAY)
                .getTime(), 11.7, 21.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1899, Calendar.AUGUST, DAY)
                .getTime(), 11, 21.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1899, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.1, 17.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1899, Calendar.OCTOBER, DAY)
                .getTime(), 3.8, 13));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1899, Calendar.NOVEMBER, DAY)
                .getTime(), 4.3, 11.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1899, Calendar.DECEMBER, DAY)
                .getTime(), -1.7, 3.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1900, Calendar.JANUARY, DAY)
                .getTime(), 0.4, 5.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1900, Calendar.FEBRUARY, DAY)
                .getTime(), -2.3, 3.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1900, Calendar.MARCH, DAY)
                .getTime(), -0.1, 5.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1900, Calendar.APRIL, DAY)
                .getTime(), 2.7, 12.4));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1900, Calendar.MAY, DAY).getTime(), 5, 13.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1900, Calendar.JUNE, DAY)
                .getTime(), 8.8, 18.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1900, Calendar.JULY, DAY)
                .getTime(), 12.3, 21.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1900, Calendar.AUGUST, DAY)
                .getTime(), 9.9, 17.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1900, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.4, 17.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1900, Calendar.OCTOBER, DAY)
                .getTime(), 4.6, 12.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1900, Calendar.NOVEMBER, DAY)
                .getTime(), 3.9, 8.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1900, Calendar.DECEMBER, DAY)
                .getTime(), 4, 8.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1901, Calendar.JANUARY, DAY)
                .getTime(), -0.4, 5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1901, Calendar.FEBRUARY, DAY)
                .getTime(), -0.5, 4.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1901, Calendar.MARCH, DAY)
                .getTime(), 0.4, 7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1901, Calendar.APRIL, DAY)
                .getTime(), 2.6, 12.4));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1901, Calendar.MAY, DAY).getTime(), 5, 14.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1901, Calendar.JUNE, DAY)
                .getTime(), 7.6, 17.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1901, Calendar.JULY, DAY)
                .getTime(), 12, 22.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1901, Calendar.AUGUST, DAY)
                .getTime(), 10.5, 20.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1901, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.4, 16.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1901, Calendar.OCTOBER, DAY)
                .getTime(), 4.5, 12.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1901, Calendar.NOVEMBER, DAY)
                .getTime(), 2, 8.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1901, Calendar.DECEMBER, DAY)
                .getTime(), 0.2, 5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1902, Calendar.JANUARY, DAY)
                .getTime(), 1.4, 6.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1902, Calendar.FEBRUARY, DAY)
                .getTime(), -2.1, 3.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1902, Calendar.MARCH, DAY)
                .getTime(), 1.7, 9.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1902, Calendar.APRIL, DAY)
                .getTime(), 2, 10.8));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1902, Calendar.MAY, DAY).getTime(), 3.7, 11));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1902, Calendar.JUNE, DAY)
                .getTime(), 7.5, 15.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1902, Calendar.JULY, DAY)
                .getTime(), 9, 17.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1902, Calendar.AUGUST, DAY)
                .getTime(), 8.4, 16.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1902, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.2, 15.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1902, Calendar.OCTOBER, DAY)
                .getTime(), 5.9, 11.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1902, Calendar.NOVEMBER, DAY)
                .getTime(), 3.9, 8.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1902, Calendar.DECEMBER, DAY)
                .getTime(), 2, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1903, Calendar.JANUARY, DAY)
                .getTime(), -0.2, 5.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1903, Calendar.FEBRUARY, DAY)
                .getTime(), 2.9, 9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1903, Calendar.MARCH, DAY)
                .getTime(), 2.2, 9.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1903, Calendar.APRIL, DAY)
                .getTime(), 0.6, 9.2));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1903, Calendar.MAY, DAY).getTime(), 5.1, 12.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1903, Calendar.JUNE, DAY)
                .getTime(), 7.2, 15.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1903, Calendar.JULY, DAY)
                .getTime(), 10.1, 18));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1903, Calendar.AUGUST, DAY)
                .getTime(), 9.1, 17.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1903, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.9, 15.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1903, Calendar.OCTOBER, DAY)
                .getTime(), 6.1, 11.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1903, Calendar.NOVEMBER, DAY)
                .getTime(), 2.2, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1903, Calendar.DECEMBER, DAY)
                .getTime(), 0.3, 4.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1904, Calendar.JANUARY, DAY)
                .getTime(), 0.9, 6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1904, Calendar.FEBRUARY, DAY)
                .getTime(), -0.1, 4.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1904, Calendar.MARCH, DAY)
                .getTime(), 0.4, 6.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1904, Calendar.APRIL, DAY)
                .getTime(), 4, 12.1));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1904, Calendar.MAY, DAY).getTime(), 5.4, 13.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1904, Calendar.JUNE, DAY)
                .getTime(), 8.4, 16.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1904, Calendar.JULY, DAY)
                .getTime(), 11, 19.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1904, Calendar.AUGUST, DAY)
                .getTime(), 9.9, 18.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1904, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.4, 16.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1904, Calendar.OCTOBER, DAY)
                .getTime(), 4.9, 12.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1904, Calendar.NOVEMBER, DAY)
                .getTime(), 2.1, 8.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1904, Calendar.DECEMBER, DAY)
                .getTime(), -0.2, 5.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1905, Calendar.JANUARY, DAY)
                .getTime(), 1.2, 6.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1905, Calendar.FEBRUARY, DAY)
                .getTime(), 1.4, 7.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1905, Calendar.MARCH, DAY)
                .getTime(), 2.2, 10.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1905, Calendar.APRIL, DAY)
                .getTime(), 2.2, 9.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1905, Calendar.MAY, DAY).getTime(), 5, 13.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1905, Calendar.JUNE, DAY)
                .getTime(), 8.8, 17.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1905, Calendar.JULY, DAY)
                .getTime(), 11.4, 21.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1905, Calendar.AUGUST, DAY)
                .getTime(), 9.9, 17.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1905, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.1, 15.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1905, Calendar.OCTOBER, DAY)
                .getTime(), 3.2, 10.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1905, Calendar.NOVEMBER, DAY)
                .getTime(), 1.9, 7.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1905, Calendar.DECEMBER, DAY)
                .getTime(), 2.8, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1906, Calendar.JANUARY, DAY)
                .getTime(), 2.1, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1906, Calendar.FEBRUARY, DAY)
                .getTime(), -0.9, 5.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1906, Calendar.MARCH, DAY)
                .getTime(), 0.8, 7.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1906, Calendar.APRIL, DAY)
                .getTime(), 0.2, 11.6));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1906, Calendar.MAY, DAY).getTime(), 5.6, 12.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1906, Calendar.JUNE, DAY)
                .getTime(), 8.8, 18.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1906, Calendar.JULY, DAY)
                .getTime(), 9.7, 19.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1906, Calendar.AUGUST, DAY)
                .getTime(), 11.1, 20.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1906, Calendar.SEPTEMBER, DAY)
                .getTime(), 8, 17.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1906, Calendar.OCTOBER, DAY)
                .getTime(), 6.5, 12.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1906, Calendar.NOVEMBER, DAY)
                .getTime(), 4.6, 9.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1906, Calendar.DECEMBER, DAY)
                .getTime(), -0.1, 5.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1907, Calendar.JANUARY, DAY)
                .getTime(), 0.5, 5.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1907, Calendar.FEBRUARY, DAY)
                .getTime(), -0.7, 5.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1907, Calendar.MARCH, DAY)
                .getTime(), 0.6, 10.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1907, Calendar.APRIL, DAY)
                .getTime(), 2.9, 10.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1907, Calendar.MAY, DAY).getTime(), 5.2, 12.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1907, Calendar.JUNE, DAY)
                .getTime(), 7.7, 15.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1907, Calendar.JULY, DAY)
                .getTime(), 8.7, 16.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1907, Calendar.AUGUST, DAY)
                .getTime(), 9.2, 17.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1907, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.2, 17.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1907, Calendar.OCTOBER, DAY)
                .getTime(), 5.6, 12.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1907, Calendar.NOVEMBER, DAY)
                .getTime(), 2.5, 8.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1907, Calendar.DECEMBER, DAY)
                .getTime(), 1.2, 6.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1908, Calendar.JANUARY, DAY)
                .getTime(), -0.7, 5.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1908, Calendar.FEBRUARY, DAY)
                .getTime(), 1.4, 8.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1908, Calendar.MARCH, DAY)
                .getTime(), 0.3, 6.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1908, Calendar.APRIL, DAY)
                .getTime(), 1.6, 8.4));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1908, Calendar.MAY, DAY).getTime(), 6.9, 15.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1908, Calendar.JUNE, DAY)
                .getTime(), 7.9, 17.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1908, Calendar.JULY, DAY)
                .getTime(), 10.2, 19));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1908, Calendar.AUGUST, DAY)
                .getTime(), 9.2, 17.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1908, Calendar.SEPTEMBER, DAY)
                .getTime(), 9, 16.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1908, Calendar.OCTOBER, DAY)
                .getTime(), 7.7, 15.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1908, Calendar.NOVEMBER, DAY)
                .getTime(), 2.7, 9.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1908, Calendar.DECEMBER, DAY)
                .getTime(), -0.1, 5.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1909, Calendar.JANUARY, DAY)
                .getTime(), -0.3, 5.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1909, Calendar.FEBRUARY, DAY)
                .getTime(), -0.6, 5.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1909, Calendar.MARCH, DAY)
                .getTime(), -0.2, 5.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1909, Calendar.APRIL, DAY)
                .getTime(), 2.6, 13.1));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1909, Calendar.MAY, DAY).getTime(), 4.5, 14.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1909, Calendar.JUNE, DAY)
                .getTime(), 6.6, 15.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1909, Calendar.JULY, DAY)
                .getTime(), 10, 18));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1909, Calendar.AUGUST, DAY)
                .getTime(), 10.3, 19.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1909, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.3, 14.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1909, Calendar.OCTOBER, DAY)
                .getTime(), 5.5, 12.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1909, Calendar.NOVEMBER, DAY)
                .getTime(), 1.4, 7.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1909, Calendar.DECEMBER, DAY)
                .getTime(), 0.4, 5.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1910, Calendar.JANUARY, DAY)
                .getTime(), -0.3, 5.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1910, Calendar.FEBRUARY, DAY)
                .getTime(), 0.7, 6.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1910, Calendar.MARCH, DAY)
                .getTime(), 2, 9.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1910, Calendar.APRIL, DAY)
                .getTime(), 2, 10));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1910, Calendar.MAY, DAY).getTime(), 5.1, 13.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1910, Calendar.JUNE, DAY)
                .getTime(), 8.5, 17.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1910, Calendar.JULY, DAY)
                .getTime(), 9.5, 17));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1910, Calendar.AUGUST, DAY)
                .getTime(), 10.7, 18.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1910, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.3, 15.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1910, Calendar.OCTOBER, DAY)
                .getTime(), 7.1, 13));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1910, Calendar.NOVEMBER, DAY)
                .getTime(), -0.4, 5.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1910, Calendar.DECEMBER, DAY)
                .getTime(), 3.1, 7.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1911, Calendar.JANUARY, DAY)
                .getTime(), 0.6, 6.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1911, Calendar.FEBRUARY, DAY)
                .getTime(), 1.1, 7.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1911, Calendar.MARCH, DAY)
                .getTime(), 1.5, 6.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1911, Calendar.APRIL, DAY)
                .getTime(), 3.4, 9.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1911, Calendar.MAY, DAY).getTime(), 6.8, 16));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1911, Calendar.JUNE, DAY)
                .getTime(), 7.7, 18.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1911, Calendar.JULY, DAY)
                .getTime(), 10.3, 22.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1911, Calendar.AUGUST, DAY)
                .getTime(), 11.7, 20.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1911, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.5, 17.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1911, Calendar.OCTOBER, DAY)
                .getTime(), 5, 11.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1911, Calendar.NOVEMBER, DAY)
                .getTime(), 2.5, 8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1911, Calendar.DECEMBER, DAY)
                .getTime(), 2.3, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1912, Calendar.JANUARY, DAY)
                .getTime(), -0.2, 4.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1912, Calendar.FEBRUARY, DAY)
                .getTime(), 1, 6.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1912, Calendar.MARCH, DAY)
                .getTime(), 3.1, 9.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1912, Calendar.APRIL, DAY)
                .getTime(), 2.5, 12.5));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1912, Calendar.MAY, DAY).getTime(), 5.7, 14.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1912, Calendar.JUNE, DAY)
                .getTime(), 8.8, 16.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1912, Calendar.JULY, DAY)
                .getTime(), 10.4, 17.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1912, Calendar.AUGUST, DAY)
                .getTime(), 8.1, 15.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1912, Calendar.SEPTEMBER, DAY)
                .getTime(), 6.5, 13.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1912, Calendar.OCTOBER, DAY)
                .getTime(), 3.8, 11.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1912, Calendar.NOVEMBER, DAY)
                .getTime(), 2.7, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1912, Calendar.DECEMBER, DAY)
                .getTime(), 1.8, 8.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1913, Calendar.JANUARY, DAY)
                .getTime(), 0.1, 4.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1913, Calendar.FEBRUARY, DAY)
                .getTime(), 0.8, 7.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1913, Calendar.MARCH, DAY)
                .getTime(), 1.2, 8.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1913, Calendar.APRIL, DAY)
                .getTime(), 3.4, 10.1));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1913, Calendar.MAY, DAY).getTime(), 5.9, 13.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1913, Calendar.JUNE, DAY)
                .getTime(), 8.5, 17.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1913, Calendar.JULY, DAY)
                .getTime(), 9.5, 17.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1913, Calendar.AUGUST, DAY)
                .getTime(), 9.1, 18.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1913, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.4, 16.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1913, Calendar.OCTOBER, DAY)
                .getTime(), 6.5, 12.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1913, Calendar.NOVEMBER, DAY)
                .getTime(), 4.3, 10.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1913, Calendar.DECEMBER, DAY)
                .getTime(), 1.6, 6.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1914, Calendar.JANUARY, DAY)
                .getTime(), 0.7, 6.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1914, Calendar.FEBRUARY, DAY)
                .getTime(), 3, 9.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1914, Calendar.MARCH, DAY)
                .getTime(), 1.6, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1914, Calendar.APRIL, DAY)
                .getTime(), 3.2, 14.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1914, Calendar.MAY, DAY).getTime(), 4.9, 14.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1914, Calendar.JUNE, DAY)
                .getTime(), 7.8, 18.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1914, Calendar.JULY, DAY)
                .getTime(), 10.3, 19));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1914, Calendar.AUGUST, DAY)
                .getTime(), 10, 19.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1914, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.2, 17.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1914, Calendar.OCTOBER, DAY)
                .getTime(), 6.2, 13));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1914, Calendar.NOVEMBER, DAY)
                .getTime(), 3.1, 9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1914, Calendar.DECEMBER, DAY)
                .getTime(), 0.9, 6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1915, Calendar.JANUARY, DAY)
                .getTime(), 0.8, 5.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1915, Calendar.FEBRUARY, DAY)
                .getTime(), 0.4, 6.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1915, Calendar.MARCH, DAY)
                .getTime(), 0.8, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1915, Calendar.APRIL, DAY)
                .getTime(), 2.4, 11.3));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1915, Calendar.MAY, DAY).getTime(), 3.8, 12.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1915, Calendar.JUNE, DAY)
                .getTime(), 7.5, 17.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1915, Calendar.JULY, DAY)
                .getTime(), 9.6, 18.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1915, Calendar.AUGUST, DAY)
                .getTime(), 10, 19));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1915, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.2, 16.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1915, Calendar.OCTOBER, DAY)
                .getTime(), 4.1, 11.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1915, Calendar.NOVEMBER, DAY)
                .getTime(), -0.3, 5.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1915, Calendar.DECEMBER, DAY)
                .getTime(), 1.2, 5.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1916, Calendar.JANUARY, DAY)
                .getTime(), 3.7, 9.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1916, Calendar.FEBRUARY, DAY)
                .getTime(), -0.2, 5.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1916, Calendar.MARCH, DAY)
                .getTime(), -0.3, 4.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1916, Calendar.APRIL, DAY)
                .getTime(), 2.7, 11.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1916, Calendar.MAY, DAY).getTime(), 5.3, 14.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1916, Calendar.JUNE, DAY)
                .getTime(), 6.8, 14.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1916, Calendar.JULY, DAY)
                .getTime(), 10, 19.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1916, Calendar.AUGUST, DAY)
                .getTime(), 10.7, 20));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1916, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.6, 16.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1916, Calendar.OCTOBER, DAY)
                .getTime(), 4.9, 12.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1916, Calendar.NOVEMBER, DAY)
                .getTime(), 3.8, 9.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1916, Calendar.DECEMBER, DAY)
                .getTime(), -0.9, 4.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1917, Calendar.JANUARY, DAY)
                .getTime(), 0, 3.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1917, Calendar.FEBRUARY, DAY)
                .getTime(), -2, 3.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1917, Calendar.MARCH, DAY)
                .getTime(), -1.4, 5.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1917, Calendar.APRIL, DAY)
                .getTime(), 0.2, 8.5));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1917, Calendar.MAY, DAY).getTime(), 5.5, 15.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1917, Calendar.JUNE, DAY)
                .getTime(), 7.8, 18.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1917, Calendar.JULY, DAY)
                .getTime(), 9.9, 20.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1917, Calendar.AUGUST, DAY)
                .getTime(), 11, 18.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1917, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.9, 17.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1917, Calendar.OCTOBER, DAY)
                .getTime(), 2.8, 11.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1917, Calendar.NOVEMBER, DAY)
                .getTime(), 4.6, 10.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1917, Calendar.DECEMBER, DAY)
                .getTime(), -0.3, 4.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1918, Calendar.JANUARY, DAY)
                .getTime(), -0.3, 5.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1918, Calendar.FEBRUARY, DAY)
                .getTime(), 2.3, 8.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1918, Calendar.MARCH, DAY)
                .getTime(), 1.3, 8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1918, Calendar.APRIL, DAY)
                .getTime(), 2.4, 8.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1918, Calendar.MAY, DAY).getTime(), 6.3, 16.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1918, Calendar.JUNE, DAY)
                .getTime(), 7, 17.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1918, Calendar.JULY, DAY)
                .getTime(), 9.7, 19.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1918, Calendar.AUGUST, DAY)
                .getTime(), 10.8, 19.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1918, Calendar.SEPTEMBER, DAY)
                .getTime(), 6.4, 14.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1918, Calendar.OCTOBER, DAY)
                .getTime(), 5.3, 11.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1918, Calendar.NOVEMBER, DAY)
                .getTime(), 0.8, 8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1918, Calendar.DECEMBER, DAY)
                .getTime(), 2.3, 7.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1919, Calendar.JANUARY, DAY)
                .getTime(), -0.5, 3.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1919, Calendar.FEBRUARY, DAY)
                .getTime(), -1.7, 3.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1919, Calendar.MARCH, DAY)
                .getTime(), -1, 5.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1919, Calendar.APRIL, DAY)
                .getTime(), 2.5, 11.1));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1919, Calendar.MAY, DAY).getTime(), 5.6, 16.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1919, Calendar.JUNE, DAY)
                .getTime(), 8, 18.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1919, Calendar.JULY, DAY)
                .getTime(), 8.4, 17.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1919, Calendar.AUGUST, DAY)
                .getTime(), 9.7, 19.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1919, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.2, 17.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1919, Calendar.OCTOBER, DAY)
                .getTime(), 2.6, 11.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1919, Calendar.NOVEMBER, DAY)
                .getTime(), -0.5, 5.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1919, Calendar.DECEMBER, DAY)
                .getTime(), 0.9, 6.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1920, Calendar.JANUARY, DAY)
                .getTime(), 0.9, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1920, Calendar.FEBRUARY, DAY)
                .getTime(), 1.4, 8.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1920, Calendar.MARCH, DAY)
                .getTime(), 2, 9.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1920, Calendar.APRIL, DAY)
                .getTime(), 3.2, 9.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1920, Calendar.MAY, DAY).getTime(), 6, 14.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1920, Calendar.JUNE, DAY)
                .getTime(), 7.7, 17.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1920, Calendar.JULY, DAY)
                .getTime(), 9.6, 17));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1920, Calendar.AUGUST, DAY)
                .getTime(), 8, 17.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1920, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.3, 16.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1920, Calendar.OCTOBER, DAY)
                .getTime(), 5.5, 13));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1920, Calendar.NOVEMBER, DAY)
                .getTime(), 3.7, 9.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1920, Calendar.DECEMBER, DAY)
                .getTime(), 0.7, 6.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1921, Calendar.JANUARY, DAY)
                .getTime(), 2.3, 8.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1921, Calendar.FEBRUARY, DAY)
                .getTime(), 0.8, 7.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1921, Calendar.MARCH, DAY)
                .getTime(), 2.1, 10.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1921, Calendar.APRIL, DAY)
                .getTime(), 2.4, 12.4));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1921, Calendar.MAY, DAY).getTime(), 4.6, 15.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1921, Calendar.JUNE, DAY)
                .getTime(), 7.3, 19));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1921, Calendar.JULY, DAY)
                .getTime(), 10.5, 21.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1921, Calendar.AUGUST, DAY)
                .getTime(), 9.7, 17.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1921, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.1, 17.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1921, Calendar.OCTOBER, DAY)
                .getTime(), 7.7, 16.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1921, Calendar.NOVEMBER, DAY)
                .getTime(), 0.5, 6.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1921, Calendar.DECEMBER, DAY)
                .getTime(), 2.7, 9.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1922, Calendar.JANUARY, DAY)
                .getTime(), -1.5, 4.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1922, Calendar.FEBRUARY, DAY)
                .getTime(), -0.3, 5.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1922, Calendar.MARCH, DAY)
                .getTime(), 0.5, 6.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1922, Calendar.APRIL, DAY)
                .getTime(), -0.1, 8.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1922, Calendar.MAY, DAY).getTime(), 6.4, 16.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1922, Calendar.JUNE, DAY)
                .getTime(), 7.3, 18));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1922, Calendar.JULY, DAY)
                .getTime(), 8.1, 17));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1922, Calendar.AUGUST, DAY)
                .getTime(), 8.4, 16.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1922, Calendar.SEPTEMBER, DAY)
                .getTime(), 6.8, 14.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1922, Calendar.OCTOBER, DAY)
                .getTime(), 4.1, 11.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1922, Calendar.NOVEMBER, DAY)
                .getTime(), 2.1, 9.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1922, Calendar.DECEMBER, DAY)
                .getTime(), 1.8, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1923, Calendar.JANUARY, DAY)
                .getTime(), 2.5, 8.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1923, Calendar.FEBRUARY, DAY)
                .getTime(), 1.1, 5.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1923, Calendar.MARCH, DAY)
                .getTime(), 1.8, 8.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1923, Calendar.APRIL, DAY)
                .getTime(), 2.3, 9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1923, Calendar.MAY, DAY).getTime(), 3.4, 11.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1923, Calendar.JUNE, DAY)
                .getTime(), 7.1, 15.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1923, Calendar.JULY, DAY)
                .getTime(), 11.3, 20.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1923, Calendar.AUGUST, DAY)
                .getTime(), 10.1, 18.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1923, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.3, 15.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1923, Calendar.OCTOBER, DAY)
                .getTime(), 4.5, 12.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1923, Calendar.NOVEMBER, DAY)
                .getTime(), -0.1, 5.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1923, Calendar.DECEMBER, DAY)
                .getTime(), -0.5, 4.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1924, Calendar.JANUARY, DAY)
                .getTime(), 0.1, 5.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1924, Calendar.FEBRUARY, DAY)
                .getTime(), 0, 5.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1924, Calendar.MARCH, DAY)
                .getTime(), -2.7, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1924, Calendar.APRIL, DAY)
                .getTime(), 1.5, 9.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1924, Calendar.MAY, DAY).getTime(), 5.9, 13.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1924, Calendar.JUNE, DAY)
                .getTime(), 7.6, 16.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1924, Calendar.JULY, DAY)
                .getTime(), 10, 18.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1924, Calendar.AUGUST, DAY)
                .getTime(), 9.1, 17.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1924, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.6, 15.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1924, Calendar.OCTOBER, DAY)
                .getTime(), 5.6, 12.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1924, Calendar.NOVEMBER, DAY)
                .getTime(), 3.6, 9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1924, Calendar.DECEMBER, DAY)
                .getTime(), 3.5, 8.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1925, Calendar.JANUARY, DAY)
                .getTime(), 1.2, 6.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1925, Calendar.FEBRUARY, DAY)
                .getTime(), 0.7, 6.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1925, Calendar.MARCH, DAY)
                .getTime(), 1.3, 7.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1925, Calendar.APRIL, DAY)
                .getTime(), 2.1, 10.1));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1925, Calendar.MAY, DAY).getTime(), 6.1, 14.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1925, Calendar.JUNE, DAY)
                .getTime(), 7.9, 18.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1925, Calendar.JULY, DAY)
                .getTime(), 10.9, 21.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1925, Calendar.AUGUST, DAY)
                .getTime(), 9.8, 18.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1925, Calendar.SEPTEMBER, DAY)
                .getTime(), 6.1, 14.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1925, Calendar.OCTOBER, DAY)
                .getTime(), 4.8, 13.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1925, Calendar.NOVEMBER, DAY)
                .getTime(), -0.8, 5.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1925, Calendar.DECEMBER, DAY)
                .getTime(), -1.2, 4.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1926, Calendar.JANUARY, DAY)
                .getTime(), 0.7, 5.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1926, Calendar.FEBRUARY, DAY)
                .getTime(), 2.4, 7.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1926, Calendar.MARCH, DAY)
                .getTime(), 1.8, 8.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1926, Calendar.APRIL, DAY)
                .getTime(), 3.3, 12.6));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1926, Calendar.MAY, DAY).getTime(), 4, 12.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1926, Calendar.JUNE, DAY)
                .getTime(), 8, 17.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1926, Calendar.JULY, DAY)
                .getTime(), 11.5, 20.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1926, Calendar.AUGUST, DAY)
                .getTime(), 10.5, 20));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1926, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.6, 17.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1926, Calendar.OCTOBER, DAY)
                .getTime(), 2.9, 10.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1926, Calendar.NOVEMBER, DAY)
                .getTime(), 1.4, 7.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1926, Calendar.DECEMBER, DAY)
                .getTime(), 1.1, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1927, Calendar.JANUARY, DAY)
                .getTime(), 0.7, 6.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1927, Calendar.FEBRUARY, DAY)
                .getTime(), 0.1, 7.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1927, Calendar.MARCH, DAY)
                .getTime(), 2.4, 9.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1927, Calendar.APRIL, DAY)
                .getTime(), 2.4, 10.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1927, Calendar.MAY, DAY).getTime(), 4, 12.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1927, Calendar.JUNE, DAY)
                .getTime(), 6, 15.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1927, Calendar.JULY, DAY)
                .getTime(), 10.3, 18.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1927, Calendar.AUGUST, DAY)
                .getTime(), 9.9, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1927, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.5, 15));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1927, Calendar.OCTOBER, DAY)
                .getTime(), 5.2, 13.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1927, Calendar.NOVEMBER, DAY)
                .getTime(), 2.1, 8.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1927, Calendar.DECEMBER, DAY)
                .getTime(), -0.8, 3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1928, Calendar.JANUARY, DAY)
                .getTime(), 0.6, 7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1928, Calendar.FEBRUARY, DAY)
                .getTime(), 1.1, 8.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1928, Calendar.MARCH, DAY)
                .getTime(), 1.2, 7.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1928, Calendar.APRIL, DAY)
                .getTime(), 2.5, 10.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1928, Calendar.MAY, DAY).getTime(), 4.5, 12.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1928, Calendar.JUNE, DAY)
                .getTime(), 6.5, 15.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1928, Calendar.JULY, DAY)
                .getTime(), 9.9, 19));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1928, Calendar.AUGUST, DAY)
                .getTime(), 9.9, 18.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1928, Calendar.SEPTEMBER, DAY)
                .getTime(), 7, 15.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1928, Calendar.OCTOBER, DAY)
                .getTime(), 5, 12.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1928, Calendar.NOVEMBER, DAY)
                .getTime(), 3.7, 9.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1928, Calendar.DECEMBER, DAY)
                .getTime(), -0.7, 5.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1929, Calendar.JANUARY, DAY)
                .getTime(), -0.9, 3.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1929, Calendar.FEBRUARY, DAY)
                .getTime(), -3.6, 2.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1929, Calendar.MARCH, DAY)
                .getTime(), 0.8, 11.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1929, Calendar.APRIL, DAY)
                .getTime(), 0.9, 9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1929, Calendar.MAY, DAY).getTime(), 4.7, 14.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1929, Calendar.JUNE, DAY)
                .getTime(), 7.4, 16.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1929, Calendar.JULY, DAY)
                .getTime(), 9.5, 19.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1929, Calendar.AUGUST, DAY)
                .getTime(), 9.8, 18.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1929, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.3, 18.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1929, Calendar.OCTOBER, DAY)
                .getTime(), 4.4, 12.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1929, Calendar.NOVEMBER, DAY)
                .getTime(), 2.3, 8.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1929, Calendar.DECEMBER, DAY)
                .getTime(), 1.6, 7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1930, Calendar.JANUARY, DAY)
                .getTime(), 1, 7.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1930, Calendar.FEBRUARY, DAY)
                .getTime(), -0.6, 4.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1930, Calendar.MARCH, DAY)
                .getTime(), 0.3, 7.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1930, Calendar.APRIL, DAY)
                .getTime(), 3.7, 9.8));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1930, Calendar.MAY, DAY).getTime(), 4.5, 13));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1930, Calendar.JUNE, DAY)
                .getTime(), 8.4, 18.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1930, Calendar.JULY, DAY)
                .getTime(), 10.4, 17.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1930, Calendar.AUGUST, DAY)
                .getTime(), 10.2, 19.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1930, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.8, 15.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1930, Calendar.OCTOBER, DAY)
                .getTime(), 5.8, 12.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1930, Calendar.NOVEMBER, DAY)
                .getTime(), 1.5, 8.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1930, Calendar.DECEMBER, DAY)
                .getTime(), 0, 6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1931, Calendar.JANUARY, DAY)
                .getTime(), -0.5, 5.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1931, Calendar.FEBRUARY, DAY)
                .getTime(), -0.3, 5.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1931, Calendar.MARCH, DAY)
                .getTime(), -1.4, 6.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1931, Calendar.APRIL, DAY)
                .getTime(), 2.9, 10));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1931, Calendar.MAY, DAY).getTime(), 5.4, 14.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1931, Calendar.JUNE, DAY)
                .getTime(), 8.3, 16.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1931, Calendar.JULY, DAY)
                .getTime(), 10.6, 18.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1931, Calendar.AUGUST, DAY)
                .getTime(), 8.8, 16.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1931, Calendar.SEPTEMBER, DAY)
                .getTime(), 6.4, 14.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1931, Calendar.OCTOBER, DAY)
                .getTime(), 3.8, 12.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1931, Calendar.NOVEMBER, DAY)
                .getTime(), 3.3, 9.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1931, Calendar.DECEMBER, DAY)
                .getTime(), 0.8, 7.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1932, Calendar.JANUARY, DAY)
                .getTime(), 1.5, 8.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1932, Calendar.FEBRUARY, DAY)
                .getTime(), 1, 6.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1932, Calendar.MARCH, DAY)
                .getTime(), 0.6, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1932, Calendar.APRIL, DAY)
                .getTime(), 1.5, 9.6));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1932, Calendar.MAY, DAY).getTime(), 5.4, 11.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1932, Calendar.JUNE, DAY)
                .getTime(), 7.7, 16.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1932, Calendar.JULY, DAY)
                .getTime(), 11, 18.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1932, Calendar.AUGUST, DAY)
                .getTime(), 10.7, 19.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1932, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.6, 15.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1932, Calendar.OCTOBER, DAY)
                .getTime(), 4.1, 11));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1932, Calendar.NOVEMBER, DAY)
                .getTime(), 3.2, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1932, Calendar.DECEMBER, DAY)
                .getTime(), 3, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1933, Calendar.JANUARY, DAY)
                .getTime(), -1.2, 4.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1933, Calendar.FEBRUARY, DAY)
                .getTime(), 0.6, 6.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1933, Calendar.MARCH, DAY)
                .getTime(), 1.8, 11));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1933, Calendar.APRIL, DAY)
                .getTime(), 4.4, 12.2));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1933, Calendar.MAY, DAY).getTime(), 6.5, 13.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1933, Calendar.JUNE, DAY)
                .getTime(), 8.9, 19.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1933, Calendar.JULY, DAY)
                .getTime(), 11.9, 21.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1933, Calendar.AUGUST, DAY)
                .getTime(), 11.4, 21.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1933, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.4, 18));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1933, Calendar.OCTOBER, DAY)
                .getTime(), 6, 12.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1933, Calendar.NOVEMBER, DAY)
                .getTime(), 2.8, 8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1933, Calendar.DECEMBER, DAY)
                .getTime(), 0, 4.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1934, Calendar.JANUARY, DAY)
                .getTime(), 1.1, 7.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1934, Calendar.FEBRUARY, DAY)
                .getTime(), 1.6, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1934, Calendar.MARCH, DAY)
                .getTime(), 0.7, 8.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1934, Calendar.APRIL, DAY)
                .getTime(), 3.1, 10.2));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1934, Calendar.MAY, DAY).getTime(), 5.4, 15));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1934, Calendar.JUNE, DAY)
                .getTime(), 8.5, 17.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1934, Calendar.JULY, DAY)
                .getTime(), 11.4, 21.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1934, Calendar.AUGUST, DAY)
                .getTime(), 9.6, 18.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1934, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.3, 18.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1934, Calendar.OCTOBER, DAY)
                .getTime(), 6.3, 12.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1934, Calendar.NOVEMBER, DAY)
                .getTime(), 3.3, 8.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1934, Calendar.DECEMBER, DAY)
                .getTime(), 4.5, 9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1935, Calendar.JANUARY, DAY)
                .getTime(), 1.1, 7.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1935, Calendar.FEBRUARY, DAY)
                .getTime(), 1.9, 8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1935, Calendar.MARCH, DAY)
                .getTime(), 2.9, 9.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1935, Calendar.APRIL, DAY)
                .getTime(), 3.2, 10.2));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1935, Calendar.MAY, DAY).getTime(), 4.1, 12.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1935, Calendar.JUNE, DAY)
                .getTime(), 9.1, 18.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1935, Calendar.JULY, DAY)
                .getTime(), 10.6, 21.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1935, Calendar.AUGUST, DAY)
                .getTime(), 10.7, 21.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1935, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.9, 16.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1935, Calendar.OCTOBER, DAY)
                .getTime(), 4.7, 12.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1935, Calendar.NOVEMBER, DAY)
                .getTime(), 3, 8.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1935, Calendar.DECEMBER, DAY)
                .getTime(), 0.4, 4.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1936, Calendar.JANUARY, DAY)
                .getTime(), 0.6, 5.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1936, Calendar.FEBRUARY, DAY)
                .getTime(), -1.5, 4.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1936, Calendar.MARCH, DAY)
                .getTime(), 2.9, 9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1936, Calendar.APRIL, DAY)
                .getTime(), 1.5, 9.8));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1936, Calendar.MAY, DAY).getTime(), 5.7, 13.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1936, Calendar.JUNE, DAY)
                .getTime(), 7.8, 17.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1936, Calendar.JULY, DAY)
                .getTime(), 11, 18.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1936, Calendar.AUGUST, DAY)
                .getTime(), 10.9, 20.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1936, Calendar.SEPTEMBER, DAY)
                .getTime(), 10.4, 16.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1936, Calendar.OCTOBER, DAY)
                .getTime(), 4.9, 12.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1936, Calendar.NOVEMBER, DAY)
                .getTime(), 1.7, 8.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1936, Calendar.DECEMBER, DAY)
                .getTime(), 1.7, 7.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1937, Calendar.JANUARY, DAY)
                .getTime(), 1.6, 6.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1937, Calendar.FEBRUARY, DAY)
                .getTime(), 1.1, 6.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1937, Calendar.MARCH, DAY)
                .getTime(), -0.4, 5.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1937, Calendar.APRIL, DAY)
                .getTime(), 4.4, 10.8));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1937, Calendar.MAY, DAY).getTime(), 6.6, 15.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1937, Calendar.JUNE, DAY)
                .getTime(), 9.1, 17.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1937, Calendar.JULY, DAY)
                .getTime(), 11.4, 19.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1937, Calendar.AUGUST, DAY)
                .getTime(), 11, 20.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1937, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.7, 16.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1937, Calendar.OCTOBER, DAY)
                .getTime(), 6, 13));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1937, Calendar.NOVEMBER, DAY)
                .getTime(), 3, 8.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1937, Calendar.DECEMBER, DAY)
                .getTime(), -0.4, 4.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1938, Calendar.JANUARY, DAY)
                .getTime(), 2.5, 7.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1938, Calendar.FEBRUARY, DAY)
                .getTime(), 2.2, 7.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1938, Calendar.MARCH, DAY)
                .getTime(), 5.6, 13.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1938, Calendar.APRIL, DAY)
                .getTime(), 2.8, 11.6));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1938, Calendar.MAY, DAY).getTime(), 4.8, 14));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1938, Calendar.JUNE, DAY)
                .getTime(), 8.8, 17.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1938, Calendar.JULY, DAY)
                .getTime(), 10, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1938, Calendar.AUGUST, DAY)
                .getTime(), 10.3, 18.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1938, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.7, 17.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1938, Calendar.OCTOBER, DAY)
                .getTime(), 6.2, 13));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1938, Calendar.NOVEMBER, DAY)
                .getTime(), 5, 10.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1938, Calendar.DECEMBER, DAY)
                .getTime(), 1.4, 6.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1939, Calendar.JANUARY, DAY)
                .getTime(), 0.6, 5.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1939, Calendar.FEBRUARY, DAY)
                .getTime(), 2.3, 8.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1939, Calendar.MARCH, DAY)
                .getTime(), 2, 8.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1939, Calendar.APRIL, DAY)
                .getTime(), 3.9, 11.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1939, Calendar.MAY, DAY).getTime(), 5.6, 15.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1939, Calendar.JUNE, DAY)
                .getTime(), 7.9, 18.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1939, Calendar.JULY, DAY)
                .getTime(), 10.4, 19));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1939, Calendar.AUGUST, DAY)
                .getTime(), 11.5, 19.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1939, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.3, 17.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1939, Calendar.OCTOBER, DAY)
                .getTime(), 4.1, 11.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1939, Calendar.NOVEMBER, DAY)
                .getTime(), 4.5, 10.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1939, Calendar.DECEMBER, DAY)
                .getTime(), 1.3, 5.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1940, Calendar.JANUARY, DAY)
                .getTime(), -4.6, 1.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1940, Calendar.FEBRUARY, DAY)
                .getTime(), -0.8, 3.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1940, Calendar.MARCH, DAY)
                .getTime(), 1.5, 9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1940, Calendar.APRIL, DAY)
                .getTime(), 2.7, 10.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1940, Calendar.MAY, DAY).getTime(), 5.6, 16.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1940, Calendar.JUNE, DAY)
                .getTime(), 9.2, 22.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1940, Calendar.JULY, DAY)
                .getTime(), 9, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1940, Calendar.AUGUST, DAY)
                .getTime(), 9.5, 18.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1940, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.1, 16.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1940, Calendar.OCTOBER, DAY)
                .getTime(), 5.8, 11.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1940, Calendar.NOVEMBER, DAY)
                .getTime(), 3.3, 8.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1940, Calendar.DECEMBER, DAY)
                .getTime(), 1.4, 5.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1941, Calendar.JANUARY, DAY)
                .getTime(), -2.7, 1.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1941, Calendar.FEBRUARY, DAY)
                .getTime(), -1.6, 4.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1941, Calendar.MARCH, DAY)
                .getTime(), -0.1, 7.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1941, Calendar.APRIL, DAY)
                .getTime(), 2.1, 8.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1941, Calendar.MAY, DAY).getTime(), 3.9, 12.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1941, Calendar.JUNE, DAY)
                .getTime(), 9, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1941, Calendar.JULY, DAY)
                .getTime(), 11.5, 22));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1941, Calendar.AUGUST, DAY)
                .getTime(), 9.8, 18.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1941, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.9, 18.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1941, Calendar.OCTOBER, DAY)
                .getTime(), 5.8, 13.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1941, Calendar.NOVEMBER, DAY)
                .getTime(), 2.5, 8.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1941, Calendar.DECEMBER, DAY)
                .getTime(), 2.8, 8.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1942, Calendar.JANUARY, DAY)
                .getTime(), -1.7, 3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1942, Calendar.FEBRUARY, DAY)
                .getTime(), -3.4, 2.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1942, Calendar.MARCH, DAY)
                .getTime(), -0.6, 7.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1942, Calendar.APRIL, DAY)
                .getTime(), 2.6, 12.3));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1942, Calendar.MAY, DAY).getTime(), 4.2, 14.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1942, Calendar.JUNE, DAY)
                .getTime(), 7.9, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1942, Calendar.JULY, DAY)
                .getTime(), 9.3, 19.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1942, Calendar.AUGUST, DAY)
                .getTime(), 11.1, 19.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1942, Calendar.SEPTEMBER, DAY)
                .getTime(), 8, 17));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1942, Calendar.OCTOBER, DAY)
                .getTime(), 6, 14));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1942, Calendar.NOVEMBER, DAY)
                .getTime(), 1.7, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1942, Calendar.DECEMBER, DAY)
                .getTime(), 1.4, 8.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1943, Calendar.JANUARY, DAY)
                .getTime(), -0.5, 5.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1943, Calendar.FEBRUARY, DAY)
                .getTime(), 1, 9.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1943, Calendar.MARCH, DAY)
                .getTime(), 1.1, 10.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1943, Calendar.APRIL, DAY)
                .getTime(), 4.5, 14));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1943, Calendar.MAY, DAY).getTime(), 4.9, 16.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1943, Calendar.JUNE, DAY)
                .getTime(), 8.3, 18.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1943, Calendar.JULY, DAY)
                .getTime(), 9, 19.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1943, Calendar.AUGUST, DAY)
                .getTime(), 9.6, 18.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1943, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.3, 16.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1943, Calendar.OCTOBER, DAY)
                .getTime(), 5.1, 13.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1943, Calendar.NOVEMBER, DAY)
                .getTime(), 2.3, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1943, Calendar.DECEMBER, DAY)
                .getTime(), 0.4, 7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1944, Calendar.JANUARY, DAY)
                .getTime(), 1.6, 8.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1944, Calendar.FEBRUARY, DAY)
                .getTime(), 0.2, 6.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1944, Calendar.MARCH, DAY)
                .getTime(), 0.5, 9.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1944, Calendar.APRIL, DAY)
                .getTime(), 4.1, 13.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1944, Calendar.MAY, DAY).getTime(), 4.9, 15));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1944, Calendar.JUNE, DAY)
                .getTime(), 7.2, 16.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1944, Calendar.JULY, DAY)
                .getTime(), 10.4, 19.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1944, Calendar.AUGUST, DAY)
                .getTime(), 11.1, 20.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1944, Calendar.SEPTEMBER, DAY)
                .getTime(), 6.9, 16));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1944, Calendar.OCTOBER, DAY)
                .getTime(), 5.1, 11.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1944, Calendar.NOVEMBER, DAY)
                .getTime(), 2.3, 8.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1944, Calendar.DECEMBER, DAY)
                .getTime(), 1.2, 6.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1945, Calendar.JANUARY, DAY)
                .getTime(), -2.5, 3.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1945, Calendar.FEBRUARY, DAY)
                .getTime(), 3.3, 9.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1945, Calendar.MARCH, DAY)
                .getTime(), 2.8, 12.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1945, Calendar.APRIL, DAY)
                .getTime(), 4, 13.8));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1945, Calendar.MAY, DAY).getTime(), 6.1, 15.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1945, Calendar.JUNE, DAY)
                .getTime(), 9.1, 17.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1945, Calendar.JULY, DAY)
                .getTime(), 11.4, 21.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1945, Calendar.AUGUST, DAY)
                .getTime(), 10.6, 19.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1945, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.1, 18));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1945, Calendar.OCTOBER, DAY)
                .getTime(), 7, 15.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1945, Calendar.NOVEMBER, DAY)
                .getTime(), 4.7, 10));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1945, Calendar.DECEMBER, DAY)
                .getTime(), 1.8, 6.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1946, Calendar.JANUARY, DAY)
                .getTime(), -0.4, 5.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1946, Calendar.FEBRUARY, DAY)
                .getTime(), 2.2, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1946, Calendar.MARCH, DAY)
                .getTime(), 1.4, 8.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1946, Calendar.APRIL, DAY)
                .getTime(), 4.6, 13.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1946, Calendar.MAY, DAY).getTime(), 4.8, 13.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1946, Calendar.JUNE, DAY)
                .getTime(), 7.9, 17.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1946, Calendar.JULY, DAY)
                .getTime(), 10.8, 20.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1946, Calendar.AUGUST, DAY)
                .getTime(), 9.4, 18));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1946, Calendar.SEPTEMBER, DAY)
                .getTime(), 9, 16.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1946, Calendar.OCTOBER, DAY)
                .getTime(), 5.9, 11.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1946, Calendar.NOVEMBER, DAY)
                .getTime(), 4.7, 9.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1946, Calendar.DECEMBER, DAY)
                .getTime(), 0.7, 5.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1947, Calendar.JANUARY, DAY)
                .getTime(), 0.1, 4.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1947, Calendar.FEBRUARY, DAY)
                .getTime(), -2.9, 0.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1947, Calendar.MARCH, DAY)
                .getTime(), -1.1, 4.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1947, Calendar.APRIL, DAY)
                .getTime(), 4, 11.1));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1947, Calendar.MAY, DAY).getTime(), 6.6, 16.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1947, Calendar.JUNE, DAY)
                .getTime(), 10.1, 18.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1947, Calendar.JULY, DAY)
                .getTime(), 12, 20.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1947, Calendar.AUGUST, DAY)
                .getTime(), 11.4, 23));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1947, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.8, 19.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1947, Calendar.OCTOBER, DAY)
                .getTime(), 6.5, 14.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1947, Calendar.NOVEMBER, DAY)
                .getTime(), 2.7, 9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1947, Calendar.DECEMBER, DAY)
                .getTime(), 2.2, 7.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1948, Calendar.JANUARY, DAY)
                .getTime(), 1.6, 6.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1948, Calendar.FEBRUARY, DAY)
                .getTime(), 1.7, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1948, Calendar.MARCH, DAY)
                .getTime(), 3.1, 11.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1948, Calendar.APRIL, DAY)
                .getTime(), 3.8, 12.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1948, Calendar.MAY, DAY).getTime(), 4.6, 14.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1948, Calendar.JUNE, DAY)
                .getTime(), 8.2, 16.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1948, Calendar.JULY, DAY)
                .getTime(), 10.5, 19.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1948, Calendar.AUGUST, DAY)
                .getTime(), 10, 17.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1948, Calendar.SEPTEMBER, DAY)
                .getTime(), 9, 16.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1948, Calendar.OCTOBER, DAY)
                .getTime(), 5.6, 13.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1948, Calendar.NOVEMBER, DAY)
                .getTime(), 3.4, 9.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1948, Calendar.DECEMBER, DAY)
                .getTime(), 1.6, 7.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1949, Calendar.JANUARY, DAY)
                .getTime(), 1.1, 7.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1949, Calendar.FEBRUARY, DAY)
                .getTime(), 1.7, 8.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1949, Calendar.MARCH, DAY)
                .getTime(), 1.3, 8.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1949, Calendar.APRIL, DAY)
                .getTime(), 5.6, 14));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1949, Calendar.MAY, DAY).getTime(), 5.1, 15.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1949, Calendar.JUNE, DAY)
                .getTime(), 7.9, 19.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1949, Calendar.JULY, DAY)
                .getTime(), 11.2, 21.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1949, Calendar.AUGUST, DAY)
                .getTime(), 11.3, 20.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1949, Calendar.SEPTEMBER, DAY)
                .getTime(), 11.1, 19.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1949, Calendar.OCTOBER, DAY)
                .getTime(), 7.3, 14.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1949, Calendar.NOVEMBER, DAY)
                .getTime(), 3.3, 8.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1949, Calendar.DECEMBER, DAY)
                .getTime(), 2.3, 7.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1950, Calendar.JANUARY, DAY)
                .getTime(), 1.8, 6.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1950, Calendar.FEBRUARY, DAY)
                .getTime(), 0.8, 7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1950, Calendar.MARCH, DAY)
                .getTime(), 2.8, 11.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1950, Calendar.APRIL, DAY)
                .getTime(), 2.6, 10.6));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1950, Calendar.MAY, DAY).getTime(), 5.9, 12.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1950, Calendar.JUNE, DAY)
                .getTime(), 9.8, 20.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1950, Calendar.JULY, DAY)
                .getTime(), 10.9, 19.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1950, Calendar.AUGUST, DAY)
                .getTime(), 9.8, 18.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1950, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.4, 15.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1950, Calendar.OCTOBER, DAY)
                .getTime(), 5.9, 12.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1950, Calendar.NOVEMBER, DAY)
                .getTime(), 2.5, 8.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1950, Calendar.DECEMBER, DAY)
                .getTime(), -1.2, 3.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1951, Calendar.JANUARY, DAY)
                .getTime(), -0.1, 5.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1951, Calendar.FEBRUARY, DAY)
                .getTime(), 0.2, 5.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1951, Calendar.MARCH, DAY)
                .getTime(), -0.3, 7.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1951, Calendar.APRIL, DAY)
                .getTime(), 1.7, 10.3));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1951, Calendar.MAY, DAY).getTime(), 4.6, 11.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1951, Calendar.JUNE, DAY)
                .getTime(), 7.4, 16.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1951, Calendar.JULY, DAY)
                .getTime(), 10.7, 20.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1951, Calendar.AUGUST, DAY)
                .getTime(), 10, 18.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1951, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.9, 17.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1951, Calendar.OCTOBER, DAY)
                .getTime(), 5.9, 13.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1951, Calendar.NOVEMBER, DAY)
                .getTime(), 5, 10.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1951, Calendar.DECEMBER, DAY)
                .getTime(), 1.3, 7.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1952, Calendar.JANUARY, DAY)
                .getTime(), -0.8, 4.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1952, Calendar.FEBRUARY, DAY)
                .getTime(), 0.5, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1952, Calendar.MARCH, DAY)
                .getTime(), 2.2, 8.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1952, Calendar.APRIL, DAY)
                .getTime(), 3.7, 13.3));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1952, Calendar.MAY, DAY).getTime(), 7.4, 17.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1952, Calendar.JUNE, DAY)
                .getTime(), 8.7, 18.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1952, Calendar.JULY, DAY)
                .getTime(), 11.1, 20.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1952, Calendar.AUGUST, DAY)
                .getTime(), 10.7, 19.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1952, Calendar.SEPTEMBER, DAY)
                .getTime(), 6.8, 14.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1952, Calendar.OCTOBER, DAY)
                .getTime(), 5.3, 11.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1952, Calendar.NOVEMBER, DAY)
                .getTime(), 1.1, 6.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1952, Calendar.DECEMBER, DAY)
                .getTime(), 0.2, 5.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1953, Calendar.JANUARY, DAY)
                .getTime(), 1.5, 6.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1953, Calendar.FEBRUARY, DAY)
                .getTime(), 1.6, 7.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1953, Calendar.MARCH, DAY)
                .getTime(), 0.6, 11.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1953, Calendar.APRIL, DAY)
                .getTime(), 1.8, 10.3));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1953, Calendar.MAY, DAY).getTime(), 7.5, 16.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1953, Calendar.JUNE, DAY)
                .getTime(), 8.6, 16.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1953, Calendar.JULY, DAY)
                .getTime(), 10.4, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1953, Calendar.AUGUST, DAY)
                .getTime(), 10.6, 19.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1953, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.1, 17.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1953, Calendar.OCTOBER, DAY)
                .getTime(), 4.5, 12.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1953, Calendar.NOVEMBER, DAY)
                .getTime(), 5.3, 10.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1953, Calendar.DECEMBER, DAY)
                .getTime(), 3.4, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1954, Calendar.JANUARY, DAY)
                .getTime(), 0.2, 5.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1954, Calendar.FEBRUARY, DAY)
                .getTime(), -1.3, 3.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1954, Calendar.MARCH, DAY)
                .getTime(), 1.5, 7.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1954, Calendar.APRIL, DAY)
                .getTime(), 2.7, 11.1));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1954, Calendar.MAY, DAY).getTime(), 6.4, 14.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1954, Calendar.JUNE, DAY)
                .getTime(), 8.9, 15.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1954, Calendar.JULY, DAY)
                .getTime(), 9.7, 17.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1954, Calendar.AUGUST, DAY)
                .getTime(), 10, 16.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1954, Calendar.SEPTEMBER, DAY)
                .getTime(), 6.9, 16));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1954, Calendar.OCTOBER, DAY)
                .getTime(), 7.5, 14.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1954, Calendar.NOVEMBER, DAY)
                .getTime(), 3.1, 9.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1954, Calendar.DECEMBER, DAY)
                .getTime(), 2.9, 8.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1955, Calendar.JANUARY, DAY)
                .getTime(), -0.7, 3.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1955, Calendar.FEBRUARY, DAY)
                .getTime(), -2.2, 2.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1955, Calendar.MARCH, DAY)
                .getTime(), -0.7, 6.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1955, Calendar.APRIL, DAY)
                .getTime(), 4.1, 13.3));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1955, Calendar.MAY, DAY).getTime(), 4.1, 12.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1955, Calendar.JUNE, DAY)
                .getTime(), 7.7, 15.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1955, Calendar.JULY, DAY)
                .getTime(), 10.7, 22.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1955, Calendar.AUGUST, DAY)
                .getTime(), 11.6, 21.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1955, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.9, 18));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1955, Calendar.OCTOBER, DAY)
                .getTime(), 4.5, 12.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1955, Calendar.NOVEMBER, DAY)
                .getTime(), 4.4, 9.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1955, Calendar.DECEMBER, DAY)
                .getTime(), 1.3, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1956, Calendar.JANUARY, DAY)
                .getTime(), -0.3, 5.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1956, Calendar.FEBRUARY, DAY)
                .getTime(), -3.1, 3.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1956, Calendar.MARCH, DAY)
                .getTime(), 1.6, 8.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1956, Calendar.APRIL, DAY)
                .getTime(), 0.7, 10.2));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1956, Calendar.MAY, DAY).getTime(), 5.8, 16.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1956, Calendar.JUNE, DAY)
                .getTime(), 7.9, 16));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1956, Calendar.JULY, DAY)
                .getTime(), 10.9, 18.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1956, Calendar.AUGUST, DAY)
                .getTime(), 8.6, 16.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1956, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.3, 16.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1956, Calendar.OCTOBER, DAY)
                .getTime(), 5.8, 12.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1956, Calendar.NOVEMBER, DAY)
                .getTime(), 2.9, 8.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1956, Calendar.DECEMBER, DAY)
                .getTime(), 2.3, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1957, Calendar.JANUARY, DAY)
                .getTime(), 2.2, 7.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1957, Calendar.FEBRUARY, DAY)
                .getTime(), 0.2, 7.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1957, Calendar.MARCH, DAY)
                .getTime(), 4.4, 11.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1957, Calendar.APRIL, DAY)
                .getTime(), 3.1, 11.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1957, Calendar.MAY, DAY).getTime(), 4.8, 13.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1957, Calendar.JUNE, DAY)
                .getTime(), 7.7, 19.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1957, Calendar.JULY, DAY)
                .getTime(), 11.9, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1957, Calendar.AUGUST, DAY)
                .getTime(), 10.8, 17.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1957, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.5, 14.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1957, Calendar.OCTOBER, DAY)
                .getTime(), 5.6, 13.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1957, Calendar.NOVEMBER, DAY)
                .getTime(), 4, 9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1957, Calendar.DECEMBER, DAY)
                .getTime(), 1.2, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1958, Calendar.JANUARY, DAY)
                .getTime(), -0.8, 5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1958, Calendar.FEBRUARY, DAY)
                .getTime(), 0.4, 6.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1958, Calendar.MARCH, DAY)
                .getTime(), -0.7, 5.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1958, Calendar.APRIL, DAY)
                .getTime(), 2.5, 10.8));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1958, Calendar.MAY, DAY).getTime(), 5, 13.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1958, Calendar.JUNE, DAY)
                .getTime(), 8.2, 15.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1958, Calendar.JULY, DAY)
                .getTime(), 10.2, 19.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1958, Calendar.AUGUST, DAY)
                .getTime(), 10.6, 19.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1958, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.9, 17.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1958, Calendar.OCTOBER, DAY)
                .getTime(), 5.8, 13.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1958, Calendar.NOVEMBER, DAY)
                .getTime(), 2.3, 8.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1958, Calendar.DECEMBER, DAY)
                .getTime(), 1.7, 6.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1959, Calendar.JANUARY, DAY)
                .getTime(), -2.2, 3.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1959, Calendar.FEBRUARY, DAY)
                .getTime(), 0.8, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1959, Calendar.MARCH, DAY)
                .getTime(), 3.1, 9.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1959, Calendar.APRIL, DAY)
                .getTime(), 3.7, 13));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1959, Calendar.MAY, DAY).getTime(), 6.1, 16.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1959, Calendar.JUNE, DAY)
                .getTime(), 9.1, 19));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1959, Calendar.JULY, DAY)
                .getTime(), 10.9, 21.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1959, Calendar.AUGUST, DAY)
                .getTime(), 11.2, 21.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1959, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.8, 19.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1959, Calendar.OCTOBER, DAY)
                .getTime(), 7.5, 15.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1959, Calendar.NOVEMBER, DAY)
                .getTime(), 3.2, 9.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1959, Calendar.DECEMBER, DAY)
                .getTime(), 2.2, 7.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1960, Calendar.JANUARY, DAY)
                .getTime(), 0.4, 6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1960, Calendar.FEBRUARY, DAY)
                .getTime(), -0.2, 5.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1960, Calendar.MARCH, DAY)
                .getTime(), 2.6, 7.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1960, Calendar.APRIL, DAY)
                .getTime(), 3.8, 13.1));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1960, Calendar.MAY, DAY).getTime(), 6.2, 16.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1960, Calendar.JUNE, DAY)
                .getTime(), 9.6, 20.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1960, Calendar.JULY, DAY)
                .getTime(), 9.8, 18.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1960, Calendar.AUGUST, DAY)
                .getTime(), 9.5, 18.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1960, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.5, 16.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1960, Calendar.OCTOBER, DAY)
                .getTime(), 7.1, 12.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1960, Calendar.NOVEMBER, DAY)
                .getTime(), 2.6, 8.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1960, Calendar.DECEMBER, DAY)
                .getTime(), 0.8, 6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1961, Calendar.JANUARY, DAY)
                .getTime(), 0.1, 5.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1961, Calendar.FEBRUARY, DAY)
                .getTime(), 2.7, 9.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1961, Calendar.MARCH, DAY)
                .getTime(), 3.8, 12.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1961, Calendar.APRIL, DAY)
                .getTime(), 4.8, 11.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1961, Calendar.MAY, DAY).getTime(), 5.8, 13.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1961, Calendar.JUNE, DAY)
                .getTime(), 8.9, 18.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1961, Calendar.JULY, DAY)
                .getTime(), 9.9, 18));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1961, Calendar.AUGUST, DAY)
                .getTime(), 9.6, 19.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1961, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.6, 18.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1961, Calendar.OCTOBER, DAY)
                .getTime(), 6.2, 13.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1961, Calendar.NOVEMBER, DAY)
                .getTime(), 2.4, 8.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1961, Calendar.DECEMBER, DAY)
                .getTime(), -1.8, 4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1962, Calendar.JANUARY, DAY)
                .getTime(), 0.7, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1962, Calendar.FEBRUARY, DAY)
                .getTime(), 1.3, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1962, Calendar.MARCH, DAY)
                .getTime(), -1.8, 5.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1962, Calendar.APRIL, DAY)
                .getTime(), 2.7, 11.3));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1962, Calendar.MAY, DAY).getTime(), 5.5, 13.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1962, Calendar.JUNE, DAY)
                .getTime(), 7.5, 17.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1962, Calendar.JULY, DAY)
                .getTime(), 9.2, 17.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1962, Calendar.AUGUST, DAY)
                .getTime(), 9.3, 17.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1962, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.9, 15.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1962, Calendar.OCTOBER, DAY)
                .getTime(), 6.2, 13.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1962, Calendar.NOVEMBER, DAY)
                .getTime(), 1.4, 7.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1962, Calendar.DECEMBER, DAY)
                .getTime(), -2.2, 4.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1963, Calendar.JANUARY, DAY)
                .getTime(), -3.2, 2.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1963, Calendar.FEBRUARY, DAY)
                .getTime(), -3.9, 1.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1963, Calendar.MARCH, DAY)
                .getTime(), 1.2, 8.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1963, Calendar.APRIL, DAY)
                .getTime(), 4.4, 11.4));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1963, Calendar.MAY, DAY).getTime(), 5.7, 14.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1963, Calendar.JUNE, DAY)
                .getTime(), 9.6, 17.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1963, Calendar.JULY, DAY)
                .getTime(), 9.8, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1963, Calendar.AUGUST, DAY)
                .getTime(), 9.2, 17.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1963, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.3, 16.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1963, Calendar.OCTOBER, DAY)
                .getTime(), 6.3, 13.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1963, Calendar.NOVEMBER, DAY)
                .getTime(), 4, 9.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1963, Calendar.DECEMBER, DAY)
                .getTime(), 0.2, 5.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1964, Calendar.JANUARY, DAY)
                .getTime(), 0.1, 6.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1964, Calendar.FEBRUARY, DAY)
                .getTime(), 0.6, 6.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1964, Calendar.MARCH, DAY)
                .getTime(), 0.8, 5.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1964, Calendar.APRIL, DAY)
                .getTime(), 4.7, 12.1));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1964, Calendar.MAY, DAY).getTime(), 7.4, 16.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1964, Calendar.JUNE, DAY)
                .getTime(), 8.8, 16.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1964, Calendar.JULY, DAY)
                .getTime(), 10.2, 19.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1964, Calendar.AUGUST, DAY)
                .getTime(), 9.7, 19));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1964, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.2, 18));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1964, Calendar.OCTOBER, DAY)
                .getTime(), 4.5, 12.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1964, Calendar.NOVEMBER, DAY)
                .getTime(), 2.9, 9.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1964, Calendar.DECEMBER, DAY)
                .getTime(), -1.3, 5.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1965, Calendar.JANUARY, DAY)
                .getTime(), -0.5, 5.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1965, Calendar.FEBRUARY, DAY)
                .getTime(), 0.7, 6.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1965, Calendar.MARCH, DAY)
                .getTime(), -0.4, 7.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1965, Calendar.APRIL, DAY)
                .getTime(), 2.6, 11.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1965, Calendar.MAY, DAY).getTime(), 5.7, 14.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1965, Calendar.JUNE, DAY)
                .getTime(), 8.5, 18.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1965, Calendar.JULY, DAY)
                .getTime(), 8.3, 16.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1965, Calendar.AUGUST, DAY)
                .getTime(), 8.7, 18.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1965, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.4, 15.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1965, Calendar.OCTOBER, DAY)
                .getTime(), 6.3, 13.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1965, Calendar.NOVEMBER, DAY)
                .getTime(), 0.6, 6.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1965, Calendar.DECEMBER, DAY)
                .getTime(), -0.4, 5.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1966, Calendar.JANUARY, DAY)
                .getTime(), -0.8, 3.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1966, Calendar.FEBRUARY, DAY)
                .getTime(), 0.6, 6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1966, Calendar.MARCH, DAY)
                .getTime(), 2.2, 10.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1966, Calendar.APRIL, DAY)
                .getTime(), 2.3, 7.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1966, Calendar.MAY, DAY).getTime(), 5.3, 15.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1966, Calendar.JUNE, DAY)
                .getTime(), 10, 18.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1966, Calendar.JULY, DAY)
                .getTime(), 9.5, 18.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1966, Calendar.AUGUST, DAY)
                .getTime(), 9.8, 17.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1966, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.3, 17.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1966, Calendar.OCTOBER, DAY)
                .getTime(), 5.7, 12.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1966, Calendar.NOVEMBER, DAY)
                .getTime(), 2.2, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1966, Calendar.DECEMBER, DAY)
                .getTime(), 0.9, 6.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1967, Calendar.JANUARY, DAY)
                .getTime(), 0.2, 6.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1967, Calendar.FEBRUARY, DAY)
                .getTime(), 2.2, 7.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1967, Calendar.MARCH, DAY)
                .getTime(), 3.2, 9.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1967, Calendar.APRIL, DAY)
                .getTime(), 3.2, 11.5));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1967, Calendar.MAY, DAY).getTime(), 4.8, 12.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1967, Calendar.JUNE, DAY)
                .getTime(), 8, 17.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1967, Calendar.JULY, DAY)
                .getTime(), 10.5, 19.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1967, Calendar.AUGUST, DAY)
                .getTime(), 10.2, 19));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1967, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.5, 16.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1967, Calendar.OCTOBER, DAY)
                .getTime(), 6.1, 12.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1967, Calendar.NOVEMBER, DAY)
                .getTime(), 0.8, 8.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1967, Calendar.DECEMBER, DAY)
                .getTime(), 0.2, 7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1968, Calendar.JANUARY, DAY)
                .getTime(), 0.2, 6.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1968, Calendar.FEBRUARY, DAY)
                .getTime(), -2, 4.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1968, Calendar.MARCH, DAY)
                .getTime(), 2.1, 9.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1968, Calendar.APRIL, DAY)
                .getTime(), 2.2, 12.2));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1968, Calendar.MAY, DAY).getTime(), 3.6, 12.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1968, Calendar.JUNE, DAY)
                .getTime(), 8.4, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1968, Calendar.JULY, DAY)
                .getTime(), 9.6, 16.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1968, Calendar.AUGUST, DAY)
                .getTime(), 10.7, 17.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1968, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.2, 17));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1968, Calendar.OCTOBER, DAY)
                .getTime(), 8.6, 14.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1968, Calendar.NOVEMBER, DAY)
                .getTime(), 3.9, 7.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1968, Calendar.DECEMBER, DAY)
                .getTime(), 0.4, 4.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1969, Calendar.JANUARY, DAY)
                .getTime(), 1, 7.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1969, Calendar.FEBRUARY, DAY)
                .getTime(), -2.6, 3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1969, Calendar.MARCH, DAY)
                .getTime(), -0.5, 5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1969, Calendar.APRIL, DAY)
                .getTime(), 2.1, 10.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1969, Calendar.MAY, DAY).getTime(), 5.9, 13.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1969, Calendar.JUNE, DAY)
                .getTime(), 8.1, 18.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1969, Calendar.JULY, DAY)
                .getTime(), 11.4, 20.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1969, Calendar.AUGUST, DAY)
                .getTime(), 11.7, 19.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1969, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.9, 17.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1969, Calendar.OCTOBER, DAY)
                .getTime(), 8.7, 15.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1969, Calendar.NOVEMBER, DAY)
                .getTime(), 1, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1969, Calendar.DECEMBER, DAY)
                .getTime(), 0.3, 5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1970, Calendar.JANUARY, DAY)
                .getTime(), -0.2, 5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1970, Calendar.FEBRUARY, DAY)
                .getTime(), -1.2, 5.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1970, Calendar.MARCH, DAY)
                .getTime(), -0.3, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1970, Calendar.APRIL, DAY)
                .getTime(), 2, 9.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1970, Calendar.MAY, DAY).getTime(), 7.2, 16));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1970, Calendar.JUNE, DAY)
                .getTime(), 9.5, 20.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1970, Calendar.JULY, DAY)
                .getTime(), 10.8, 18.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1970, Calendar.AUGUST, DAY)
                .getTime(), 11.3, 20.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1970, Calendar.SEPTEMBER, DAY)
                .getTime(), 10, 17.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1970, Calendar.OCTOBER, DAY)
                .getTime(), 6.3, 13.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1970, Calendar.NOVEMBER, DAY)
                .getTime(), 3, 9.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1970, Calendar.DECEMBER, DAY)
                .getTime(), 2, 6.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1971, Calendar.JANUARY, DAY)
                .getTime(), 1.2, 6.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1971, Calendar.FEBRUARY, DAY)
                .getTime(), 1.3, 7.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1971, Calendar.MARCH, DAY)
                .getTime(), 1.8, 8.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1971, Calendar.APRIL, DAY)
                .getTime(), 3.5, 10.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1971, Calendar.MAY, DAY).getTime(), 5.9, 15.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1971, Calendar.JUNE, DAY)
                .getTime(), 7.6, 14.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1971, Calendar.JULY, DAY)
                .getTime(), 11.1, 20.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1971, Calendar.AUGUST, DAY)
                .getTime(), 10.9, 18.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1971, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.3, 18.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1971, Calendar.OCTOBER, DAY)
                .getTime(), 6.5, 14.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1971, Calendar.NOVEMBER, DAY)
                .getTime(), 2.6, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1971, Calendar.DECEMBER, DAY)
                .getTime(), 3.9, 9.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1972, Calendar.JANUARY, DAY)
                .getTime(), 1.2, 5.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1972, Calendar.FEBRUARY, DAY)
                .getTime(), 1, 5.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1972, Calendar.MARCH, DAY)
                .getTime(), 1.9, 8.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1972, Calendar.APRIL, DAY)
                .getTime(), 4.4, 11.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1972, Calendar.MAY, DAY).getTime(), 5.8, 13.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1972, Calendar.JUNE, DAY)
                .getTime(), 7.2, 15.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1972, Calendar.JULY, DAY)
                .getTime(), 9.8, 19));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1972, Calendar.AUGUST, DAY)
                .getTime(), 10.1, 18.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1972, Calendar.SEPTEMBER, DAY)
                .getTime(), 6.9, 15.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1972, Calendar.OCTOBER, DAY)
                .getTime(), 5.9, 13.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1972, Calendar.NOVEMBER, DAY)
                .getTime(), 2.4, 8.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1972, Calendar.DECEMBER, DAY)
                .getTime(), 1.7, 7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1973, Calendar.JANUARY, DAY)
                .getTime(), 1.7, 6.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1973, Calendar.FEBRUARY, DAY)
                .getTime(), 0.8, 7.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1973, Calendar.MARCH, DAY)
                .getTime(), 2.3, 10.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1973, Calendar.APRIL, DAY)
                .getTime(), 2.3, 9.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1973, Calendar.MAY, DAY).getTime(), 6.2, 14.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1973, Calendar.JUNE, DAY)
                .getTime(), 9.9, 18.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1973, Calendar.JULY, DAY)
                .getTime(), 10.6, 19.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1973, Calendar.AUGUST, DAY)
                .getTime(), 10.1, 19));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1973, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.9, 16.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1973, Calendar.OCTOBER, DAY)
                .getTime(), 5.2, 11.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1973, Calendar.NOVEMBER, DAY)
                .getTime(), 1.7, 7.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1973, Calendar.DECEMBER, DAY)
                .getTime(), 0.5, 7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1974, Calendar.JANUARY, DAY)
                .getTime(), 1.8, 7.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1974, Calendar.FEBRUARY, DAY)
                .getTime(), 2.1, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1974, Calendar.MARCH, DAY)
                .getTime(), 1.6, 7.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1974, Calendar.APRIL, DAY)
                .getTime(), 2.6, 9.6));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1974, Calendar.MAY, DAY).getTime(), 5.7, 15.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1974, Calendar.JUNE, DAY)
                .getTime(), 7.9, 16.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1974, Calendar.JULY, DAY)
                .getTime(), 9.8, 18.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1974, Calendar.AUGUST, DAY)
                .getTime(), 9.8, 18.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1974, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.4, 15));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1974, Calendar.OCTOBER, DAY)
                .getTime(), 4.4, 10));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1974, Calendar.NOVEMBER, DAY)
                .getTime(), 2.9, 8.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1974, Calendar.DECEMBER, DAY)
                .getTime(), 3.6, 9.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1975, Calendar.JANUARY, DAY)
                .getTime(), 2.4, 8.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1975, Calendar.FEBRUARY, DAY)
                .getTime(), 0.8, 6.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1975, Calendar.MARCH, DAY)
                .getTime(), 0.7, 7.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1975, Calendar.APRIL, DAY)
                .getTime(), 3.7, 11.6));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1975, Calendar.MAY, DAY).getTime(), 3.7, 12.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1975, Calendar.JUNE, DAY)
                .getTime(), 7.8, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1975, Calendar.JULY, DAY)
                .getTime(), 11.7, 20.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1975, Calendar.AUGUST, DAY)
                .getTime(), 12.4, 22.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1975, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.9, 16.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1975, Calendar.OCTOBER, DAY)
                .getTime(), 5.1, 12.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1975, Calendar.NOVEMBER, DAY)
                .getTime(), 2, 8.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1975, Calendar.DECEMBER, DAY)
                .getTime(), 2.3, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1976, Calendar.JANUARY, DAY)
                .getTime(), 2.1, 7.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1976, Calendar.FEBRUARY, DAY)
                .getTime(), 1.7, 6.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1976, Calendar.MARCH, DAY)
                .getTime(), 1.1, 7.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1976, Calendar.APRIL, DAY)
                .getTime(), 3.5, 10.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1976, Calendar.MAY, DAY).getTime(), 6.5, 14.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1976, Calendar.JUNE, DAY)
                .getTime(), 10.4, 20.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1976, Calendar.JULY, DAY)
                .getTime(), 10.7, 22.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1976, Calendar.AUGUST, DAY)
                .getTime(), 9.9, 21.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1976, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.6, 15.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1976, Calendar.OCTOBER, DAY)
                .getTime(), 6.7, 12.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1976, Calendar.NOVEMBER, DAY)
                .getTime(), 1.5, 8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1976, Calendar.DECEMBER, DAY)
                .getTime(), -0.5, 4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1977, Calendar.JANUARY, DAY)
                .getTime(), -0.8, 4.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1977, Calendar.FEBRUARY, DAY)
                .getTime(), 0.9, 5.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1977, Calendar.MARCH, DAY)
                .getTime(), 2.7, 9.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1977, Calendar.APRIL, DAY)
                .getTime(), 2.6, 10.3));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1977, Calendar.MAY, DAY).getTime(), 4.7, 13.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1977, Calendar.JUNE, DAY)
                .getTime(), 7.2, 15.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1977, Calendar.JULY, DAY)
                .getTime(), 10.3, 18.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1977, Calendar.AUGUST, DAY)
                .getTime(), 10.1, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1977, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.5, 16.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1977, Calendar.OCTOBER, DAY)
                .getTime(), 7.7, 13.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1977, Calendar.NOVEMBER, DAY)
                .getTime(), 2.9, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1977, Calendar.DECEMBER, DAY)
                .getTime(), 2.8, 7.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1978, Calendar.JANUARY, DAY)
                .getTime(), -0.9, 4.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1978, Calendar.FEBRUARY, DAY)
                .getTime(), -2, 3.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1978, Calendar.MARCH, DAY)
                .getTime(), 2.8, 9.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1978, Calendar.APRIL, DAY)
                .getTime(), 2.4, 9.4));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1978, Calendar.MAY, DAY).getTime(), 6, 15.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1978, Calendar.JUNE, DAY)
                .getTime(), 8.5, 17));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1978, Calendar.JULY, DAY)
                .getTime(), 9.8, 17.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1978, Calendar.AUGUST, DAY)
                .getTime(), 10.7, 17.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1978, Calendar.SEPTEMBER, DAY)
                .getTime(), 10, 16.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1978, Calendar.OCTOBER, DAY)
                .getTime(), 8.3, 14.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1978, Calendar.NOVEMBER, DAY)
                .getTime(), 4.7, 10.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1978, Calendar.DECEMBER, DAY)
                .getTime(), 0.1, 4.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1979, Calendar.JANUARY, DAY)
                .getTime(), -3.5, 2.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1979, Calendar.FEBRUARY, DAY)
                .getTime(), -1.1, 2.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1979, Calendar.MARCH, DAY)
                .getTime(), 0.9, 6.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1979, Calendar.APRIL, DAY)
                .getTime(), 3.4, 10));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1979, Calendar.MAY, DAY).getTime(), 4.6, 12.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1979, Calendar.JUNE, DAY)
                .getTime(), 9.1, 17.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1979, Calendar.JULY, DAY)
                .getTime(), 11, 19.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1979, Calendar.AUGUST, DAY)
                .getTime(), 9.8, 18));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1979, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.4, 16.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1979, Calendar.OCTOBER, DAY)
                .getTime(), 7.5, 13.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1979, Calendar.NOVEMBER, DAY)
                .getTime(), 2.8, 9.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1979, Calendar.DECEMBER, DAY)
                .getTime(), 2.4, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1980, Calendar.JANUARY, DAY)
                .getTime(), -0.1, 4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1980, Calendar.FEBRUARY, DAY)
                .getTime(), 2.3, 6.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1980, Calendar.MARCH, DAY)
                .getTime(), 0.7, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1980, Calendar.APRIL, DAY)
                .getTime(), 4.1, 12.4));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1980, Calendar.MAY, DAY).getTime(), 4.6, 14.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1980, Calendar.JUNE, DAY)
                .getTime(), 9, 16.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1980, Calendar.JULY, DAY)
                .getTime(), 10, 18));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1980, Calendar.AUGUST, DAY)
                .getTime(), 10.9, 18.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1980, Calendar.SEPTEMBER, DAY)
                .getTime(), 10, 17.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1980, Calendar.OCTOBER, DAY)
                .getTime(), 4.7, 11.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1980, Calendar.NOVEMBER, DAY)
                .getTime(), 3.8, 8.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1980, Calendar.DECEMBER, DAY)
                .getTime(), 2.7, 8.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1981, Calendar.JANUARY, DAY)
                .getTime(), 0.1, 7.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1981, Calendar.FEBRUARY, DAY)
                .getTime(), 0.3, 5.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1981, Calendar.MARCH, DAY)
                .getTime(), 3.1, 9.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1981, Calendar.APRIL, DAY)
                .getTime(), 3.1, 10.8));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1981, Calendar.MAY, DAY).getTime(), 6.3, 15.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1981, Calendar.JUNE, DAY)
                .getTime(), 8.8, 16.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1981, Calendar.JULY, DAY)
                .getTime(), 10.6, 19.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1981, Calendar.AUGUST, DAY)
                .getTime(), 10.8, 20.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1981, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.5, 18.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1981, Calendar.OCTOBER, DAY)
                .getTime(), 3.3, 10.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1981, Calendar.NOVEMBER, DAY)
                .getTime(), 3.7, 10.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1981, Calendar.DECEMBER, DAY)
                .getTime(), -3.3, 2.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1982, Calendar.JANUARY, DAY)
                .getTime(), -2.1, 4.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1982, Calendar.FEBRUARY, DAY)
                .getTime(), 1.5, 7.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1982, Calendar.MARCH, DAY)
                .getTime(), 1.8, 9.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1982, Calendar.APRIL, DAY)
                .getTime(), 3.6, 13.1));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1982, Calendar.MAY, DAY).getTime(), 5.5, 15.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1982, Calendar.JUNE, DAY)
                .getTime(), 9.8, 17));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1982, Calendar.JULY, DAY)
                .getTime(), 11.2, 19.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1982, Calendar.AUGUST, DAY)
                .getTime(), 11.2, 19.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1982, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.7, 18));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1982, Calendar.OCTOBER, DAY)
                .getTime(), 6.4, 12.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1982, Calendar.NOVEMBER, DAY)
                .getTime(), 4.4, 9.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1982, Calendar.DECEMBER, DAY)
                .getTime(), 0.2, 6.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1983, Calendar.JANUARY, DAY)
                .getTime(), 2.9, 8.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1983, Calendar.FEBRUARY, DAY)
                .getTime(), -1.2, 4.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1983, Calendar.MARCH, DAY)
                .getTime(), 2.9, 9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1983, Calendar.APRIL, DAY)
                .getTime(), 2, 9.3));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1983, Calendar.MAY, DAY).getTime(), 5.5, 12.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1983, Calendar.JUNE, DAY)
                .getTime(), 8.7, 17));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1983, Calendar.JULY, DAY)
                .getTime(), 12.6, 22.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1983, Calendar.AUGUST, DAY)
                .getTime(), 11.4, 21.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1983, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.1, 16.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1983, Calendar.OCTOBER, DAY)
                .getTime(), 6.2, 13.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1983, Calendar.NOVEMBER, DAY)
                .getTime(), 4.2, 9.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1983, Calendar.DECEMBER, DAY)
                .getTime(), 2.2, 8.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1984, Calendar.JANUARY, DAY)
                .getTime(), -0.5, 4.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1984, Calendar.FEBRUARY, DAY)
                .getTime(), 0.4, 5.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1984, Calendar.MARCH, DAY)
                .getTime(), 1.9, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1984, Calendar.APRIL, DAY)
                .getTime(), 2.5, 12.4));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1984, Calendar.MAY, DAY).getTime(), 4.4, 13.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1984, Calendar.JUNE, DAY)
                .getTime(), 9.2, 17.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1984, Calendar.JULY, DAY)
                .getTime(), 10.4, 21.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1984, Calendar.AUGUST, DAY)
                .getTime(), 10.8, 20.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1984, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.3, 16));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1984, Calendar.OCTOBER, DAY)
                .getTime(), 6.8, 14.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1984, Calendar.NOVEMBER, DAY)
                .getTime(), 5.2, 9.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1984, Calendar.DECEMBER, DAY)
                .getTime(), 1.6, 7.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1985, Calendar.JANUARY, DAY)
                .getTime(), -1.5, 3.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1985, Calendar.FEBRUARY, DAY)
                .getTime(), -1.4, 5.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1985, Calendar.MARCH, DAY)
                .getTime(), 0.6, 7.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1985, Calendar.APRIL, DAY)
                .getTime(), 4, 11));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1985, Calendar.MAY, DAY).getTime(), 5.9, 13.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1985, Calendar.JUNE, DAY)
                .getTime(), 6.9, 15.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1985, Calendar.JULY, DAY)
                .getTime(), 10.7, 19));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1985, Calendar.AUGUST, DAY)
                .getTime(), 10.2, 17.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1985, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.5, 17.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1985, Calendar.OCTOBER, DAY)
                .getTime(), 7.5, 14.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1985, Calendar.NOVEMBER, DAY)
                .getTime(), 0.2, 6.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1985, Calendar.DECEMBER, DAY)
                .getTime(), 2.3, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1986, Calendar.JANUARY, DAY)
                .getTime(), -0.3, 5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1986, Calendar.FEBRUARY, DAY)
                .getTime(), -3, 1.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1986, Calendar.MARCH, DAY)
                .getTime(), 0.8, 7.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1986, Calendar.APRIL, DAY)
                .getTime(), 1.7, 8.4));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1986, Calendar.MAY, DAY).getTime(), 6.7, 14.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1986, Calendar.JUNE, DAY)
                .getTime(), 8.9, 18.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1986, Calendar.JULY, DAY)
                .getTime(), 10.8, 19.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1986, Calendar.AUGUST, DAY)
                .getTime(), 8.7, 15.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1986, Calendar.SEPTEMBER, DAY)
                .getTime(), 6.4, 16.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1986, Calendar.OCTOBER, DAY)
                .getTime(), 6.3, 13.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1986, Calendar.NOVEMBER, DAY)
                .getTime(), 4.3, 10.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1986, Calendar.DECEMBER, DAY)
                .getTime(), 2.4, 7.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1987, Calendar.JANUARY, DAY)
                .getTime(), -1.5, 2.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1987, Calendar.FEBRUARY, DAY)
                .getTime(), 0.2, 6.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1987, Calendar.MARCH, DAY)
                .getTime(), 0.5, 7.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1987, Calendar.APRIL, DAY)
                .getTime(), 5, 13.5));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1987, Calendar.MAY, DAY).getTime(), 4.9, 13.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1987, Calendar.JUNE, DAY)
                .getTime(), 7.7, 15.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1987, Calendar.JULY, DAY)
                .getTime(), 11.1, 19));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1987, Calendar.AUGUST, DAY)
                .getTime(), 11.1, 18.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1987, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.6, 16.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1987, Calendar.OCTOBER, DAY)
                .getTime(), 5.1, 11.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1987, Calendar.NOVEMBER, DAY)
                .getTime(), 3.4, 8.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1987, Calendar.DECEMBER, DAY)
                .getTime(), 3, 8.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1988, Calendar.JANUARY, DAY)
                .getTime(), 1.3, 7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1988, Calendar.FEBRUARY, DAY)
                .getTime(), 1.4, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1988, Calendar.MARCH, DAY)
                .getTime(), 1.7, 9.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1988, Calendar.APRIL, DAY)
                .getTime(), 3.8, 11.6));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1988, Calendar.MAY, DAY).getTime(), 5.9, 14.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1988, Calendar.JUNE, DAY)
                .getTime(), 9.4, 18.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1988, Calendar.JULY, DAY)
                .getTime(), 10.4, 17.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1988, Calendar.AUGUST, DAY)
                .getTime(), 10.2, 19.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1988, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.5, 16.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1988, Calendar.OCTOBER, DAY)
                .getTime(), 6.7, 13));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1988, Calendar.NOVEMBER, DAY)
                .getTime(), 2, 9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1988, Calendar.DECEMBER, DAY)
                .getTime(), 4.4, 10.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1989, Calendar.JANUARY, DAY)
                .getTime(), 3.1, 9.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1989, Calendar.FEBRUARY, DAY)
                .getTime(), 2.1, 8.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1989, Calendar.MARCH, DAY)
                .getTime(), 2.2, 10.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1989, Calendar.APRIL, DAY)
                .getTime(), 2.3, 9.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1989, Calendar.MAY, DAY).getTime(), 6.3, 16.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1989, Calendar.JUNE, DAY)
                .getTime(), 8, 19));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1989, Calendar.JULY, DAY)
                .getTime(), 11.2, 22.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1989, Calendar.AUGUST, DAY)
                .getTime(), 10.7, 20.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1989, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.7, 18));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1989, Calendar.OCTOBER, DAY)
                .getTime(), 6.9, 14.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1989, Calendar.NOVEMBER, DAY)
                .getTime(), 2.9, 9.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1989, Calendar.DECEMBER, DAY)
                .getTime(), 0.5, 6.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1990, Calendar.JANUARY, DAY)
                .getTime(), 2.1, 8.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1990, Calendar.FEBRUARY, DAY)
                .getTime(), 3.1, 9.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1990, Calendar.MARCH, DAY)
                .getTime(), 4.2, 12.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1990, Calendar.APRIL, DAY)
                .getTime(), 2.3, 12.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1990, Calendar.MAY, DAY).getTime(), 5.8, 16.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1990, Calendar.JUNE, DAY)
                .getTime(), 8.1, 17.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1990, Calendar.JULY, DAY)
                .getTime(), 9.7, 20.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1990, Calendar.AUGUST, DAY)
                .getTime(), 11.8, 22.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1990, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.7, 16.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1990, Calendar.OCTOBER, DAY)
                .getTime(), 7.8, 13.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1990, Calendar.NOVEMBER, DAY)
                .getTime(), 3.5, 9.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1990, Calendar.DECEMBER, DAY)
                .getTime(), 1.6, 7.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1991, Calendar.JANUARY, DAY)
                .getTime(), -0.9, 5.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1991, Calendar.FEBRUARY, DAY)
                .getTime(), -0.8, 4.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1991, Calendar.MARCH, DAY)
                .getTime(), 3.6, 10.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1991, Calendar.APRIL, DAY)
                .getTime(), 3.1, 11.1));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1991, Calendar.MAY, DAY).getTime(), 6.2, 14.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1991, Calendar.JUNE, DAY)
                .getTime(), 6.8, 15.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1991, Calendar.JULY, DAY)
                .getTime(), 11.4, 21));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1991, Calendar.AUGUST, DAY)
                .getTime(), 11.1, 21.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1991, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.5, 18.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1991, Calendar.OCTOBER, DAY)
                .getTime(), 5.8, 12.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1991, Calendar.NOVEMBER, DAY)
                .getTime(), 1.6, 9.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1991, Calendar.DECEMBER, DAY)
                .getTime(), -0.1, 7.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1992, Calendar.JANUARY, DAY)
                .getTime(), 0, 7.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1992, Calendar.FEBRUARY, DAY)
                .getTime(), 1.7, 9.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1992, Calendar.MARCH, DAY)
                .getTime(), 3, 10.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1992, Calendar.APRIL, DAY)
                .getTime(), 4.1, 11.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1992, Calendar.MAY, DAY).getTime(), 6.6, 16.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1992, Calendar.JUNE, DAY)
                .getTime(), 9.5, 19.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1992, Calendar.JULY, DAY)
                .getTime(), 10.7, 19.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1992, Calendar.AUGUST, DAY)
                .getTime(), 9.8, 18.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1992, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.5, 15.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1992, Calendar.OCTOBER, DAY)
                .getTime(), 3.2, 10.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1992, Calendar.NOVEMBER, DAY)
                .getTime(), 2.4, 9.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1992, Calendar.DECEMBER, DAY)
                .getTime(), 0, 5.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1993, Calendar.JANUARY, DAY)
                .getTime(), 1.1, 8.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1993, Calendar.FEBRUARY, DAY)
                .getTime(), 2.1, 8.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1993, Calendar.MARCH, DAY)
                .getTime(), 1.8, 10.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1993, Calendar.APRIL, DAY)
                .getTime(), 4.4, 11.8));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1993, Calendar.MAY, DAY).getTime(), 5.8, 14.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1993, Calendar.JUNE, DAY)
                .getTime(), 8.9, 18.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1993, Calendar.JULY, DAY)
                .getTime(), 10.2, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1993, Calendar.AUGUST, DAY)
                .getTime(), 9.1, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1993, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.7, 15.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1993, Calendar.OCTOBER, DAY)
                .getTime(), 4.2, 11));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1993, Calendar.NOVEMBER, DAY)
                .getTime(), 0.7, 5.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1993, Calendar.DECEMBER, DAY)
                .getTime(), 1, 6.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1994, Calendar.JANUARY, DAY)
                .getTime(), 1, 6.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1994, Calendar.FEBRUARY, DAY)
                .getTime(), -1.3, 4.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1994, Calendar.MARCH, DAY)
                .getTime(), 3, 10));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1994, Calendar.APRIL, DAY)
                .getTime(), 3.4, 11));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1994, Calendar.MAY, DAY).getTime(), 5, 12.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1994, Calendar.JUNE, DAY)
                .getTime(), 9, 17.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1994, Calendar.JULY, DAY)
                .getTime(), 10.6, 21.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1994, Calendar.AUGUST, DAY)
                .getTime(), 10, 18.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1994, Calendar.SEPTEMBER, DAY)
                .getTime(), 7.6, 15.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1994, Calendar.OCTOBER, DAY)
                .getTime(), 5, 12.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1994, Calendar.NOVEMBER, DAY)
                .getTime(), 5.2, 11.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1994, Calendar.DECEMBER, DAY)
                .getTime(), 2.4, 8.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1995, Calendar.JANUARY, DAY)
                .getTime(), 0.3, 5.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1995, Calendar.FEBRUARY, DAY)
                .getTime(), 2.6, 8.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1995, Calendar.MARCH, DAY)
                .getTime(), 0.9, 8.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1995, Calendar.APRIL, DAY)
                .getTime(), 3.6, 12.3));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1995, Calendar.MAY, DAY).getTime(), 5.8, 15.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1995, Calendar.JUNE, DAY)
                .getTime(), 8.3, 17.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1995, Calendar.JULY, DAY)
                .getTime(), 11.7, 21.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1995, Calendar.AUGUST, DAY)
                .getTime(), 11.3, 23.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1995, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.7, 16.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1995, Calendar.OCTOBER, DAY)
                .getTime(), 8, 15.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1995, Calendar.NOVEMBER, DAY)
                .getTime(), 4, 10));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1995, Calendar.DECEMBER, DAY)
                .getTime(), -0.9, 4.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1996, Calendar.JANUARY, DAY)
                .getTime(), 1.9, 5.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1996, Calendar.FEBRUARY, DAY)
                .getTime(), -0.7, 5.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1996, Calendar.MARCH, DAY)
                .getTime(), 1.2, 5.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1996, Calendar.APRIL, DAY)
                .getTime(), 3.7, 11.5));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1996, Calendar.MAY, DAY).getTime(), 3.9, 12.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1996, Calendar.JUNE, DAY)
                .getTime(), 7.9, 18.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1996, Calendar.JULY, DAY)
                .getTime(), 10.2, 20.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1996, Calendar.AUGUST, DAY)
                .getTime(), 10.6, 20.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1996, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.8, 16.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1996, Calendar.OCTOBER, DAY)
                .getTime(), 6.9, 14.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1996, Calendar.NOVEMBER, DAY)
                .getTime(), 1.8, 7.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1996, Calendar.DECEMBER, DAY)
                .getTime(), 0.4, 5.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1997, Calendar.JANUARY, DAY)
                .getTime(), -0.3, 5.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1997, Calendar.FEBRUARY, DAY)
                .getTime(), 2.2, 9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1997, Calendar.MARCH, DAY)
                .getTime(), 3.9, 11.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1997, Calendar.APRIL, DAY)
                .getTime(), 4.1, 12.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1997, Calendar.MAY, DAY).getTime(), 4.9, 14.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1997, Calendar.JUNE, DAY)
                .getTime(), 9, 16));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1997, Calendar.JULY, DAY)
                .getTime(), 11.1, 20.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1997, Calendar.AUGUST, DAY)
                .getTime(), 12.3, 22));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1997, Calendar.SEPTEMBER, DAY)
                .getTime(), 8, 17.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1997, Calendar.OCTOBER, DAY)
                .getTime(), 5.4, 13.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1997, Calendar.NOVEMBER, DAY)
                .getTime(), 5, 10.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1997, Calendar.DECEMBER, DAY)
                .getTime(), 2.7, 7.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1998, Calendar.JANUARY, DAY)
                .getTime(), 1.4, 6.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1998, Calendar.FEBRUARY, DAY)
                .getTime(), 4.3, 10.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1998, Calendar.MARCH, DAY)
                .getTime(), 3.1, 11));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1998, Calendar.APRIL, DAY)
                .getTime(), 3.4, 10.6));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1998, Calendar.MAY, DAY).getTime(), 7.3, 16.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1998, Calendar.JUNE, DAY)
                .getTime(), 9.1, 16.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1998, Calendar.JULY, DAY)
                .getTime(), 10.5, 18.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1998, Calendar.AUGUST, DAY)
                .getTime(), 11, 18.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1998, Calendar.SEPTEMBER, DAY)
                .getTime(), 10.3, 16.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1998, Calendar.OCTOBER, DAY)
                .getTime(), 5.9, 12.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1998, Calendar.NOVEMBER, DAY)
                .getTime(), 1.7, 8.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1998, Calendar.DECEMBER, DAY)
                .getTime(), 1.5, 7.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1999, Calendar.JANUARY, DAY)
                .getTime(), 1.6, 7.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1999, Calendar.FEBRUARY, DAY)
                .getTime(), 1.4, 8.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1999, Calendar.MARCH, DAY)
                .getTime(), 3.1, 9.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1999, Calendar.APRIL, DAY)
                .getTime(), 4, 12.6));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(1999, Calendar.MAY, DAY).getTime(), 7.6, 15.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1999, Calendar.JUNE, DAY)
                .getTime(), 8.3, 16.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1999, Calendar.JULY, DAY)
                .getTime(), 11.5, 20.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1999, Calendar.AUGUST, DAY)
                .getTime(), 10.8, 19));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1999, Calendar.SEPTEMBER, DAY)
                .getTime(), 10.2, 19.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1999, Calendar.OCTOBER, DAY)
                .getTime(), 6.1, 13.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1999, Calendar.NOVEMBER, DAY)
                .getTime(), 4.3, 10.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(1999, Calendar.DECEMBER, DAY)
                .getTime(), 0.7, 6.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2000, Calendar.JANUARY, DAY)
                .getTime(), 1.9, 7.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2000, Calendar.FEBRUARY, DAY)
                .getTime(), 2.4, 8.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2000, Calendar.MARCH, DAY)
                .getTime(), 3.6, 10.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2000, Calendar.APRIL, DAY)
                .getTime(), 3.4, 11));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(2000, Calendar.MAY, DAY).getTime(), 6.5, 15.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2000, Calendar.JUNE, DAY)
                .getTime(), 9.4, 17.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2000, Calendar.JULY, DAY)
                .getTime(), 10.4, 17.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2000, Calendar.AUGUST, DAY)
                .getTime(), 10.9, 20.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2000, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.7, 17.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2000, Calendar.OCTOBER, DAY)
                .getTime(), 6, 13));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2000, Calendar.NOVEMBER, DAY)
                .getTime(), 3.4, 8.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2000, Calendar.DECEMBER, DAY)
                .getTime(), 2.3, 6.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2001, Calendar.JANUARY, DAY)
                .getTime(), 0.1, 5.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2001, Calendar.FEBRUARY, DAY)
                .getTime(), -0.4, 7.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2001, Calendar.MARCH, DAY)
                .getTime(), 0.1, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2001, Calendar.APRIL, DAY)
                .getTime(), 3, 10.5));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(2001, Calendar.MAY, DAY).getTime(), 6.4, 16.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2001, Calendar.JUNE, DAY)
                .getTime(), 8.9, 16.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2001, Calendar.JULY, DAY)
                .getTime(), 12, 20.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2001, Calendar.AUGUST, DAY)
                .getTime(), 11.7, 20.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2001, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.7, 16));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2001, Calendar.OCTOBER, DAY)
                .getTime(), 9.9, 15.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2001, Calendar.NOVEMBER, DAY)
                .getTime(), 4.2, 11));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2001, Calendar.DECEMBER, DAY)
                .getTime(), 0.3, 6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2002, Calendar.JANUARY, DAY)
                .getTime(), 1.5, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2002, Calendar.FEBRUARY, DAY)
                .getTime(), 2.8, 9.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2002, Calendar.MARCH, DAY)
                .getTime(), 2.8, 11.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2002, Calendar.APRIL, DAY)
                .getTime(), 4.1, 13.3));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(2002, Calendar.MAY, DAY).getTime(), 7.6, 15.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2002, Calendar.JUNE, DAY)
                .getTime(), 9.9, 17.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2002, Calendar.JULY, DAY)
                .getTime(), 10.6, 19.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2002, Calendar.AUGUST, DAY)
                .getTime(), 12.7, 20.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2002, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.5, 17.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2002, Calendar.OCTOBER, DAY)
                .getTime(), 5.4, 12.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2002, Calendar.NOVEMBER, DAY)
                .getTime(), 4.6, 9.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2002, Calendar.DECEMBER, DAY)
                .getTime(), 3.5, 6.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2003, Calendar.JANUARY, DAY)
                .getTime(), 2.2, 7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2003, Calendar.FEBRUARY, DAY)
                .getTime(), -0.7, 6.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2003, Calendar.MARCH, DAY)
                .getTime(), 2, 12.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2003, Calendar.APRIL, DAY)
                .getTime(), 4.3, 14));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(2003, Calendar.MAY, DAY).getTime(), 7.7, 15.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2003, Calendar.JUNE, DAY)
                .getTime(), 10.9, 19.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2003, Calendar.JULY, DAY)
                .getTime(), 12.8, 20.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2003, Calendar.AUGUST, DAY)
                .getTime(), 12.2, 21));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2003, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.9, 18.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2003, Calendar.OCTOBER, DAY)
                .getTime(), 5, 12.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2003, Calendar.NOVEMBER, DAY)
                .getTime(), 4.4, 10.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2003, Calendar.DECEMBER, DAY)
                .getTime(), 0.9, 7.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2004, Calendar.JANUARY, DAY)
                .getTime(), 2.4, 7.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2004, Calendar.FEBRUARY, DAY)
                .getTime(), 3, 8.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2004, Calendar.MARCH, DAY)
                .getTime(), 2.9, 10.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2004, Calendar.APRIL, DAY)
                .getTime(), 5.9, 13.1));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(2004, Calendar.MAY, DAY).getTime(), 6.2, 16.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2004, Calendar.JUNE, DAY)
                .getTime(), 10.1, 18.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2004, Calendar.JULY, DAY)
                .getTime(), 10.9, 19.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2004, Calendar.AUGUST, DAY)
                .getTime(), 12.5, 20));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2004, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.7, 17.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2004, Calendar.OCTOBER, DAY)
                .getTime(), 6.6, 12.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2004, Calendar.NOVEMBER, DAY)
                .getTime(), 4.3, 10));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2004, Calendar.DECEMBER, DAY)
                .getTime(), 1.7, 8.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2005, Calendar.JANUARY, DAY)
                .getTime(), 2.7, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2005, Calendar.FEBRUARY, DAY)
                .getTime(), 1.3, 6.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2005, Calendar.MARCH, DAY)
                .getTime(), 3.7, 9.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2005, Calendar.APRIL, DAY)
                .getTime(), 4.1, 11.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(2005, Calendar.MAY, DAY).getTime(), 6.2, 14.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2005, Calendar.JUNE, DAY)
                .getTime(), 10, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2005, Calendar.JULY, DAY)
                .getTime(), 11.7, 19.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2005, Calendar.AUGUST, DAY)
                .getTime(), 10.5, 20.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2005, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.7, 18.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2005, Calendar.OCTOBER, DAY)
                .getTime(), 8.9, 14.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2005, Calendar.NOVEMBER, DAY)
                .getTime(), 2.4, 9.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2005, Calendar.DECEMBER, DAY)
                .getTime(), 1.2, 7.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2006, Calendar.JANUARY, DAY)
                .getTime(), 1.3, 6.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2006, Calendar.FEBRUARY, DAY)
                .getTime(), 1.1, 7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2006, Calendar.MARCH, DAY)
                .getTime(), 0.8, 6.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2006, Calendar.APRIL, DAY)
                .getTime(), 3.9, 12));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(2006, Calendar.MAY, DAY).getTime(), 6.3, 15.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2006, Calendar.JUNE, DAY)
                .getTime(), 9.9, 19.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2006, Calendar.JULY, DAY)
                .getTime(), 12.4, 24.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2006, Calendar.AUGUST, DAY)
                .getTime(), 11.5, 19.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2006, Calendar.SEPTEMBER, DAY)
                .getTime(), 11.8, 20));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2006, Calendar.OCTOBER, DAY)
                .getTime(), 8.6, 15.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2006, Calendar.NOVEMBER, DAY)
                .getTime(), 4.5, 11));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2006, Calendar.DECEMBER, DAY)
                .getTime(), 2.2, 7.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2007, Calendar.JANUARY, DAY)
                .getTime(), 3.1, 9.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2007, Calendar.FEBRUARY, DAY)
                .getTime(), 2.1, 8.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2007, Calendar.MARCH, DAY)
                .getTime(), 3.3, 10.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2007, Calendar.APRIL, DAY)
                .getTime(), 6, 15.4));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(2007, Calendar.MAY, DAY).getTime(), 6.9, 14.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2007, Calendar.JUNE, DAY)
                .getTime(), 9.9, 17.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2007, Calendar.JULY, DAY)
                .getTime(), 10.9, 19));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2007, Calendar.AUGUST, DAY)
                .getTime(), 10.6, 19.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2007, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.8, 17.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2007, Calendar.OCTOBER, DAY)
                .getTime(), 6.1, 14.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2007, Calendar.NOVEMBER, DAY)
                .getTime(), 3.9, 10.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2007, Calendar.DECEMBER, DAY)
                .getTime(), 1.1, 6.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2008, Calendar.JANUARY, DAY)
                .getTime(), 2.8, 7.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2008, Calendar.FEBRUARY, DAY)
                .getTime(), 0.7, 8.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2008, Calendar.MARCH, DAY)
                .getTime(), 1.9, 9.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2008, Calendar.APRIL, DAY)
                .getTime(), 3.3, 11.2));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(2008, Calendar.MAY, DAY).getTime(), 7.1, 15.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2008, Calendar.JUNE, DAY)
                .getTime(), 9.1, 17.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2008, Calendar.JULY, DAY)
                .getTime(), 11.4, 20.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2008, Calendar.AUGUST, DAY)
                .getTime(), 12.2, 19.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2008, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.6, 16.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2008, Calendar.OCTOBER, DAY)
                .getTime(), 5.2, 12.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2008, Calendar.NOVEMBER, DAY)
                .getTime(), 3.7, 9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2008, Calendar.DECEMBER, DAY)
                .getTime(), 0.6, 6.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2009, Calendar.JANUARY, DAY)
                .getTime(), 0.4, 6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2009, Calendar.FEBRUARY, DAY)
                .getTime(), 2, 7.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2009, Calendar.MARCH, DAY)
                .getTime(), 3, 11));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2009, Calendar.APRIL, DAY)
                .getTime(), 4.3, 13.7));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(2009, Calendar.MAY, DAY).getTime(), 6.8, 16));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2009, Calendar.JUNE, DAY)
                .getTime(), 8.9, 17.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2009, Calendar.JULY, DAY)
                .getTime(), 11.4, 19.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2009, Calendar.AUGUST, DAY)
                .getTime(), 12.1, 20.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2009, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.5, 17.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2009, Calendar.OCTOBER, DAY)
                .getTime(), 7.1, 14));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2009, Calendar.NOVEMBER, DAY)
                .getTime(), 4.7, 10.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2009, Calendar.DECEMBER, DAY)
                .getTime(), -0.5, 5.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2010, Calendar.JANUARY, DAY)
                .getTime(), -1.1, 3.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2010, Calendar.FEBRUARY, DAY)
                .getTime(), -1, 4.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2010, Calendar.MARCH, DAY)
                .getTime(), 2, 9.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2010, Calendar.APRIL, DAY)
                .getTime(), 4.1, 13.5));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(2010, Calendar.MAY, DAY).getTime(), 5.2, 15));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2010, Calendar.JUNE, DAY)
                .getTime(), 9.5, 19.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2010, Calendar.JULY, DAY)
                .getTime(), 12.1, 20.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2010, Calendar.AUGUST, DAY)
                .getTime(), 10.1, 19.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2010, Calendar.SEPTEMBER, DAY)
                .getTime(), 9.8, 17.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2010, Calendar.OCTOBER, DAY)
                .getTime(), 6.4, 13));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2010, Calendar.NOVEMBER, DAY)
                .getTime(), 2, 7.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2010, Calendar.DECEMBER, DAY)
                .getTime(), -3.4, 2.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2011, Calendar.JANUARY, DAY)
                .getTime(), 0.5, 6.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2011, Calendar.FEBRUARY, DAY)
                .getTime(), 2.8, 8.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2011, Calendar.MARCH, DAY)
                .getTime(), 2.1, 10.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2011, Calendar.APRIL, DAY)
                .getTime(), 5.9, 16.5));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(2011, Calendar.MAY, DAY).getTime(), 7.4, 16));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2011, Calendar.JUNE, DAY)
                .getTime(), 8.8, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2011, Calendar.JULY, DAY)
                .getTime(), 9.7, 19.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2011, Calendar.AUGUST, DAY)
                .getTime(), 10.6, 18.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2011, Calendar.SEPTEMBER, DAY)
                .getTime(), 10.2, 18.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2011, Calendar.OCTOBER, DAY)
                .getTime(), 8.2, 14.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2011, Calendar.NOVEMBER, DAY)
                .getTime(), 6, 11.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2011, Calendar.DECEMBER, DAY)
                .getTime(), 2.3, 7.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2012, Calendar.JANUARY, DAY)
                .getTime(), 1.5, 7.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2012, Calendar.FEBRUARY, DAY)
                .getTime(), 1.8, 8.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2012, Calendar.MARCH, DAY)
                .getTime(), 3.6, 13.7));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2012, Calendar.APRIL, DAY)
                .getTime(), 2.9, 10.8));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(2012, Calendar.MAY, DAY).getTime(), 5.9, 15.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2012, Calendar.JUNE, DAY)
                .getTime(), 8.7, 16.1));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2012, Calendar.JULY, DAY)
                .getTime(), 10.9, 18.3));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2012, Calendar.AUGUST, DAY)
                .getTime(), 11.3, 19.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2012, Calendar.SEPTEMBER, DAY)
                .getTime(), 8.7, 16.8));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2012, Calendar.OCTOBER, DAY)
                .getTime(), 4.4, 12.4));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2012, Calendar.NOVEMBER, DAY)
                .getTime(), 2.9, 9.2));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2012, Calendar.DECEMBER, DAY)
                .getTime(), 1.1, 6.6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2013, Calendar.JANUARY, DAY)
                .getTime(), 0.8, 5.5));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2013, Calendar.FEBRUARY, DAY)
                .getTime(), 0.2, 6));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2013, Calendar.MARCH, DAY)
                .getTime(), -0.2, 4.9));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2013, Calendar.APRIL, DAY)
                .getTime(), 3.3, 10.9));
        weatherModel.add(new WeatherReport(
                new GregorianCalendar(2013, Calendar.MAY, DAY).getTime(), 5.8, 15));
        weatherModel.add(new WeatherReport(new GregorianCalendar(2013, Calendar.JUNE, DAY)
                .getTime(), 8.9, 18.1));
    }

}
