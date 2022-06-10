package com.ccdproduct.edc.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ccdproduct.edc.comment.MyUtils;
import com.ccdproduct.edc.comment.Result;
import com.ccdproduct.edc.pojo.Tester;
import com.ccdproduct.edc.service.entity.TesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 受试者
 */
@RestController
public class TesterController {

    @Autowired
    TesterService service;


    @PostMapping("tester")
    public Result<String> createTester(@RequestBody Tester tester) {
        if (tester == null)
            return Result.fail_null("受试者为空");

        tester.setUuid(MyUtils.genUuid());
        boolean save = service.save(tester);

        return save ? Result.success("操作成功") : Result.fail("500","保存失败，id重复");
    }

    @GetMapping("tester")
    public List<Tester> queryTester(@RequestParam("projectUuid") String projectUuid,
                                    @RequestParam("centerUuid") String centerUuid) {
        QueryWrapper<Tester> filter = new QueryWrapper<>();
        filter.eq("projectUuid", projectUuid);
        filter.eq("centerUuid", centerUuid);

        return service.list(filter);
    }
}
