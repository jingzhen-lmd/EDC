package com.ccdproduct.edc.mapper.visit;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ccdproduct.edc.pojo.generate.ActiveMenu;
import com.ccdproduct.edc.pojo.menu.visitmenu.VisitMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface VisitMenuMapper extends BaseMapper<VisitMenu> {

}
