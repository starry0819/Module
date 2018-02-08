package com.zhanghuanfa.model.po;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhanghuanfa  2018-01-03 10:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {
    private static final long serialVersionUID = 7968501750662840566L;
    /**主键id*/
    private Integer id;
    /**用户名*/
    private String name;
    /**密码*/
    private String password;
    /**用户类型*/
    private Integer userType;
}
