package com.ccdproduct.edc.pojo;

import com.ccdproduct.edc.pojo.basic.Entity;
import lombok.Data;

/**
 * 实体类
 * 访视期
 */
@Data
public class Visit extends Entity {
    /**
     * 受试者
     */
    private String testerUuid;
    /**
     * 访视期类型
     */
    private String typeUuid;
    /**
     * 项目uuid
     */
    private String projectUuid;
    /**
     * 业务说明
     */
    private String note;
}
