package nl.pvanassen.highchart.api.shared;

import java.util.HashMap;
import java.util.Map;
import nl.pvanassen.highchart.api.base.BaseObject;

public class Style 
    extends     BaseObject
    implements  Styleable<Style> {

    private Map<String, String> properties;

    public Style() {
        properties = null;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public String getProperty(String property) {
        return properties != null ? properties.get(property) : null;
    }

    public Style setProperty(String property, String value) {
        if (properties == null) {
            properties = new HashMap<String, String>();
        }
        properties.put(property, value);
        return this;
    }
    
    @Override
    public Style style(
            final Style src) {
        if(src == null) {
            return this;
        }
        if(this.properties == null) {
            return this;
        }
        if(src.properties == null) {
            return this;
        }
        this.properties.putAll(src.properties);
        return this;
    }
}
