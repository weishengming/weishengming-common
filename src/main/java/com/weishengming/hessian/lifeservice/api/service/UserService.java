package com.weishengming.hessian.lifeservice.api.service;

/**
 * 用户service
 * @author yangtianci
 * @version $Id: UserService.java, v 0.1 2016年10月25日 下午5:00:03 yangtianci Exp $
 */
public interface UserService {
    /**
     * 保存用户
     */
    public Integer saveUser(String trueName, String password, String idCard, String mobile);

}