package com.github.highchart.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.github.highchart.api.base.BaseObject;


@XmlAccessorType( XmlAccessType.NONE )
public class Title extends BaseObject {

    @XmlElement
    public String   text;

    public Style style;

    @XmlElement
    public Integer  margin;

    public Title() {
        style = null;
        text = new String( "" );
    }

    public int getMargin() {
        return margin;
    }

    public Style getStyle() {
        if ( style == null ) {
            style = new Style();
        }
        return style;
    }

    public String getText() {
        return text;
    }

    public Title setMargin( int margin ) {
        this.margin = margin;
        return this;
    }

    public Title setText( String text ) {
        this.text = text;
        return this;
    }

}
