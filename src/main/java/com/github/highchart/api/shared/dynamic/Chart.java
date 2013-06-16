package com.github.highchart.api.shared.dynamic;



import com.github.highchart.api.ChartOptions;
import com.github.highchart.api.utils.JsonArray;

public interface Chart {

    void _destroy();

    ChartOptions getOptions();

    JsonArray<Series> getSeries();

}
