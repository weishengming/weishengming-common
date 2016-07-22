package com.weishengming.exception;

import org.apache.commons.lang3.StringUtils;

import com.weishengming.enums.RetdCodeType;

/**
 * 业务异常处理 主要用于事务控制用的
 * @author yangtianci
 * @version $Id: BusinessException.java, v 0.1 2016年6月1日 下午3:54:42 yangtianci Exp $
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = -1417115819173227010L;
    /**
     * RetdCodeType 状态码
     */
    private int               status;

    /**
     * 返回错误的业务处理逻辑
     * @param 处理返回的状态码 @see RetdCodeType
     * @param message 错误消息
     */
    public BusinessException(int status, String message) {
        super(message);
        this.status = status;
    }

    /**
     * 返回错误的业务处理逻辑
     * @param 处理返回的状态码 @see RetdCodeType
     * @param message 错误消息
     */
    public BusinessException(RetdCodeType retdCodeType, String message) {
        this(retdCodeType.getStatus(), message);
    }

    /**
     * 返回错误的业务处理逻辑
     * @param 处理返回的状态码 @see RetdCodeType
     * @param message 错误消息
     */
    public BusinessException(int status, String message, Throwable cause) {
        super(message, cause);
        this.status = status;
    }

    /**
     * 返回错误的业务处理逻辑
     * @param 处理返回的状态码 @see RetdCodeType
     * @param message 错误消息
     */
    public BusinessException(RetdCodeType retdCodeType, String message, Throwable cause) {
        super(message, cause);
        this.status = retdCodeType.getStatus();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * 重写
     * @see java.lang.Throwable#toString()
     */
    @Override
    public String toString() {
        String s = getClass().getName();
        String message = getLocalizedMessage();
        StringBuilder strb = new StringBuilder();
        strb.append(s);
        if (StringUtils.isNotBlank(message)) {
            strb.append(": ");
            strb.append(message);
        }
        return strb.toString();
    }
}
