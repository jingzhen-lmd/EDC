package com.ccdproduct.edc.controller.datapojo.OverviewPage;

import com.ccdproduct.edc.pojo.VisitState;
import com.ccdproduct.edc.pojo.basic.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 行数据
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RowData extends Entity {
    private String testerUuid;
    private String testerId;
    /**
     * 访视期状态
     */
    private List<VisitState> state;
}
