package com.github.highchart.api.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.github.highchart.api.shared.Jsonify;

@XmlAccessorType( XmlAccessType.NONE )
public class BaseObject implements Jsonify {

    @XmlTransient
    public Object innerHTML;

    @XmlTransient
    public Object userObject;

    public BaseObject() {
        super();
        userObject = null;
    }

    public Object getInnerHTML() {
        return innerHTML;
    }

    @SuppressWarnings( "unchecked" )
    public <T> T getUserObject() {
        return ( T ) userObject;
    }

    public void setInnerHTML( Object innerHTML ) {
        this.innerHTML = innerHTML;
    }

    public void setUserObject( Object userObject ) {
        this.userObject = userObject;
    }

    @Override
    public String toJson() {
        return GsonHelper.toJson( this );
    }

}