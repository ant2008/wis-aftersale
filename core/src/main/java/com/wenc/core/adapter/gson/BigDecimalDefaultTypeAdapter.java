package com.wenc.core.adapter.gson;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.math.BigDecimal;

public class BigDecimalDefaultTypeAdapter implements JsonSerializer<BigDecimal>, JsonDeserializer<BigDecimal> {
    @Override
    public BigDecimal deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        try {
            if (jsonElement.getAsString().equals("") || jsonElement.getAsString().equals("null")) {//定义为int类型,如果后台返回""或者null,则返回0
                return BigDecimal.ZERO;
            }
        } catch (Exception ignore) {
        }


        try {
            return jsonElement.getAsBigDecimal();
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override
    public JsonElement serialize(BigDecimal bigDecimal, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(bigDecimal);
    }
}
