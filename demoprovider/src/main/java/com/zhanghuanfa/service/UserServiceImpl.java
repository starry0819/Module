package com.zhanghuanfa.service;

import com.zhanghuanfa.model.po.User;
import com.zhanghuanfa.repository.UserRepository;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhanghuanfa  2018-01-03 11:15
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    public User findUserByUser(User user) {
        return userRepository.findUserByUser(user);
    }
}
