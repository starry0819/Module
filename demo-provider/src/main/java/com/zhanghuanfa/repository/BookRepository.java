package com.zhanghuanfa.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author zhanghuanfa  2018-02-07 10:10
 */
@Component
public class BookRepository {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public int updateBookNameById(Integer id) {
        final String sql = "UPDATE book SET name = '东游记' WHERE id = ? ";
        return jdbcTemplate.update(sql, id);
    }
}
