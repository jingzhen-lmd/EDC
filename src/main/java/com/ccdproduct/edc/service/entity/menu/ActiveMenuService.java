package com.ccdproduct.edc.service.entity.menu;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ccdproduct.edc.pojo.generate.ActiveMenu;
import com.ccdproduct.edc.pojo.menu.visitmenu.VisitMenuItem;

import java.util.List;

public interface ActiveMenuService extends IService<ActiveMenu> {

    List<ActiveMenu> queryActive(String menuUuid);
}
