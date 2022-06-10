package com.ccdproduct.edc.pojo;

import com.ccdproduct.edc.pojo.basic.Entity;
import lombok.Data;

/**
 * 实体类
 * 访视时期列
 * 用于定义项目中的访视日期
 */
@Data
public class VisitType extends Entity {
    /**
     * 访视时期名称
     */
    private String name;
    /**
     * 项目uuid
     */
    private String projectUuid;
    /**
     * 中心uuid
     */
    private String centerUuid;
    /**
     * 顺序
     */
    private int seq;
}
