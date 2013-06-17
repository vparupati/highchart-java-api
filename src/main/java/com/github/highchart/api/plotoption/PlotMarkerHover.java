package com.github.highchart.api.plotoption;

import com.github.highchart.api.base.BaseObject;

public class PlotMarkerHover extends BaseObject {

    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public PlotMarkerHover setEnabled( boolean enabled ) {
        this.enabled = enabled;
        return this;
    }
}