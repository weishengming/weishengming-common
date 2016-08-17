package com.weishengming.utils.jackson;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

/**
 * 日期序反列化格式
 * @author byshome
 * @version $Id: JacksonDateDeserializer.java, v 0.1 2015年4月3日 下午4:03:49 byshome Exp $
 */
public class JacksonDateDeserializer extends JsonDeserializer<Date> {

    private static final String dateFormat      = "yyyy-MM-dd HH:mm:ss";
    private static final String shortDateFormat = "yyyy-MM-dd";

    /**
     * 序列化
     * @see com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
     */
    @Override
    public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String strDate = p.getText();
        if (StringUtils.isBlank(strDate)) {
            return null;
        }
        strDate = strDate.trim();
        try {
            if (strDate.contains("-")) {
                SimpleDateFormat formatter;
                if (strDate.contains(":")) {
                    formatter = new SimpleDateFormat(dateFormat);
                } else {
                    formatter = new SimpleDateFormat(shortDateFormat);
                }
                Date dtDate = formatter.parse(strDate);
                return dtDate;
            } else if (strDate.matches("^\\d+$")) {
                Long lDate = new Long(strDate);
                return new Date(lDate);
            } else if (strDate
                .matches("^[A-Za-z]{3}\\s[A-Za-z]{3}\\s\\d{1,2}\\s(\\d{1,2}:){2}\\d{1,2}\\s[A-Za-z]{3}\\s\\d{4}$")) {
                //Mon Oct 19 00:00:00 CST 2015
                SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK);
                Date dtDate = formatter.parse(strDate);
                return dtDate;
            }
        } catch (Exception e) {
            throw new RuntimeException(String.format("parser %s to Date fail", strDate));
        }
        return null;
    }

    /**
     * 反序列化
     * @throws IOException 
     * @throws JsonProcessingException 
     * @see com.fasterxml.jackson.databind.JsonDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
     */
    @Override
    public Object deserializeWithType(JsonParser p, DeserializationContext ctxt,
                                      TypeDeserializer typeDeserializer) throws JsonProcessingException, IOException {
        return deserialize(p, ctxt);
    }
}
