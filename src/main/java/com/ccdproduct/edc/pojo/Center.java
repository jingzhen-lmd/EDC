package com.ccdproduct.edc.pojo;

import lombok.Data;

/**
 * 实体：实验中心
 */
@Data
public class Center {
    private String uuid;
    // 编号
    private String number;
    // 中心名称
    private String name;
}
