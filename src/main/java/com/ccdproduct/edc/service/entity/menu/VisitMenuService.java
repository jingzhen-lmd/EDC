package com.ccdproduct.edc.service.entity.menu;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ccdproduct.edc.pojo.menu.visitmenu.VisitMenu;

import java.util.List;

public interface VisitMenuService extends IService<VisitMenu> {

    void saveMenu(List<VisitMenu> menus) throws Exception;

    /**
     * 通过基本信息，获取目录
     */
    List<VisitMenu> getMenu(String projectUuid,String centerUuid);
}
