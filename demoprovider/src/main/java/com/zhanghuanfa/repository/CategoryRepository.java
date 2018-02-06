package com.zhanghuanfa.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author zhanghuanfa  2018-02-06 18:18
 */
@Component
public class CategoryRepository {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public Integer updateById(Integer id) {
        String sql = "update category set cname = '男装女装' where id = ? ";
        return jdbcTemplate.update(sql, id);
    }
}
