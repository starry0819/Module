package com.zhanghuanfa.service;

/**
 * @author zhanghuanfa  2018-02-05 17:57
 */
public interface CategoryService {

    /**
     * 事务注解在接口方法上
     *
     * @param id 主键id
     */
    void txOnInterfaceMethod(Integer id);

    /**
     * 普通接口方法直接调用同类事务接口方法
     *
     * @param id 主键id
     */
    void txOnLocalMethod(Integer id);

    /**
     * 普通接口方法通过接口调用同类事务接口方法
     * @param id 主键id
     */
    void invokeTxInterfaceMethod(Integer id);

    void invokeTxBusinessMethod(Integer id);

    /**
     * a
     * @param id 主键id
     */
    void txWith2DataBase(Integer id);
}
