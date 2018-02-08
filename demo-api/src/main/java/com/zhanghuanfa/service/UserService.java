package com.zhanghuanfa.service;

import com.zhanghuanfa.model.po.User;

/**
 * @author zhanghuanfa  2018-01-03 11:15
 */
public interface UserService {

    /**
     * 根据指定的一个或几个user信息查询User信息
     * @param user 包含一个或几个user信息的User的bean
     * @return User信息的Bean
     */
    User findUserByUser(User user);
}
