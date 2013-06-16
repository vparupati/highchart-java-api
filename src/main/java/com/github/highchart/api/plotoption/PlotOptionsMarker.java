package com.github.highchart.api.plotoption;

import com.github.highchart.api.base.BaseObject;

public class PlotOptionsMarker extends BaseObject {

    public String    symbol;

    public boolean   enabled;

    public PlotMarkerStates states;

    public PlotOptionsMarker() {
    }

    public PlotMarkerStates getStates() {
        if ( states == null ) {
            states = new PlotMarkerStates();
        }
        return states;
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public PlotOptionsMarker setEnabled( boolean enabled ) {
        this.enabled = enabled;
        return this;
    }

    public PlotOptionsMarker setSymbol( String symbol ) {
        this.symbol = symbol;
        return this;
    }
}