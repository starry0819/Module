package com.zhanghuanfa.bussiness;

import com.zhanghuanfa.repository.CategoryRepository;
import com.zhanghuanfa.repository.UserRepository;
import com.zhanghuanfa.service.CategoryService;
import com.zhanghuanfa.service.CategoryServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author zhanghuanfa  2018-02-07 17:27
 */
@Service
public class CategoryBusinessImpl {
    public static final String HELLO = "hello";
    @Resource
    private CategoryService categoryService;
    @Resource
    private CategoryRepository categoryRepository;
    @Resource
    private UserRepository userRepository;

    @Transactional(rollbackFor = Exception.class)
    public void txOnBusiness(Integer id) {
        String name = getName(id);
        Integer execute;
        if (CategoryBusinessImpl.HELLO.equals(name)) {
            execute = categoryRepository.updateToWorld(id);
        } else {
            execute = categoryRepository.updateToHello(id);
        }
        System.out.println(execute);
        throw new RuntimeException("This is a RuntimeException in txOnBusiness");
    }

    private String getName(Integer id) {
        return categoryRepository.getName(id);
    }

    public void txOnLocalBusinessPrivate(Integer id) {
        localPrivateTx(id);
        userRepository.updateUser(id);
    }

    @Transactional(rollbackFor = Exception.class)
    private void localPrivateTx(Integer id) {
        categoryRepository.updateToWorld(id);
        throw new RuntimeException();
    }
}
