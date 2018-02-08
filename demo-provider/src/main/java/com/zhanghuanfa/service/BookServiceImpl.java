package com.zhanghuanfa.service;

import com.zhanghuanfa.repository.BookRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author zhanghuanfa  2018-02-07 10:09
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookRepository bookRepository;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int updateBookNameById(Integer id) {
        int a = 1/0;
        System.out.println(a);
        return bookRepository.updateBookNameById(id);
    }
}
