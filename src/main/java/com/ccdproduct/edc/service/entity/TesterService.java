package com.ccdproduct.edc.service.entity;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ccdproduct.edc.pojo.Tester;

public interface TesterService extends IService<Tester> {

    @Override
    default boolean save(Tester entity) {
        return IService.super.save(entity);
    }
}
