package com.wenc.core.adapter.gson;

import cn.hutool.core.util.StrUtil;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


import com.google.gson.*;
import com.wenc.core.util.StringHelper;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Gson 转换Timestamp适配
 *
 * @author bruce 2019-4-20.
 */
public class TimestampDefaultTypeAdapter implements JsonSerializer<Timestamp>, JsonDeserializer<Timestamp> {

    /**
     *
     */
    private final DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //不带秒格式
    /**
     *
     */
    private final DateFormat formatdate = new SimpleDateFormat("yyyy-MM-dd");

    //USA格式
    /**
     *
     */
    private final DateFormat usFormat = new SimpleDateFormat("MMM dd,yyyy hh:mm:ss", Locale.US);



    private final DateFormat tFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");


    /**
     * <p>默认覆盖方法</p>
     *
     * <p>对于为空时间格式返回null
     * 对于带AM、PM的时间格式进行处理返回标准时间格式。
     * </p>
     *
     * @param jsonElement                json字符串
     * @param type                       类型
     * @param jsonDeserializationContext 上下文
     * @return Timestamp 数值
     * @throws JsonParseException
     */
    @Override
    public Timestamp deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (!(jsonElement instanceof JsonPrimitive)) {
            throw new JsonParseException("The date should be a string value");
        }

        String tmpDatestr = "";

        try {


            if (jsonElement == null ||
                    jsonElement.getAsString() == null
                    || jsonElement.getAsString().trim().equals("")) {
                return null;
            }

            //假如是数字,则直接按字符转换
            if (StringHelper.isInteger(jsonElement.getAsString())) {
                return new Timestamp(new Date(Long.valueOf(jsonElement.getAsString())).getTime());

            } else {

                if (jsonElement.getAsString().trim().indexOf(":") > 0) {
                    if (jsonElement.getAsString().trim().indexOf("AM") > 0 ||
                            jsonElement.getAsString().trim().indexOf("PM") > 0) {
                        Date date = (Date) usFormat.parse(jsonElement.getAsString());
                        return new Timestamp(date.getTime());

                    }else if(jsonElement.getAsString().trim().indexOf("T") > 0 )
                    {
                        Date date = (Date) tFormat.parse(jsonElement.getAsString());
                        return new Timestamp(date.getTime());
                    } else {

                        Date date = (Date) format.parse(jsonElement.getAsString());
                        return new Timestamp(date.getTime());
                    }
                } else {


                    Date date = (Date) formatdate.parse(jsonElement.getAsString());
                    return new Timestamp(date.getTime());
                }

            }
        } catch (ParseException e) {
            throw new JsonParseException(e);
        }
    }

    @Override
    public JsonElement serialize(Timestamp timestamp, Type type, JsonSerializationContext jsonSerializationContext) {


        String dfString = format.format(new Date(timestamp.getTime()));
        return new JsonPrimitive(dfString);
    }


}
