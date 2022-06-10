package com.ccdproduct.edc.pojo.basic;

import lombok.Data;

import java.util.Date;

/**
 * 实体
 * 表基类
 */
@Data
public class BasicTable extends Entity {
    /**
     * 项目
     */
    private String projectUuid;
    /**
     * 中心
     */
    private String centerUuid;
}
