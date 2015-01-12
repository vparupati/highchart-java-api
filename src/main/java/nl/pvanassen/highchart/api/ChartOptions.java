package nl.pvanassen.highchart.api;


import nl.pvanassen.highchart.api.base.BaseObject;
import nl.pvanassen.highchart.api.utils.JsonArray;

public class ChartOptions extends BaseObject {

    private Chart chart;
    
    private JsonArray<String> colors;

    private Credits credits;

    private Labels labels;

    private Legend legend;

    private PlotOptions plotOptions;

    private JsonArray<Series> series;

    private Title title;

    private Title subtitle;

    private Tooltip tooltip;

    private Axis xAxis;

    private Axis yAxis;

    public Chart getChart() {
        if (chart == null) {
            chart = new Chart();
        }
        return chart;
    }
    
    public JsonArray<String> getColors() {
        if(this.colors == null) {
            this.colors = new JsonArray<String>();
        }
        return this.colors;
    }

    public Credits getCredits() {
        if (credits == null) {
            credits = new Credits();
        }
        return credits;
    }

    public Labels getLabels() {
        if (labels == null) {
            labels = new Labels();
        }
        return labels;
    }

    public Legend getLegend() {
        if (legend == null) {
            legend = new Legend();
        }
        return legend;
    }

    public PlotOptions getPlotOptions() {
        if (plotOptions == null) {
            plotOptions = new PlotOptions();
        }
        return plotOptions;
    }

    public JsonArray<Series> getSeries() {
        if (series == null) {
            series = new JsonArray<Series>();
        }
        return series;
    }

    public Title getSubtitle() {
        if (subtitle == null) {
            subtitle = new Title();
        }
        return subtitle;
    }

    public Title getTitle() {
        if (title == null) {
            title = new Title();
        }
        return title;
    }

    public Tooltip getTooltip() {
        if (tooltip == null) {
            tooltip = new Tooltip();
        }
        return tooltip;
    }

    public Axis getXAxis() {
        if (xAxis == null) {
            xAxis = new Axis();
        }
        return xAxis;
    }

    public Axis getYAxis() {
        if (yAxis == null) {
            yAxis = new Axis();
        }
        return yAxis;
    }

}
