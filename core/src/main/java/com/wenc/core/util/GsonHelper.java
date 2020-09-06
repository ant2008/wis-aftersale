package com.wenc.core.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wenc.core.adapter.gson.*;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class GsonHelper {

    public static Gson getGson() {

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Integer.class, new IntegerDefaultTypeAdapter())
                .registerTypeAdapter(int.class, new IntegerDefaultTypeAdapter())
                .registerTypeAdapter(Double.class, new DoubleDefaultTypeAdapter())
                .registerTypeAdapter(double.class, new DoubleDefaultTypeAdapter())
                .registerTypeAdapter(Long.class, new LongDefaultTypeAdapter())
                .registerTypeAdapter(long.class, new LongDefaultTypeAdapter())
                .registerTypeAdapter(BigDecimal.class, new BigDecimalDefaultTypeAdapter())
                .create();


        return gson;
    }


    public static Gson getGsonAll() {

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Integer.class, new IntegerDefaultTypeAdapter())
                .registerTypeAdapter(int.class, new IntegerDefaultTypeAdapter())
                .registerTypeAdapter(Double.class, new DoubleDefaultTypeAdapter())
                .registerTypeAdapter(double.class, new DoubleDefaultTypeAdapter())
                .registerTypeAdapter(Long.class, new LongDefaultTypeAdapter())
                .registerTypeAdapter(long.class, new LongDefaultTypeAdapter())
                .registerTypeAdapter(BigDecimal.class, new BigDecimalDefaultTypeAdapter())
                .registerTypeAdapter(Timestamp.class, new TimestampDefaultTypeAdapter())
                .create();


        return gson;
    }
}
