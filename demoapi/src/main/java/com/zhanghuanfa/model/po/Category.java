package com.zhanghuanfa.model.po;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhanghuanfa  2018-02-06 18:16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable {
    private static final long serialVersionUID = 2089061245067037969L;

    private Integer id;
    private String cname;
}
