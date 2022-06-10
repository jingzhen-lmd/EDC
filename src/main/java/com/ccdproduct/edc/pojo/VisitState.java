package com.ccdproduct.edc.pojo;

import com.ccdproduct.edc.pojo.basic.BasicTable;
import lombok.Data;

/**
 * 实体类
 * 访视状态
 * 对应访视总览表中的受试者数据
 */
@Data
public class VisitState extends BasicTable {
    /**
     * 访视时期名称
     */
    private String testerUuid;
    /**
     * 访视期目录
     */
    private String visitMenuUuid;
    /**
     * 访视状态
     */
    private String state = "空";
}
