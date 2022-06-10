package com.ccdproduct.edc.comment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表单基类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    private String uuid;
    // 受试者
    private String tester;
    // 实验中心
    private String center;
}
