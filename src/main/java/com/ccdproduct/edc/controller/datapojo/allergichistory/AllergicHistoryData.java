package com.ccdproduct.edc.controller.datapojo.allergichistory;

import com.ccdproduct.edc.pojo.basic.Table;

/**
 * 过敏史
 * 前端发送的表格数据
 */
public class AllergicHistoryData extends Table {
    private String isAllergicHistory;

    public String getIsAllergicHistory() {
        return isAllergicHistory;
    }

    public void setIsAllergicHistory(String isAllergicHistory) {
        this.isAllergicHistory = isAllergicHistory;
    }
}
