package com.weishengming.utils.jackson;

import java.io.IOException;
import java.text.NumberFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public class NumberSerializer extends JsonSerializer<Number> {

    private static NumberFormat nf = NumberFormat.getNumberInstance();

    @Override
    public void serialize(Number value, JsonGenerator gen, SerializerProvider arg2) throws IOException,
                                                                                    JsonProcessingException {
        nf.setMinimumFractionDigits(2);
        nf.setGroupingUsed(false);
        if (null != value) {
            gen.writeString(nf.format(value));
        }
    }

    @Override
    public void serializeWithType(Number value, JsonGenerator gen, SerializerProvider serializers,
                                  TypeSerializer typeSer) throws IOException {
        serialize(value, gen, serializers);
    }

}
