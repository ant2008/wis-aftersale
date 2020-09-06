package com.wenc.core.adapter.gson;

import com.google.gson.*;

import java.lang.reflect.Type;

public class DoubleDefaultTypeAdapter implements JsonSerializer<Double>, JsonDeserializer<Double> {
    @Override
    public Double deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        try {
            if (jsonElement.getAsString().equals("") || jsonElement.getAsString().equals("null")) {//定义为int类型,如果后台返回""或者null,则返回0
                return Double.valueOf("0");
            }
        } catch (Exception ignore) {
        }


        try {
            return jsonElement.getAsDouble();
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override
    public JsonElement serialize(Double aDouble, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(aDouble);
    }
}
