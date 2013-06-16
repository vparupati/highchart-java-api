package com.github.highchart.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;



import com.github.highchart.api.axis.Axis;
import com.github.highchart.api.base.BaseObject;
import com.github.highchart.api.plotoption.PlotOptions;
import com.github.highchart.api.serie.Series;
import com.github.highchart.api.utils.JsonArray;

@XmlRootElement( name = "chartOptions" )
@XmlAccessorType( XmlAccessType.NONE )
public class ChartOptions extends BaseObject {

    @XmlTransient
    public Chart             chart;

    @XmlElement
    public Credits           credits;

    @XmlElement
    public Labels            labels;

    @XmlElement
    public Legend            legend;

    @XmlElement
    public PlotOptions       plotOptions;

    // @XmlTransient
    @XmlElements( @XmlElement( name = "series", type = Series.class ) )
    public JsonArray<Series> series;

    @XmlElement
    public Title             title;

    @XmlElement
    public Title             subtitle;

    @XmlElement
    public Tooltip           tooltip;

    @XmlElement
    public Axis              xAxis;

    @XmlElement
    public Axis              yAxis;

    public ChartOptions() {
    }

    public Chart getChart() {
        if ( chart == null ) {
            chart = new Chart();
        }
        return chart;
    }

    public Credits getCredits() {
        if ( credits == null ) {
            credits = new Credits();
        }
        return credits;
    }

    public Labels getLabels() {
        if ( labels == null ) {
            labels = new Labels();
        }
        return labels;
    }

    public Legend getLegend() {
        if ( legend == null ) {
            legend = new Legend();
        }
        return legend;
    }

    public PlotOptions getPlotOptions() {
        if ( plotOptions == null ) {
            plotOptions = new PlotOptions();
        }
        return plotOptions;
    }

    @XmlTransient
    public JsonArray<Series> getSeries() {
        if ( series == null ) {
            series = new JsonArray<Series>();
        }
        return series;
    }

    public Title getSubtitle() {
        if ( subtitle == null ) {
            subtitle = new Title();
        }
        return subtitle;
    }

    public Title getTitle() {
        if ( title == null ) {
            title = new Title();
        }
        return title;
    }

    public Tooltip getTooltip() {
        if ( tooltip == null ) {
            tooltip = new Tooltip();
        }
        return tooltip;
    }

    public Axis getXAxis() {
        if ( xAxis == null ) {
            xAxis = new Axis();
        }
        return xAxis;
    }

    public Axis getYAxis() {
        if ( yAxis == null ) {
            yAxis = new Axis();
        }
        return yAxis;
    }

}
