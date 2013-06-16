package com.github.highchart.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.github.highchart.api.base.BaseObject;


@XmlAccessorType( XmlAccessType.NONE )
public class Tooltip extends BaseObject {

    @XmlElement
    private Boolean crosshairs;

    @XmlElement
    private Boolean shared;

    private Object  formatter;

    public Object getFormatter() {
        return formatter;
    }

    public boolean isCrosshairs() {
        return crosshairs;
    }

    public boolean isShared() {
        return shared;
    }

    public Tooltip setCrosshairs( boolean b ) {
        crosshairs = b;
        return this;
    }

    public Tooltip setFormatter( Object formatter ) {
        this.formatter = formatter;
        return this;
    }

    public Tooltip setShared( boolean shared ) {
        this.shared = shared;
        return this;
    }

}
