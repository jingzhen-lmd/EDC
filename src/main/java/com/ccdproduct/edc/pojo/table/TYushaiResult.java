package com.ccdproduct.edc.pojo.table;

import com.ccdproduct.edc.comment.Bill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 预筛表单:
 * 预筛结果表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TYushaiResult extends Bill {
    // 筛选结果
    private boolean result;
}
