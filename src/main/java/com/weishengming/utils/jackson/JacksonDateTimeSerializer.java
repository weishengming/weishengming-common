package com.weishengming.utils.jackson;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

/**
 * 日期时间序列化实现
 * 
 * @author byshome
 * @version $Id: JacksonDateTimeSerializer.java, v 0.1 2015年9月15日 下午2:55:46 byshome Exp $
 */
public class JacksonDateTimeSerializer extends JsonSerializer<Date> {
    /**
     * 序列化
     * @see com.fasterxml.jackson.databind.JsonSerializer#serialize(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
     */
    @Override
    public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException,
                                                                                        JsonProcessingException {
        if (value != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = formatter.format(value);
            gen.writeString(formattedDate);
        }
    }

    /**
    * 序列化类型重写
    * 
    * @param value
    * @param gen
    * @param serializers
    * @param typeSer
    * @throws IOException 
    */
    @Override
    public void serializeWithType(Date value, JsonGenerator gen, SerializerProvider serializers, TypeSerializer typeSer)
                                                                                                                        throws IOException {
        serialize(value, gen, serializers);
    }
}
