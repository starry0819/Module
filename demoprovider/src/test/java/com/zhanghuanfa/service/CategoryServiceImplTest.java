package com.zhanghuanfa.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author zhanghuanfa  2018-02-06 18:25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring.xml")
public class CategoryServiceImplTest {

    @Resource
    private CategoryService categoryService;

    @Test
    public void updateById() throws Exception {
        categoryService.updateById(1);
    }

}