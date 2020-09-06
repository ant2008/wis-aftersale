package com.wenc.core.adapter.gson;

import com.google.gson.*;

import java.lang.reflect.Type;

public class IntegerDefaultTypeAdapter implements JsonSerializer<Integer>, JsonDeserializer<Integer> {
    @Override
    public Integer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        try {
            if (jsonElement.getAsString().equals("") || jsonElement.getAsString().equals("null")) {//定义为int类型,如果后台返回""或者null,则返回0
                return 0;
            }
        } catch (Exception ignore) {
        }


        try {
            return jsonElement.getAsInt();
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override
    public JsonElement serialize(Integer integer, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(integer);
    }
}
