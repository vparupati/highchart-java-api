package com.github.highchart.api.serializer;

import java.util.Map;

import com.github.highchart.api.Style;
import com.github.highchart.api.base.Serializer;


public class StyleSerializer extends Serializer<Style> {

    @Override
    public Map<String, String> getProperties( Style instance ) {
        return instance.getProperties();
    }

}
