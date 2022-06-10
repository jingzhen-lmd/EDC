package com.ccdproduct.edc.pojo.table;

import com.ccdproduct.edc.pojo.basic.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 预筛表单:
 * 知情同意表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TInformedConsent extends Table {
    /**
     * 是否同意
     */
    private boolean isAgree;
    /**
     * 签署日期
     */
    private Date logDate;
    /**
     * 方案版本
     */
    private String plainVersion;
    /**
     * 方案日期
     */
    private Date plainDate;
}
