package com.zhanghuanfa.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author zhanghuanfa  2018-02-05 17:58
 */
@Component
public class CategoryRepository {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public Integer updateToWorld(Integer id) {
        final String sql = "UPDATE category SET name = name + 2 WHERE id = ? ";
        return jdbcTemplate.update(sql, id);
    }

    public Integer updateToHello(Integer id) {
        final String sql = "UPDATE category SET name = 'hello' WHERE id = ? ";
        return jdbcTemplate.update(sql, id);
    }

    public String getName(Integer id) {
        final String sql = "SELECT name FROM category WHERE id = ? ";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, String.class);
    }
}
