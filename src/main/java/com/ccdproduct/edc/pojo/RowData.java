package com.ccdproduct.edc.pojo;

import com.ccdproduct.edc.pojo.basic.Entity;
import lombok.Data;

@Data
public class RowData extends Entity {
    private String col0 = "页面 完成";
    private String col1 = " 完成";
    private String col2 = " 完成";
    private String col3 = " 完成";
    private String col4 = " 未完成";
    private String col5 = " 未完成";
    private String col6 = "";
    private String col7 = " 完成";
    private String col8 = "";
    private String col9 = "";

    private String state;
}
