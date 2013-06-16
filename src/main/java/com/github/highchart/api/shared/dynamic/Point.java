package com.github.highchart.api.shared.dynamic;

public interface Point {

    String getColor();

    Element getGraphic();

    double getX();

    double getY();

    void selectPoint( boolean select, boolean accumulate );

}
