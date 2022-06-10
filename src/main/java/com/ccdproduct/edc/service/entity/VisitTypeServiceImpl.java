package com.ccdproduct.edc.service.entity;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ccdproduct.edc.mapper.VisitTypeMapper;
import com.ccdproduct.edc.pojo.VisitType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitTypeServiceImpl extends ServiceImpl<VisitTypeMapper, VisitType> implements VisitTypeService {

    @Autowired
    VisitTypeMapper mapper;

    @Override
    public List<VisitType> queryByProject(String projectUuid, String centerUuid) {

//        这里也可以拼接查询语句
//        mapper.selectList()

        return mapper.queryByProject(projectUuid, centerUuid);
    }
}
