package com.github.highchart.api.plotoption;

import com.github.highchart.api.base.BaseObject;

public class PlotMarkerSelect extends BaseObject {

    public String fillColor, lineColor;

    public int    lineWidth;

    public String getFillColor() {
        return fillColor;
    }

    public String getLineColor() {
        return lineColor;
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public PlotMarkerSelect setFillColor( String fillColor ) {
        this.fillColor = fillColor;
        return this;
    }

    public PlotMarkerSelect setLineColor( String lineColor ) {
        this.lineColor = lineColor;
        return this;
    }

    public PlotMarkerSelect setLineWidth( int lineWidth ) {
        this.lineWidth = lineWidth;
        return this;
    }

}