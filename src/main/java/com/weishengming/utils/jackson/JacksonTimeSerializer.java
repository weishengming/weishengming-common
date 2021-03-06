package com.weishengming.utils.jackson;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

/**
 * 时间格式序列化
 * 
 * @author byshome
 * @version $Id: JacksonTimeSerializer.java, v 0.1 2015年9月15日 下午2:58:40 byshome Exp $
 */
public class JacksonTimeSerializer extends JsonSerializer<Date> {
    /**
     * 时间格式序列化
     * @see com.fasterxml.jackson.databind.JsonSerializer#serialize(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
     */
    @Override
    public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException,
                                                                                        JsonProcessingException {
        if (value != null) {
            gen.writeNumber(value.getTime());
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
