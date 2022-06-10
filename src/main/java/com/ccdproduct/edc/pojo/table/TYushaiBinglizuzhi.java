package com.ccdproduct.edc.pojo.table;

import com.ccdproduct.edc.comment.Bill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 预筛表单:
 * GPC3检测，病理组织
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TYushaiBinglizuzhi extends Bill {
    // 是否进行GPC3检测
    private boolean isTestGPC3;
    // 采集日期
    private Date testDate;
    // 样本种类
    private String sampleType;
    // 其他
    private String note;
    // GPC3 IHC 结果
    private boolean gpcResult;
    // HScore分数
    private String hScore;
    // 染色强度-（单位%）
    private int chromosome0;
    // 染色强度+（单位%）
    private int chromosome1;
    // 染色强度++（单位%）
    private int chromosome2;
    // 染色强度+++（单位%）
    private int chromosome3;

}
