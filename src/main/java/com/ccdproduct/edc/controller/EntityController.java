package com.ccdproduct.edc.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ccdproduct.edc.pojo.RowData;
import com.ccdproduct.edc.pojo.TestData;
import com.ccdproduct.edc.pojo.User;
import com.ccdproduct.edc.pojo.VisitType;
import com.ccdproduct.edc.pojo.generate.ActiveMenu;
import com.ccdproduct.edc.pojo.generate.MenuFactory;
import com.ccdproduct.edc.service.entity.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试控制器，测试用
 */
@RestController
public class EntityController {

    @Autowired
    UserService userService;

    ObjectMapper mapper = new JsonMapper();

    @RequestMapping("getUser")
    public String getUser() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uuid", "12135qwe");
        return userService.getOne(queryWrapper).toString();
    }

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("getdata")
    public String getdata() throws JsonProcessingException {
        TestData data = new TestData();
        data.setName("asd");
        data.setAddress("asd");
        data.setCity("asd");
        data.setDate("asd");
        data.setZip("asd");
        List<TestData> list = new ArrayList<>();
        list.add(data);
        ObjectMapper mapper = new JsonMapper();
        return mapper.writeValueAsString(list);
    }

    @RequestMapping("getVisit")
    public String getVisit() throws JsonProcessingException {

        List<VisitType> list = new ArrayList<>();
        addVisit(list, "页面/访视", "col0");
        addVisit(list, "受试者", "col1");
        addVisit(list, "筛选访视01", "col2");
        addVisit(list, "随机化访视", "col3");
        addVisit(list, "结肠镜检查", "col4");
        addVisit(list, "访视02", "col5");
        addVisit(list, "随机访视03", "col6");
        addVisit(list, "随机访视04", "col7");
        addVisit(list, "独立访视", "col8");
        addVisit(list, "计划外访视", "col9");

        ObjectMapper mapper = new JsonMapper();
        return mapper.writeValueAsString(list);
    }

    private void addVisit(List<VisitType> list, String name, String rank) {
        VisitType visitType = new VisitType();
        visitType.setName(name);
        list.add(visitType);
    }

    @RequestMapping("getTableData")
    public String getTableData() throws JsonProcessingException {

        List<RowData> list = new ArrayList<>();
        addRowdata(list, "受试者表");
        addRowdata(list, "访视日期");
        addRowdata(list, "预筛选知情同意");
        addRowdata(list, "免疫组织化学检测");
        addRowdata(list, "人口学资料");
        addRowdata(list, "知情同意");
        addRowdata(list, "肺功能检查");

        ObjectMapper mapper = new JsonMapper();
        return mapper.writeValueAsString(list);
    }

    private void addRowdata(List<RowData> list, String name) {
        RowData rowData = new RowData();
        rowData.setCol0(name);
        list.add(rowData);
    }

    //    动态路由，获取菜单栏
    @RequestMapping("getMenu")
    public String getMenu() throws JsonProcessingException {
        MenuFactory factory = new MenuFactory();

//       todo 区分不同组，还是要加二级目录
        ActiveMenu chooseVisit = factory.createMenu("筛选访视01");
        Map<String, String> menuItems = new HashMap<>();
        menuItems.put("访视日期", "/menu/1-2/VisitDate");
        menuItems.put("知情同意", "/menu/1-2/InformedConsent");
        menuItems.put("人口统计学资料", "/menu/1-2/Demographics");
        menuItems.put("既往史", "/menu/1-2/PastHistory");
        menuItems.put("过敏史", "/menu/1-2/AllergicHistory");
        menuItems.put("家族史", "/menu/1-2/FamilyHistory");
        menuItems.put("结肠镜检查原因", "/menu/1-2/suiji");
        factory.batchAddMenuItem(chooseVisit, menuItems);

        ActiveMenu randomVisit = factory.createMenu("随机化访视01A");
        Map<String, String> menuItems2 = new HashMap<>();
        menuItems2.put("访视日期", "/menu/1-2/VisitDate");
        menuItems2.put("入选排除标准", "/menu/1-2/InclusionStandard");
        menuItems2.put("筛选结果", "/menu/1-2/ScreeningResults");
        menuItems2.put("分发IMP和肠道清洁制剂", "/menu/1-2/suiji");
        factory.batchAddMenuItem(randomVisit, menuItems2);

        ActiveMenu jiechang = factory.createMenu("结肠镜检查准备");
        Map<String, String> menuItems3 = new HashMap<>();
        menuItems3.put("结肠镜检查准备", "/menu/1-2/suiji");
        menuItems3.put("摄入肠道清洁制剂（D03）", "/menu/1-2/suiji");
        menuItems3.put("服用IMP", "/menu/1-2/suiji");
        factory.batchAddMenuItem(jiechang, menuItems3);

        ActiveMenu visit2 = factory.createMenu("访视02");

        ActiveMenu randomVisit3 = factory.createMenu("随机化访视03");

        ActiveMenu randomVisit4 = factory.createMenu("随机化访视04");


        List<ActiveMenu> list = new ArrayList<>();
        list.add(chooseVisit);
        list.add(randomVisit);
        list.add(jiechang);
        list.add(visit2);
        list.add(randomVisit3);
        list.add(randomVisit4);
        return mapper.writeValueAsString(list);
    }

}
