package com.ccdproduct.edc.controller.table;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ccdproduct.edc.pojo.table.TYushaiQuestion;
import com.ccdproduct.edc.service.table.TYushaiQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableController {

    @Autowired
    TYushaiQuestionService service;

    @GetMapping("question")
    public String getyushaiQuestion(@RequestParam("uuid") String uuid) {
        QueryWrapper<TYushaiQuestion> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uuid", uuid);
        return service.getOne(queryWrapper).toString();
    }




}
