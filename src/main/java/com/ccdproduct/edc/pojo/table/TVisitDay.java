package com.ccdproduct.edc.pojo.table;

import com.ccdproduct.edc.pojo.basic.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 表单: 访视日期
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TVisitDay extends Table {
    /**
     * 访视期
     */
    private Date visitDate;
}
