package com.zhanghuanfa.model.po;

import java.io.Serializable;

import lombok.Data;

/**
 * @author zhanghuanfa  2018-02-07 10:07
 */
@Data
public class Book implements Serializable {
    private static final long serialVersionUID = 5281606656547650833L;

    private Integer id;
    private String name;
}
