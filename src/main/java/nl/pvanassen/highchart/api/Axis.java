package nl.pvanassen.highchart.api;

import java.awt.Color;
import nl.pvanassen.highchart.api.axis.AxisLabels;
import nl.pvanassen.highchart.api.axis.AxisPlotLines;
import nl.pvanassen.highchart.api.base.BaseObject;
import nl.pvanassen.highchart.api.format.DateTimeLabelFormats;
import nl.pvanassen.highchart.api.shared.DashStyleType;
import nl.pvanassen.highchart.api.shared.EnumString;
import nl.pvanassen.highchart.api.shared.HexColor;
import nl.pvanassen.highchart.api.utils.ArrayString;
import nl.pvanassen.highchart.api.utils.JsonArray;

public class Axis extends BaseObject {

    public enum Type {
        LINEAR,
        LOGARITHMIC,
        DATETIME,
        CATEGORY
    }
    
    private ArrayString categories;
    
    private DateTimeLabelFormats dateTimeLabelFormats;
    
    private String gridLineColor;
    
    private String gridLineDashStyle;
    
    private Integer gridLineWidth;
    
    private AxisLabels labels;
    
    private String lineColor;
    
    private Integer lineWidth;
    
    private Double max;
    
    private Double min;
    
    private String minorGridLineColor;
    
    private String minorGridLineDashStyle;
    
    private Integer minorGridLineWidth;
    
    private Boolean opposite;
    
    private JsonArray<AxisPlotLines> plotLines;
    
    private Boolean reversed;
    
    private Boolean showEmpty;
    
    private Boolean showFirstLabel;

    private Boolean showLastLabel;

    private Boolean startOnTick;

    private Double tickInterval;

    private Title title;
    
    private String type;

    public Axis() { }

    public ArrayString getCategories() {
        if (categories == null) {
            categories = new ArrayString();
        }
        return categories;
    }

    public int getCategoriesLength() {
        return categories != null ? categories.size() : 0;
    }

    public DateTimeLabelFormats getDateTimeLabelFormats() {
        if (dateTimeLabelFormats == null) {
            dateTimeLabelFormats = new DateTimeLabelFormats();
        }
        return dateTimeLabelFormats;
    }

    public AxisLabels getLabels() {
        if (labels == null) {
            labels = new AxisLabels();
        }
        return labels;
    }

    public double getMax() {
        return max;
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
        if (title == null) {
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

    public Axis setMax(double max) {
        this.max = max;
        return this;
    }

    public Axis setMin(double min) {
        this.min = min;
        return this;
    }

    public Axis setPlotLines(JsonArray<AxisPlotLines> plotLines) {
        this.plotLines = plotLines;
        return this;
    }

    public Axis setShowFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
        return this;
    }

    public Axis setStartOnTick(boolean startOnTick) {
        this.startOnTick = startOnTick;
        return this;
    }

    public Axis setTickInterval(double tickInterval) {
        this.tickInterval = tickInterval;
        return this;
    }

    public Axis setType(Type type) {
        this.type = EnumString.toString(type);
        return this;
    }
    
    /**
     * @return the gridLineColor
     */
    public String getGridLineColor() {
        return gridLineColor;
    }

    /**
     * @param gridLineColor the gridLineColor to set
     * @return 
     */
    public Axis setGridLineColor(Color gridLineColor) {
        this.gridLineColor = HexColor.toString(gridLineColor);
        return this;
    }

    /**
     * @return the gridLineDashStyle
     */
    public String getGridLineDashStyle() {
        return gridLineDashStyle;
    }

    /**
     * @param gridLineDashStyle the gridLineDashStyle to set
     * @return 
     */
    public Axis setGridLineDashStyle(DashStyleType gridLineDashStyle) {
        this.gridLineDashStyle = EnumString.toString(gridLineDashStyle);
        return this;
    }

    /**
     * @return the gridLineWidth
     */
    public Integer getGridLineWidth() {
        return gridLineWidth;
    }

    /**
     * @param gridLineWidth the gridLineWidth to set
     * @return 
     */
    public Axis setGridLineWidth(Integer gridLineWidth) {
        this.gridLineWidth = gridLineWidth;
        return this;
    }

    /**
     * @return the lineColor
     */
    public String getLineColor() {
        return lineColor;
    }

    /**
     * @param lineColor the lineColor to set
     * @return 
     */
    public Axis setLineColor(Color lineColor) {
        this.lineColor = HexColor.toString(lineColor);
        return this;
    }

    /**
     * @return the lineWidth
     */
    public Integer getLineWidth() {
        return lineWidth;
    }

    /**
     * @param lineWidth the lineWidth to set
     * @return 
     */
    public Axis setLineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    /**
     * @return the minorGridLineColor
     */
    public String getMinorGridLineColor() {
        return minorGridLineColor;
    }

    /**
     * @param minorGridLineColor the minorGridLineColor to set
     * @return 
     */
    public Axis setMinorGridLineColor(Color minorGridLineColor) {
        this.minorGridLineColor = HexColor.toString(minorGridLineColor);
        return this;
    }

    /**
     * @return the minorGridLineDashStyle
     */
    public String getMinorGridLineDashStyle() {
        return minorGridLineDashStyle;
    }

    /**
     * @param minorGridLineDashStyle the minorGridLineDashStyle to set
     * @return 
     */
    public Axis setMinorGridLineDashStyle(
            final DashStyleType minorGridLineDashStyle) {
        this.minorGridLineDashStyle = 
                EnumString.toString(
                        minorGridLineDashStyle);
        return this;
    }

    /**
     * @return the minorGridLineWidth
     */
    public Integer getMinorGridLineWidth() {
        return minorGridLineWidth;
    }

    /**
     * @param minorGridLineWidth the minorGridLineWidth to set
     * @return 
     */
    public Axis setMinorGridLineWidth(Integer minorGridLineWidth) {
        this.minorGridLineWidth = minorGridLineWidth;
        return this;
    }

    /**
     * @return the opposite
     */
    public Boolean getOpposite() {
        return opposite;
    }

    /**
     * @param opposite the opposite to set
     * @return 
     */
    public Axis setOpposite(Boolean opposite) {
        this.opposite = opposite;
        return this;
    }

    /**
     * @return the reversed
     */
    public Boolean getReversed() {
        return reversed;
    }

    /**
     * @param reversed the reversed to set
     * @return 
     */
    public Axis setReversed(Boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    /**
     * @return the showEmpty
     */
    public Boolean getShowEmpty() {
        return showEmpty;
    }

    /**
     * @param showEmpty the showEmpty to set
     * @return 
     */
    public Axis setShowEmpty(Boolean showEmpty) {
        this.showEmpty = showEmpty;
        return this;
    }

    /**
     * @return the showFirstLabel
     */
    public Boolean getShowFirstLabel() {
        return showFirstLabel;
    }

    /**
     * @param showFirstLabel the showFirstLabel to set
     * @return 
     */
    public Axis setShowFirstLabel(Boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
        return this;
    }

    /**
     * @return the showLastLabel
     */
    public Boolean getShowLastLabel() {
        return showLastLabel;
    }

    /**
     * @param showLastLabel the showLastLabel to set
     * @return 
     */
    public Axis setShowLastLabel(Boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
        return this;
    }

    /**
     * @return the startOnTick
     */
    public Boolean getStartOnTick() {
        return startOnTick;
    }

    /**
     * @param startOnTick the startOnTick to set
     * @return 
     */
    public Axis setStartOnTick(Boolean startOnTick) {
        this.startOnTick = startOnTick;
        return this;
    }

}
