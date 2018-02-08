package com.zhanghuanfa.service;

/**
 * @author zhanghuanfa  2018-02-07 10:08
 */
public interface BookService {

    /**
     * 根据主键id更新书名
     * @param id
     * @return
     */
    int updateBookNameById(Integer id);
}
