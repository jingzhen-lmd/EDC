package com.ccdproduct.edc.controller.datapojo.OverviewPage;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ccdproduct.edc.comment.MyUtils;
import com.ccdproduct.edc.comment.Result;
import com.ccdproduct.edc.pojo.Tester;
import com.ccdproduct.edc.pojo.VisitState;
import com.ccdproduct.edc.pojo.VisitType;
import com.ccdproduct.edc.pojo.menu.visitmenu.VisitMenu;
import com.ccdproduct.edc.service.entity.TesterService;
import com.ccdproduct.edc.service.entity.VisitService;
import com.ccdproduct.edc.service.entity.VisitTypeService;
import com.ccdproduct.edc.service.entity.menu.VisitMenuService;
import com.ccdproduct.edc.service.entity.visitstate.VisitStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 导航窗
 * 受试者一览表
 */
@RestController
public class OverViewController {

    @Autowired
    TesterService testerService;
    @Autowired
    VisitTypeService visitTypeService;
    @Autowired
    VisitStateService visitStateService;
    @Autowired
    VisitService visitService;
    @Autowired
    VisitMenuService menuService;

    /**
     * 构造受试者目录，总览信息
     *
     * @return 返回表信息
     */
    @GetMapping("overview2")
    public Result<List<Map<String, Object>>> constructionTable2(@RequestParam("projectUuid") String projectUuid,
                                                                @RequestParam("centerUuid") String centerUuid) {
        List<Map<String, Object>> table = new ArrayList<>();

//        1、访问所有的目录
        QueryWrapper<VisitMenu> menuWrapper = new QueryWrapper<>();
        menuWrapper.eq("projectUuid", projectUuid);
        menuWrapper.eq("centerUuid", centerUuid);
        List<VisitMenu> visitMenus = menuService.list(menuWrapper);

//        2、查询所有受试者
        QueryWrapper<Tester> testerWrapper = new QueryWrapper<>();
        testerWrapper.eq("projectUuid", projectUuid);
        testerWrapper.eq("centerUuid", centerUuid);
        testerWrapper.orderByAsc("id");
        List<Tester> testers = testerService.list(testerWrapper);

//        3、查询该收拾着在目录下的所有状态
        for (Tester t : testers) {
            QueryWrapper<VisitState> query = new QueryWrapper<>();
            query.eq("projectUuid", projectUuid);
            query.eq("centerUuid", centerUuid);
            query.eq("testerUuid", t.getUuid());
            //查询该受试者的所有状态，放入map中
            List<VisitState> visitStates = visitStateService.list(query);
            Map<String, VisitState> stateMap = new HashMap<>();
            for (VisitState state : visitStates) {
                stateMap.put(state.getVisitMenuUuid(), state);
            }

//          4、转换为行数据，取出map中对应的状态按列名顺序排列
            Map<String, Object> hang = new HashMap<>();
            hang.put("testerUuid", t.getUuid());
            hang.put("testerId", t.getId());
            for (VisitMenu menu : visitMenus) {
                boolean isExist = stateMap.get(menu.getUuid()) != null;

                hang.put(menu.getMenuName(),
                        isExist ? stateMap.get(menu.getMenuName()) : new VisitState());
            }

            table.add(hang);
        }

        return Result.success(table);
    }
}
