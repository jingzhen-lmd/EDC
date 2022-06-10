package com.ccdproduct.edc.controller.table.tablemenu;

import com.ccdproduct.edc.comment.Result;
import com.ccdproduct.edc.pojo.generate.ActiveMenu;
import com.ccdproduct.edc.pojo.generate.MenuFactory;
import com.ccdproduct.edc.pojo.menu.visitmenu.VisitMenu;
import com.ccdproduct.edc.service.entity.menu.ActiveMenuService;
import com.ccdproduct.edc.service.entity.menu.VisitMenuItemService;
import com.ccdproduct.edc.service.entity.menu.VisitMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 动态菜单
 */
@RestController
public class ActiveMenuController {

    @Autowired
    VisitMenuService menuService;
    @Autowired
    VisitMenuItemService itemService;
    @Autowired
    ActiveMenuService service;


    /**
     * 动态路由，获取菜单
     *
     * @param projectUuid 项目uuid
     * @param centerUuid  中心uuid
     * @return 返回菜单
     */
    @RequestMapping("getMenu2")
    public Result<List<ActiveMenu>> getMenu(@RequestParam("projectUuid") String projectUuid,
                                            @RequestParam("centerUuid") String centerUuid) {
        MenuFactory factory = new MenuFactory();
        List<ActiveMenu> result = new ArrayList<>();

//       1、获取主目录
        List<VisitMenu> menus = menuService.getMenu(projectUuid, centerUuid);

        for (VisitMenu menu : menus) {
            ActiveMenu activeMenu = factory.transMenu(menu);
//           2、联合类型，直接查询所有表
            List<ActiveMenu> tables = service.queryActive(menu.getUuid());
            activeMenu.getChildren().addAll(tables);
            result.add(activeMenu);
        }
        return Result.success(result);
    }
}
