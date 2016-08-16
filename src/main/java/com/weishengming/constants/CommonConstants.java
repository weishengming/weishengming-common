package com.weishengming.constants;

/**
 * 公共常量
 * @author yangtianci
 * @version $Id: CommonConstants.java, v 0.1 2016年6月1日 下午4:01:46 yangtianci Exp $
 */
public class CommonConstants {

    /**
     * 默认字符集
     */
    public static final String  DEFAULT_CHARSET                  = "utf-8";
    /**
     * 默认异常错误提醒
     */
    public static final String  BUSINESSEXCEPTION_DEFAULTMESSAGE = "服务器内部错误，请稍候再试";
    /**
     * API文档数据类型 字符型
     */
    public static final String  API_DATATYPE_STRING              = "string";
    /**
     * API文档参数类型 http头
     */
    public static final String  API_PARAMTYPE_HEADER             = "header";
    /**
     * http request track NO key
     */
    public static final String  HTTPREQUEST_TRACKNO_KEY          = "TrackNo";
    /**
     * application/json
     */
    public static final String  APPLICATION_JSON_VALUE           = "application/json";

    /**
     * 事件总线最大线程数
     */
    public static final Integer MAX_EVENTBUS_THREAD              = 5;

    /**
     * 默认缓存时间
     */
    public static final Integer DEFAULT_CACHE_EXPIRE_TIME        = 2;
}