package com.ccdproduct.edc.controller.table;

import com.ccdproduct.edc.comment.MyUtils;
import com.ccdproduct.edc.controller.datapojo.allergichistory.AllergicHistoryData;
import com.ccdproduct.edc.pojo.basic.TableInfo;
import com.ccdproduct.edc.pojo.table.AllergicHistory;
import com.ccdproduct.edc.service.table.AllergicHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 过敏史
 */
@RestController
public class AllergicHistoryController {

    @Autowired
    AllergicHistoryService service;

    /**
     * uuid查询
     *
     * @return yes/no
     */
    @GetMapping("table/allergicHistory/uuid")
    public AllergicHistory getAllergicHistoryByUuid(@RequestParam String testerUuid) {
        return service.getAllergicHistoryByUuid(testerUuid);
    }

    /**
     * 基本信息查询
     *
     * @param info 表基本信息
     * @return AllergicHistory
     */
    @GetMapping("table/allergicHistory")
    public AllergicHistory getAllergicHistory(@RequestBody TableInfo info) {
        if (info == null)
            return null;
//        List<AllergicHistory> list = service.list(filter);

//        记录日志，这里不该返回两个
//        return list.isEmpty() ? null : list.get(0);
        return null;
    }

    /**
     * 保存
     */
    @PostMapping("table/allergicHistory")
    public String saveAllergicHistory(@RequestBody AllergicHistoryData data) {
//        AllergicHistory allergicHistory = transTable(data);
//        return service.saveAllergicHistory(allergicHistory);
        return null;
    }


}
