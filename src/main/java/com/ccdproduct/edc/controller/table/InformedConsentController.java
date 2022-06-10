package com.ccdproduct.edc.controller.table;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ccdproduct.edc.comment.MyUtils;
import com.ccdproduct.edc.comment.Result;
import com.ccdproduct.edc.pojo.table.TInformedConsent;
import com.ccdproduct.edc.service.table.InformedConsentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 表：知情同意
 */
@RestController
public class InformedConsentController {

    @Autowired
    InformedConsentService service;

    /**
     * 获取表byUuid
     */
    @GetMapping("InformedConsent/uuid")
    public Result<TInformedConsent> getInformedConsentByUuid(@RequestParam("uuid") String uuid) {
        QueryWrapper<TInformedConsent> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uuid", uuid);

        return Result.success(service.getOne(queryWrapper));
    }

    /**
     * 通过基本信息获取
     */
    @GetMapping("InformedConsent")
    public Result<TInformedConsent> getInformedConsent(@RequestParam("tester") String tester,
                                                       @RequestParam("aMenuItem") String aMenuItem) {
        QueryWrapper<TInformedConsent> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("tester", tester);
        queryWrapper.eq("aMenuItem", aMenuItem);
        TInformedConsent one = service.getOne(queryWrapper);
        return Result.success(one);
    }

    /**
     * 保存表
     */
    @PostMapping("InformedConsent")
    public Result<TInformedConsent> saveVisitDay(@RequestBody TInformedConsent informedConsent) {
//        if (informedConsent.getVisitDate() == null)
//            return Result.fail_null("visitDay");

        Map<String, Object> removeCol = new HashMap<>();
        removeCol.put("uuid", informedConsent.getUuid());
        service.removeByMap(removeCol);

        informedConsent.setUuid(MyUtils.genUuid());
        service.save(informedConsent);

        return Result.success(informedConsent);
    }
}
