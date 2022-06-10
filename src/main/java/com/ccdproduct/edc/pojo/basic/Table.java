package com.ccdproduct.edc.pojo.basic;

import lombok.Data;

/**
 * 实体
 * 表基类
 */
@Data
public class Table extends Entity {
    /**
     * 受试者uuid
     */
    private String tester;
    /**
     * 动态菜单明细uuid
     */
    private String aMenuItem;

//    private String createUuid;
//    private String createName;
//    private Date createTime;
//    private String lastModifyUuid;
//    private String lastModifyName;
//    private Date lastModifyTime;
}
