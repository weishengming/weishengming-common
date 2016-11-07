package com.weishengming.hessian.lifeservice.api.service;

import java.util.Map;

import com.weishengming.hessian.lifeservice.api.bean.UserBean;

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
    public Map<String, String> validToken(String token, long time, Map<String, String> resultMap);

    /**
     * 通过手机号获得用户token
     */
    public String getTokenByMobile(String mobile);

    /**
     * 通过userId获得用户token
     */
    public String getTokenByUserId(String userId);

    /**
     *  获得用户信息
     */
    public UserBean findUserByUserId(String userId);

    /**
     * 更新用户姓名
     */
    public Integer updateName(String userId, String name);

    /**
     * 更新用户年龄
     */
    public Integer updateAge(String userId, String age);

    /**
     * 更新个性签名
     */
    public Integer updateSign(String userId, String sign);

    /**
     * 更新性别
     */
    public Integer updateSex(String userId, String sex);

}