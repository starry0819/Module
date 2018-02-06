package com.zhanghuanfa.bussiness;

import com.zhanghuanfa.repository.CategoryRepository;
import com.zhanghuanfa.service.CategoryService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author zhanghuanfa  2018-02-06 18:21
 */
@Service
public class CategoryBusinessImpl {

    @Resource
    private CategoryRepository categoryRepository;
    @Resource
    private CategoryService categoryService;

    @Transactional(rollbackFor = Exception.class)
    public void businessPrivate(Integer id) {
        categoryRepository.updateById(id);
        throw new RuntimeException("hello world");
    }

    public void businessPublic(Integer id) {
        businessPrivate(id);
    }
}
