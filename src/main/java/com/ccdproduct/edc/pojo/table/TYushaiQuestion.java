package com.ccdproduct.edc.pojo.table;

import com.ccdproduct.edc.comment.Bill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 预筛表单:
 * 预筛选询问表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TYushaiQuestion extends Bill {
    // 是否进行筛选
    private boolean isStart;
}
