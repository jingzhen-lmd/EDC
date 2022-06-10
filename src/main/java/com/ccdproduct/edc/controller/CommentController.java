package com.ccdproduct.edc.controller;

import com.ccdproduct.edc.comment.Result;
import com.ccdproduct.edc.pojo.basic.TableType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/***
 * 公用映射，返回常用的数据
 */
@RestController
public class CommentController {


    /**
     * 获取访视表的所有类型
     */
    @GetMapping("tableType")
    public Result<List<TableType>> listTableType() {
        List<TableType> lists = Arrays.asList(TableType.values());

        return Result.success(lists);
    }
}
