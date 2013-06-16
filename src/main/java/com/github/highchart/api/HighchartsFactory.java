package com.github.highchart.api;

import com.github.highchart.api.serie.Series;

public class HighchartsFactory {

    public HighchartsFactory() {
        super();
    }

    public ChartOptions createChartOptions() {
        return new ChartOptions();
    }

    public Point createPoint() {
        return new Point();
    }

    public Series createSeries() {
        return new Series();
    }

}