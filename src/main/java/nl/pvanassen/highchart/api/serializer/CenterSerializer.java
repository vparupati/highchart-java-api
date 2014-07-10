package nl.pvanassen.highchart.api.serializer;

import java.lang.reflect.Type;

import nl.pvanassen.highchart.api.serie.SeriesCenter;

import com.google.gson.*;

public class CenterSerializer implements JsonSerializer<SeriesCenter> {

    @Override
    public JsonElement serialize(SeriesCenter center, Type arg1, JsonSerializationContext arg2) {
        if (center.getX() == null || center.getY() == null) {
            return new JsonPrimitive("");
        }
        JsonArray r = new JsonArray();
        r.add(new JsonPrimitive(center.getX()));
        r.add(new JsonPrimitive(center.getY()));
        return r;
    }

}
