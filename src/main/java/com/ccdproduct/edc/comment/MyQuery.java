package com.ccdproduct.edc.comment;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ccdproduct.edc.pojo.basic.TableInfo;

/**
 * 构造基本的查询
 */
public class MyQuery<T> {


    /**
     * 构造表基本信息
     */
    public QueryWrapper<T> createInfo(TableInfo info) {
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("visitMenu", info.getVisitMenu());
        queryWrapper.eq("tableName", info.getTableName());
        queryWrapper.eq("tester", info.getTester());
        return queryWrapper;
    }
}
