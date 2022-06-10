package com.ccdproduct.edc.controller.visit;

import com.ccdproduct.edc.pojo.menu.visitmenu.VisitMenuItem;
import lombok.Data;

import java.util.List;

/**
 * 接受的请求参数
 */
@Data
public class MenuItemData {
    private String visitMenuUuid;
    private List<VisitMenuItem> visitMenuItem;
}
