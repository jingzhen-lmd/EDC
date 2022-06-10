package com.ccdproduct.edc.service.entity;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ccdproduct.edc.pojo.Project;

import java.util.List;

public interface ProjectService extends IService<Project> {

    List<Project> queryByUser(String userUuid);
}
