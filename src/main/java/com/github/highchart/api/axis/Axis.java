package com.github.highchart.api.axis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;



import com.github.highchart.api.Title;
import com.github.highchart.api.base.BaseObject;
import com.github.highchart.api.datetime.DateTimeLabelFormats;
import com.github.highchart.api.utils.ArrayString;
import com.github.highchart.api.utils.JsonArray;

@XmlAccessorType( XmlAccessType.NONE )
public class Axis extends BaseObject {

    @XmlElement
    public Integer                maxZoom;

    @XmlElement
    public Boolean                startOnTick;

    @XmlElement
    public Double                 tickInterval;

    @XmlElement
    public Boolean                showFirstLabel;

    @XmlElement
    public Double                 min;

    @XmlElement
    public Double                 max;

    @XmlElement
    public String                 type;

    @XmlElement( type = AxisLabels.class )
    public AxisLabels              labels;

    public DateTimeLabelFormats   dateTimeLabelFormats;

    @XmlTransient
    public ArrayString            categories;

    public JsonArray<AxisPlotLines> plotLines;

    public Title                  title;

    public Axis() {
        labels = null;
        dateTimeLabelFormats = null;
        categories = null;
        title = null;
    }

    @XmlTransient
    public ArrayString getCategories() {
        if ( categories == null ) {
            categories = new ArrayString();
        }
        return ( ArrayString ) categories;
    }

    public int getCategoriesLength() {
        return ( categories != null ) ? ( ( ArrayString ) categories ).size() : 0;
    }

    public DateTimeLabelFormats getDateTimeLabelFormats() {
        if ( dateTimeLabelFormats == null ) {
            dateTimeLabelFormats = new DateTimeLabelFormats();
        }
        return dateTimeLabelFormats;
    }

    public AxisLabels getLabels() {
        if ( labels == null ) {
            labels = new AxisLabels();
        }
        return labels;
    }

    public double getMax() {
        return max;
    }

    public int getMaxZoom() {
        return maxZoom;
    }

    public double getMin() {
        return min;
    }

    public JsonArray<AxisPlotLines> getPlotLines() {
        return plotLines;
    }

    public double getTickInterval() {
        return tickInterval;
    }

    public Title getTitle() {
        if ( title == null ) {
            title = new Title();
        }
        return title;
    }

    public String getType() {
        return type;
    }

    public boolean isShowFirstLabel() {
        return showFirstLabel;
    }

    public boolean isStartOnTick() {
        return startOnTick;
    }

    public Axis setMax( double max ) {
        this.max = max;
        return this;
    }

    public Axis setMaxZoom( int maxZoom ) {
        this.maxZoom = maxZoom;
        return this;
    }

    public Axis setMin( double min ) {
        this.min = min;
        return this;
    }

    public Axis setPlotLines( JsonArray<AxisPlotLines> plotLines ) {
        this.plotLines = plotLines;
        return this;
    }

    public Axis setShowFirstLabel( boolean showFirstLabel ) {
        this.showFirstLabel = showFirstLabel;
        return this;
    }

    public Axis setStartOnTick( boolean startOnTick ) {
        this.startOnTick = startOnTick;
        return this;
    }

    public Axis setTickInterval( double tickInterval ) {
        this.tickInterval = tickInterval;
        return this;
    }

    public Axis setType( String type ) {
        this.type = type;
        return this;
    }

}
