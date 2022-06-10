package com.ccdproduct.edc.pojo.basic;

import lombok.Data;

/**
 * 封装类：
 * 定位唯一表单的信息
 * 字段一般记uuid
 */
@Data
public class TableInfo {
    private String visitMenu;
    private String tableName;
    private String tester;
}
