package com.github.highchart.api;

import java.util.HashMap;
import java.util.Map;

import com.github.highchart.api.base.BaseObject;


public class Style extends BaseObject {

    private Map<String, String> properties;

    public Style() {
        properties = null;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public String getProperty( String property ) {
        return ( properties != null ) ? properties.get( property ) : null;
    }

    public Style setProperty( String property, String value ) {
        if ( properties == null ) {
            properties = new HashMap<String, String>();
        }
        properties.put( property, value );
        return this;
    }

}
