package com.ccdproduct.edc.service.entity;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ccdproduct.edc.pojo.VisitType;

import java.util.List;

public interface VisitTypeService extends IService<VisitType> {

    List<VisitType> queryByProject(String projectUuid, String centerUuid);
}
