package com.github.highchart.api.plotoption;

import com.github.highchart.api.base.BaseObject;

public class PlotMarkerStates extends BaseObject {

    public PlotMarkerSelect select;

    public PlotMarkerHover  hover;

    public PlotMarkerStates() {
        select = new PlotMarkerSelect();
        hover = new PlotMarkerHover();
    }

    public PlotMarkerHover getHover() {
        return hover;
    }

    public PlotMarkerSelect getSelect() {
        return select;
    }
}