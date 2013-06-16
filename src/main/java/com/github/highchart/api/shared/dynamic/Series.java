package com.github.highchart.api.shared.dynamic;

import com.github.highchart.api.utils.JsonArray;

public interface Series {

    Element getArea();

    JsonArray<Point> getData();

    Element getGraph();

    String getName();

}
