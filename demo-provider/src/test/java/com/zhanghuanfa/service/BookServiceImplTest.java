package com.zhanghuanfa.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author zhanghuanfa  2018-02-07 10:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring.xml")
public class BookServiceImplTest {
    @Resource
    private BookService bookService;

    @Test
    public void updateBookNameById() throws Exception {

    }

}