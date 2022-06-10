package com.ccdproduct.edc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ccdproduct.edc.pojo.VisitType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.websocket.server.PathParam;
import java.util.List;

@Mapper
public interface VisitTypeMapper extends BaseMapper<VisitType> {


    @Select("select * from visit_type v where v.projectUuid=#{projectUuid} " +
            "and v.centerUuid=#{centerUuid} order by v.seq")
    List<VisitType> queryByProject(@PathParam("projectUuid") String projectUuid,
                                   @PathParam("centerUuid") String centerUuid);
}
