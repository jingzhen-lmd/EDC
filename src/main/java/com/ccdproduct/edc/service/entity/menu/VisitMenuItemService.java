package com.ccdproduct.edc.service.entity.menu;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ccdproduct.edc.pojo.menu.visitmenu.VisitMenuItem;

import java.util.List;

public interface VisitMenuItemService extends IService<VisitMenuItem> {

    void saveItems(String menuUuid, List<VisitMenuItem> items) throws Exception;

    /**
     * 查询菜单下所有子菜单明细
     *
     * @param visitMenuUuid 主菜单uuid
     * @return 菜单明细（表）
     */
    List<VisitMenuItem> listVisitMenuItem(String visitMenuUuid);

    /**
     * 获取菜单下所有子菜单明细（含配置）
     */


}
