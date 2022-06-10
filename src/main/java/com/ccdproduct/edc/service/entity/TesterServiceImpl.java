package com.ccdproduct.edc.service.entity;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ccdproduct.edc.mapper.TesterMapper;
import com.ccdproduct.edc.pojo.Tester;
import org.springframework.stereotype.Service;

@Service
public class TesterServiceImpl extends ServiceImpl<TesterMapper, Tester> implements TesterService {

    @Override
    public boolean save(Tester entity) {
        if (exist(entity))
            return false;
        return super.save(entity);
    }

    private boolean exist(Tester entity) {
        QueryWrapper<Tester> wrapper = new QueryWrapper<>();
        wrapper.eq("id", entity.getId());
        wrapper.eq("projectUuid", entity.getProjectUuid());
        wrapper.eq("centerUuid", entity.getCenterUuid());

        return !list(wrapper).isEmpty();
    }
}
