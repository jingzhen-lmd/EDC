package com.ccdproduct.edc.controller.table;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ccdproduct.edc.comment.MyQuery;
import com.ccdproduct.edc.comment.MyUtils;
import com.ccdproduct.edc.comment.Result;
import com.ccdproduct.edc.pojo.basic.TableInfo;
import com.ccdproduct.edc.pojo.table.TVisitDay;
import com.ccdproduct.edc.service.table.VisitDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class VisitDayController {

    @Autowired
    VisitDayService service;

    /**
     * 获取访视期
     */
    @GetMapping("visitDay/uuid")
    public Result<TVisitDay> getVisitDayByUuid(@RequestParam("uuid") String uuid) {
        QueryWrapper<TVisitDay> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uuid", uuid);

        return Result.success(service.getOne(queryWrapper));
    }

    /**
     * 通过基本信息获取
     */
    @GetMapping("visitDay")
    public Result<TVisitDay> getVisitDay(@RequestParam("tester") String tester,
                                         @RequestParam("aMenuItem") String aMenuItem) {
        QueryWrapper<TVisitDay> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("tester", tester);
        queryWrapper.eq("aMenuItem", aMenuItem);
        TVisitDay one = service.getOne(queryWrapper);
        return Result.success(one);
    }

    /**
     * 保存访视期信息
     */
    @PostMapping("visitDay")
    public Result<TVisitDay> saveVisitDay(@RequestBody TVisitDay visitDay) {
        if (visitDay.getVisitDate() == null)
            return Result.fail_null("visitDay");

        Map<String, Object> removeCol = new HashMap<>();
        removeCol.put("uuid", visitDay.getUuid());
        service.removeByMap(removeCol);

        visitDay.setUuid(MyUtils.genUuid());
        service.save(visitDay);

        return Result.success(visitDay);
    }
}
