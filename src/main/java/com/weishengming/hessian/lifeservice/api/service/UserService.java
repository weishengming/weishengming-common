package com.weishengming.hessian.lifeservice.api.service;

import java.util.Map;

/**
 * 用户service
 * @author yangtianci
 * @version $Id: UserService.java, v 0.1 2016年10月25日 下午5:00:03 yangtianci Exp $
 */
public interface UserService {

    /**
     * 检查用户的唯一性
     */
    public Boolean checkMobile(String mobile);

    /**
     * 保存用户
     */
    public Integer saveUser(String mobile, String password);

    /**
     * 校验手机和密码
     */
    public Boolean checkMobileAndPassword(String mobile, String password);

    /**
     * 校验token
     */
    public Map<String, String> validToken(String userId, String token, long time, Map<String, String> errInfo);

    /**
     * 通过手机号获得用户token
     */
    public String getTokenByMobile(String mobile);

    /**
     * 通过userId获得用户token
     */
    public String getTokenByUserId(String userId);

}