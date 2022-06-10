package com.ccdproduct.edc.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ccdproduct.edc.pojo.VisitType;
import com.ccdproduct.edc.service.entity.VisitTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 访视查询
 */
@RestController
public class VisitTypeController {

    @Autowired
    VisitTypeService service;

//    查询项目访视期种类
    @GetMapping("visitType")
    public List<VisitType> queryVisitType(@RequestParam("projectUuid") String projectUuid,
                                         @RequestParam("centerUuid") String centerUuid) {
        QueryWrapper<VisitType> filter = new QueryWrapper<>();
        filter.eq("projectUuid", projectUuid);
        filter.eq("centerUuid", centerUuid);

        return service.list(filter);
    }
}
