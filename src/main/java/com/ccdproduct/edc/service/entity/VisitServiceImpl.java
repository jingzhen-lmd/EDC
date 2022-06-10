package com.ccdproduct.edc.service.entity;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ccdproduct.edc.mapper.VisitMapper;
import com.ccdproduct.edc.pojo.Visit;
import org.springframework.stereotype.Service;

@Service
public class VisitServiceImpl extends ServiceImpl<VisitMapper, Visit> implements VisitService {
}
