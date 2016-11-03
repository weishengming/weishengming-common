package com.weishengming.hessian.lifeservice.api.bean;

import java.io.Serializable;

public class UserBean implements Serializable {
    /**  */
    private static final long serialVersionUID = 1L;
    private String            userId;
    private String            mobile;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
