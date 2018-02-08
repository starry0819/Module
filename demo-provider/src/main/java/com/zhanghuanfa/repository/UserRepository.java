package com.zhanghuanfa.repository;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.zhanghuanfa.model.po.User;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author zhanghuanfa  2018-01-17 15:52
 */
@Repository
public class UserRepository {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public User findUserByUser(User user) {
        StringBuilder sql = new StringBuilder("SELECT * FROM user WHERE 1=1 ");
        handleCondition(user, sql);
        return jdbcTemplate.queryForObject(sql.toString(), User.class);
    }

    private void handleCondition(User user, StringBuilder sql) {
        if (user.getId() != null) {
            sql.append(" AND id = ? ");
        }
        if (StringUtils.isNotEmpty(user.getName())) {
            sql.append(" AND name = ? ");
        }
        if (StringUtils.isNotEmpty(user.getPassword())) {
            sql.append(" AND password = ? ");
        }
        if (user.getUserType() != null) {
            sql.append(" AND user_type = ? ");
        }
    }

    public int updateUser(Integer id) {
        final String sql = "UPDATE test02.user SET age = age + 1 WHERE id =? ";
        return jdbcTemplate.update(sql, new Object[]{id});
    }

}
