package com.zhanghuanfa.bussiness;

import com.zhanghuanfa.MainTest;

import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author zhanghuanfa  2018-02-08 14:52
 */
public class CategoryBusinessImplTest extends MainTest {
    @Resource
    private CategoryBusinessImpl categoryBusiness;

    @Test
    public void txOnBusiness() throws Exception {
    }

    @Test
    public void txOnLocalBusinessPrivate() throws Exception {
        categoryBusiness.txOnLocalBusinessPrivate(2);
    }

}