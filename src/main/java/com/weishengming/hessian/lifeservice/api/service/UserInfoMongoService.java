package com.weishengming.hessian.lifeservice.api.service;

import com.weishengming.hessian.lifeservice.api.bean.UserBean;

import java.util.Map;

/**
 * 测试mongodb
 */
public interface UserInfoMongoService {
    Integer insert(String userName,String passwordMd5);


}