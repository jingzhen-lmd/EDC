package com.ccdproduct.edc;

import com.ccdproduct.edc.mapper.table.AllergicHistoryMapper;
import com.ccdproduct.edc.pojo.generate.ActiveMenu;
import com.ccdproduct.edc.pojo.generate.MenuFactory;
import com.ccdproduct.edc.pojo.table.AllergicHistory;
import com.ccdproduct.edc.service.entity.menu.ActiveMenuService;
import com.ccdproduct.edc.service.table.AllergicHistoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class EdcApplicationTests {

    @Autowired
    AllergicHistoryMapper mapper;
    @Autowired
    AllergicHistoryService service;
    @Autowired
    ActiveMenuService activeMenuService;

    @Test
    void contextLoads() {

//        test01();
//        System.out.println(MyUtils.genUuid());
//        test02();
        test03();
    }

    private void test01() {
        MenuFactory factory = new MenuFactory();

        ActiveMenu chooseVisit = factory.createMenu("筛选访视01");
        Map<String, String> menuItems = new HashMap<>();
        menuItems.put("访视日期", "/daohang/1-2/VisitDate");
        menuItems.put("知情同意", "/daohang/1-2/VisitDate");
        menuItems.put("人口统计学资料", "/daohang/1-2/VisitDate");
        menuItems.put("既往史", "/daohang/1-2/VisitDate");
        menuItems.put("过敏史", "/daohang/1-2/VisitDate");
        menuItems.put("家族史", "/daohang/1-2/VisitDate");
        menuItems.put("结肠镜检查原因", "/daohang/1-2/VisitDate");
        factory.batchAddMenuItem(chooseVisit, menuItems);

        System.out.println((factory));
    }

    private void test02() {
        AllergicHistory allergicHistory = service.getAllergicHistoryByUuid("001");

        System.out.println(allergicHistory);
    }

    private void test03() {
        AllergicHistory data = new AllergicHistory();
        data.setIsAllergicHistory("yes");
        data.setUuid("001");
        int allergicHistory = mapper.updateAllergicHistory(data);
//        System.out.println(allergicHistory);
    }

    @Test
    public void test04(){
        List<ActiveMenu> activeMenus = activeMenuService.queryActive("433dde5a5a414bd89ffae9d930bdeb8f");
        System.out.println(activeMenus);
    }

}
