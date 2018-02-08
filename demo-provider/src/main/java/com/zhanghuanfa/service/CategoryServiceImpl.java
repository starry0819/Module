package com.zhanghuanfa.service;

import com.zhanghuanfa.bussiness.CategoryBusinessImpl;
import com.zhanghuanfa.repository.CategoryRepository;
import com.zhanghuanfa.repository.UserRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author zhanghuanfa  2018-02-05 17:57
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryRepository categoryRepository;
    @Resource
    private CategoryService categoryService;
    @Resource
    private CategoryBusinessImpl categoryBusinessImpl;
    @Resource
    private UserRepository userRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void txOnInterfaceMethod(Integer id) {
        Integer execute = categoryRepository.updateToWorld(id);
        System.out.println(execute);
        throw new RuntimeException("This is a RuntimeException in txInterfaceMethod");
    }

    @Override
    public void txOnLocalMethod(Integer id) {
        txOnInterfaceMethod(id);
    }

    @Override
    public void invokeTxInterfaceMethod(Integer id) {
        categoryService.txOnInterfaceMethod(id);
    }

    @Override
    public void invokeTxBusinessMethod(Integer id) {
        userRepository.updateUser(id);
        categoryBusinessImpl.txOnBusiness(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void txWith2DataBase(Integer id) {
        userRepository.updateUser(id);
        localMethod(id);
    }

    private void localMethod(Integer id) {
        categoryRepository.updateToWorld(id);
        throw new RuntimeException("This is a RuntimeException in localMethod");
    }

}
