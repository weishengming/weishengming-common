package com.weishengming.enums;

/**
 * 错误返回enum定义
 * 
 * @author zhongminghua
 * @version $Id: RetdCodeType.java, v 0.1 2016年6月13日 下午10:44:41 zhongminghua Exp $
 */
public enum RetdCodeType {

    NO_RESULT("无数据", -1), FORBIDDEN("无权限", -2), BAD_REQUEST("请求参数错误", -3)

    ;

    /** 状态名 **/
    private final String  msg;

    /** 状态码 **/
    private final Integer status;

    private RetdCodeType(String msg, Integer status) {
        this.msg = msg;
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public Integer getStatus() {
        return status;
    }
}
