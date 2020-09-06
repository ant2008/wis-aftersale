package com.wenc.core.adapter.gson;

import com.google.gson.*;

import java.lang.reflect.Type;

public class LongDefaultTypeAdapter implements JsonSerializer<Long>, JsonDeserializer<Long> {
    @Override
    public Long deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        try {
            if (jsonElement.getAsString().equals("") || jsonElement.getAsString().equals("null")) {//定义为int类型,如果后台返回""或者null,则返回0
                return Long.valueOf("0");
            }
        } catch (Exception ignore) {
        }


        try {
            return jsonElement.getAsLong();
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override
    public JsonElement serialize(Long aLong, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(aLong);
    }
}
