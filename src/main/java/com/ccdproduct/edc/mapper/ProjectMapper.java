package com.ccdproduct.edc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ccdproduct.edc.pojo.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjectMapper extends BaseMapper<Project> {


    @Select("select p.* from user_project u inner join project p on p.uuid = u.projectuuid " +
            "where u.userUuid=#{userUuid}")
    List<Project> queryByUser(String userUuid);
}
