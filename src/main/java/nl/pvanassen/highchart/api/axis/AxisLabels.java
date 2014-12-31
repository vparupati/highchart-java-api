package nl.pvanassen.highchart.api.axis;

import nl.pvanassen.highchart.api.base.BaseObject;
import nl.pvanassen.highchart.api.base.Style;
import nl.pvanassen.highchart.api.shared.AlignType;
import nl.pvanassen.highchart.api.shared.EnumString;


public class AxisLabels extends BaseObject {
    private String align;
    
    private Boolean enabled;
    
    private String format;
    
    private Object formatter;
    
    private Integer maxStaggerLines;
    
    private Object overflow;

    private Double rotation;

    private Integer staggerLines;
    
    private Integer step;
    
    private Style style;
    
    private Boolean useHTML;
    
    private Integer x;
    
    private Integer y;
    
    private Integer zIndex;

    public String getAlign() {
        return align;
    }

    public Double getRotation() {
        return rotation;
    }

    public AxisLabels setAlign(AlignType align) {
        this.align = EnumString.toString(align);
        return this;
    }

    public AxisLabels setRotation(Double rotation) {
        this.rotation = rotation;
        return this;
    }

    /**
     * @return the enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * @param enabled the enabled to set
     * @return 
     */
    public AxisLabels setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     * @return 
     */
    public AxisLabels setFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * @return the formatter
     */
    public Object getFormatter() {
        return formatter;
    }

    /**
     * @param formatter the formatter to set
     * @return 
     */
    public AxisLabels setFormatter(Object formatter) {
        this.formatter = formatter;
        return this;
    }

    /**
     * @return the maxStaggerLines
     */
    public Integer getMaxStaggerLines() {
        return maxStaggerLines;
    }

    /**
     * @param maxStaggerLines the maxStaggerLines to set
     * @return 
     */
    public AxisLabels setMaxStaggerLines(Integer maxStaggerLines) {
        this.maxStaggerLines = maxStaggerLines;
        return this;
    }

    /**
     * @return the overflow
     */
    public Object getOverflow() {
        return overflow;
    }

    /**
     * @return 
     */
    public AxisLabels setOverflowFalse() {
        this.overflow = false;
        return this;
    }
    
    /**
     * @return 
     */
    public AxisLabels setOverflowJustify() {
        this.overflow = "justify";
        return this;
    }

    /**
     * @return the staggerLines
     */
    public Integer getStaggerLines() {
        return staggerLines;
    }

    /**
     * @param staggerLines the staggerLines to set
     * @return 
     */
    public AxisLabels setStaggerLines(Integer staggerLines) {
        this.staggerLines = staggerLines;
        return this;
    }

    /**
     * @return the step
     */
    public Integer getStep() {
        return step;
    }

    /**
     * @param step the step to set
     * @return 
     */
    public AxisLabels setStep(Integer step) {
        this.step = step;
        return this;
    }

    /**
     * @return the style
     */
    public Style getStyle() {
        if(this.style == null) {
            this.style = new Style();
        }
        return style;
    }

    /**
     * @return the useHTML
     */
    public Boolean getUseHTML() {
        return useHTML;
    }

    /**
     * @param useHTML the useHTML to set
     * @return 
     */
    public AxisLabels setUseHTML(Boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    /**
     * @return the x
     */
    public Integer getX() {
        return x;
    }

    /**
     * @param x the x to set
     * @return 
     */
    public AxisLabels setX(Integer x) {
        this.x = x;
        return this;
    }

    /**
     * @return the y
     */
    public Integer getY() {
        return y;
    }

    /**
     * @param y the y to set
     * @return 
     */
    public AxisLabels setY(Integer y) {
        this.y = y;
        return this;
    }

    /**
     * @return the zIndex
     */
    public Integer getZIndex() {
        return zIndex;
    }

    /**
     * @param zIndex the zIndex to set
     * @return 
     */
    public AxisLabels setZIndex(Integer zIndex) {
        this.zIndex = zIndex;
        return this;
    }

}