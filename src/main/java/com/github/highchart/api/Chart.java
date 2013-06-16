package com.github.highchart.api;



import com.github.highchart.api.base.BaseObject;
import com.github.highchart.api.shared.SeriesType;

public class Chart extends BaseObject {
    public String  zoomType;

    public String  backgroundColor;

    public Integer marginRight;

    public Integer marginBottom;

    public Integer width;

    public Integer height;

    public String  defaultSeriesType;

    public int     marginLeft;

    public int     marginTop;

    public Object  renderTo;

    public Object  renderer;

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getDefaultSeriesType() {
        return defaultSeriesType;
    }

    public int getHeight() {
        return height;
    }

    public int getMarginBottom() {
        return marginBottom;
    }

    public int getMarginLeft() {
        return marginLeft;
    }

    public int getMarginRight() {
        return marginRight;
    }

    public int getMarginTop() {
        return marginTop;
    }

    public Object getRenderer() {
        return renderer;
    }

    public Object getRenderTo() {
        return renderTo;
    }

    public int getWidth() {
        return width;
    }

    public String getZoomType() {
        return zoomType;
    }

    public Chart setBackgroundColor( String backgroundColor ) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public Chart setDefaultSeriesType( SeriesType type ) {
        defaultSeriesType = type.name();
        return this;
    }

    public Chart setHeight( int height ) {
        this.height = height;
        return this;
    }

    public Chart setMarginBottom( int marginBottom ) {
        this.marginBottom = marginBottom;
        return this;
    }

    public Chart setMarginLeft( int marginLeft ) {
        this.marginLeft = marginLeft;
        return this;
    }

    public Chart setMarginRight( int marginRight ) {
        this.marginRight = marginRight;
        return this;
    }

    public Chart setMarginTop( int marginTop ) {
        this.marginTop = marginTop;
        return this;
    }

    public void setRenderer( Object renderer ) {
        this.renderer = renderer;
    }

    public void setRenderTo( Object renderTo ) {
        this.renderTo = renderTo;
    }

    public Chart setWidth( int width ) {
        this.width = width;
        return this;
    }

    public Chart setZoomType( String zoomType ) {
        this.zoomType = zoomType;
        return this;
    }

}
