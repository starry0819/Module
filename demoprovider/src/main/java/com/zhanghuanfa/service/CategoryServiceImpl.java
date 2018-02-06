package com.zhanghuanfa.service;

import com.zhanghuanfa.bussiness.CategoryBusinessImpl;
import com.zhanghuanfa.repository.CategoryRepository;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhanghuanfa  2018-02-06 18:18
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryRepository categoryRepository;
    @Resource
    private CategoryBusinessImpl categoryBusinessImpl;

    @Override
    public void updateById(Integer id) {
        categoryBusinessImpl.businessPublic(id);
    }
}
