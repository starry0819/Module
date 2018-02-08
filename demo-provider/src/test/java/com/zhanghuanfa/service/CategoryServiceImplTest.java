package com.zhanghuanfa.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author zhanghuanfa  2018-02-07 11:48
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring.xml")
public class CategoryServiceImplTest {

    @Resource
    private CategoryService categoryService;

    // 注解接口方法，有效
    @Test
    public void txOnInterfaceMethod() throws Exception {
        categoryService.txOnInterfaceMethod(2);
    }

    // 普通接口方法直接调用注解接口方法，无效
    @Test
    public void txOnLocalMethod() throws Exception {
        categoryService.txOnLocalMethod(2);
    }

    // 普通接口方法通过接口调用注解接口方法，有效
    @Test
    public void invokeTxInterfaceMethod() throws Exception {
        categoryService.invokeTxInterfaceMethod(2);
    }

    // 注解接口方法直接调用普通接口方法，有效
    @Test
    public void txWith2DataBase() throws Exception {
        categoryService.txWith2DataBase(2);
    }

    // 普通接口方法调用business事务注解方法，有效
    @Test
    public void invokeTxBusinessMethod() throws Exception {
        categoryService.invokeTxBusinessMethod(2);
    }

}