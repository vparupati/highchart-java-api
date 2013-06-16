package com.github.highchart.api.axis;

import com.github.highchart.api.Style;
import com.github.highchart.api.base.BaseObject;

public class AxisPlotLineLabel extends BaseObject {

    public String align;

    public String verticalAlign;

    public double rotation;

    public String text;

    public String textAlign;

    public double x;

    public double y;

    public Style  style;

    public AxisPlotLineLabel() {
        style = new Style();
    }

    public String getAlign() {
        return align;
    }

    public double getRotation() {
        return rotation;
    }

    public Style getStyle() {
        return style;
    }

    public String getText() {
        return text;
    }

    public String getTextAlign() {
        return textAlign;
    }

    public String getVerticalAlign() {
        return verticalAlign;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public AxisPlotLineLabel setAlign( String align ) {
        this.align = align;
        return this;
    }

    public AxisPlotLineLabel setRotation( double rotation ) {
        this.rotation = rotation;
        return this;
    }

    public AxisPlotLineLabel setStyle( Style style ) {
        this.style = style;
        return this;
    }

    public AxisPlotLineLabel setText( String text ) {
        this.text = text;
        return this;
    }

    public AxisPlotLineLabel setTextAlign( String textAlign ) {
        this.textAlign = textAlign;
        return this;
    }

    public AxisPlotLineLabel setVerticalAlign( String verticalAlign ) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public AxisPlotLineLabel setX( double x ) {
        this.x = x;
        return this;
    }

    public AxisPlotLineLabel setY( double y ) {
        this.y = y;
        return this;
    }

}