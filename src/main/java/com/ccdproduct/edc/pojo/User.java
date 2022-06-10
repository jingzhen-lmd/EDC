package com.ccdproduct.edc.pojo;

import lombok.Data;

/**
 * 实体：登录用户
 */
@Data
public class User {
    private String userName;
    private String passWord;
    // 权限
    private String power;

}
