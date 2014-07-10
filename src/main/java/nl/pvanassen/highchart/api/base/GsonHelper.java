package nl.pvanassen.highchart.api.base;

import java.lang.reflect.Type;
import java.math.BigDecimal;

import nl.pvanassen.highchart.api.format.DateTimeLabelFormats;
import nl.pvanassen.highchart.api.serializer.DateTimeLabelFormatsSerializer;
import nl.pvanassen.highchart.api.serializer.StyleSerializer;

import com.google.gson.*;

public final class GsonHelper {

    private static final String DATE_FORMAT = "yyyyMMdd";

    private static final String USER_OBJECT = "userObject";

    private static final GsonHelper INSTANCE = new GsonHelper();

    static String toJson(Object object) {
        return GsonHelper.INSTANCE.gsonBuilder.create().toJson(object);
    }

    private final GsonBuilder gsonBuilder;

    private GsonHelper() {
        gsonBuilder = new GsonBuilder()
        .registerTypeAdapter(DateTimeLabelFormats.class, new DateTimeLabelFormatsSerializer()) //
        .registerTypeAdapter(Style.class, new StyleSerializer())//
        .setDateFormat(GsonHelper.DATE_FORMAT)//
        .setExclusionStrategies(new ExclusionStrategy() {

            @Override
            public boolean shouldSkipClass(Class<?> arg0) {
                return false;
            }

            @Override
            public boolean shouldSkipField(FieldAttributes attributes) {
                return attributes.getName().equals(GsonHelper.USER_OBJECT);
            }

        }).registerTypeAdapter(Double.class, new JsonSerializer<Double>() {

                    @Override
            public JsonElement serialize(Double originalValue, Type typeOf, JsonSerializationContext context) {
                BigDecimal bigValue = BigDecimal.valueOf(originalValue);

                return new JsonPrimitive(bigValue.toPlainString());
            }
        });
    }
}
