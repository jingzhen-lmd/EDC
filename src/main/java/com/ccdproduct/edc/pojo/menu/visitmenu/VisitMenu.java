package com.ccdproduct.edc.pojo.menu.visitmenu;

import com.ccdproduct.edc.pojo.basic.BasicTable;
import lombok.Data;

/**
 * 项目访视期目录类
 */
@Data
public class VisitMenu extends BasicTable {
    /**
     * 菜单名
     */
    private String menuName;
    /**
     * 菜单顺序
     */
    private String sequence;
}
