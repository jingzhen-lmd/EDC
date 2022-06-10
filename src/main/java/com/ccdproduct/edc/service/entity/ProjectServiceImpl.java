package com.ccdproduct.edc.service.entity;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ccdproduct.edc.mapper.ProjectMapper;
import com.ccdproduct.edc.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl extends ServiceImpl<ProjectMapper, Project> implements ProjectService{

    @Autowired
    ProjectMapper mapper;

    @Override
    public List<Project> queryByUser(String userUuid) {
        return mapper.queryByUser(userUuid);
    }
}
