package com.ccdproduct.edc.controller;

import com.ccdproduct.edc.comment.Result;
import com.ccdproduct.edc.pojo.Project;
import com.ccdproduct.edc.service.entity.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 登陆后项目选择
 */
@RestController
public class ProjectController {

    @Autowired
    ProjectService service;

    @GetMapping("queryProject")
    public Result<List<Project>> queryProject(@RequestParam("userUuid") String userUuid) {
        List<Project> projects = service.queryByUser(userUuid);

        return Result.success(projects);
    }
}
