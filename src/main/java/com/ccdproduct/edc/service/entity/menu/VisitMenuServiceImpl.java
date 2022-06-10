package com.ccdproduct.edc.service.entity.menu;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ccdproduct.edc.comment.MyUtils;
import com.ccdproduct.edc.mapper.visit.VisitMenuMapper;
import com.ccdproduct.edc.pojo.menu.visitmenu.VisitMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitMenuServiceImpl extends ServiceImpl<VisitMenuMapper, VisitMenu> implements VisitMenuService {

    @Autowired
    VisitMenuMapper mapper;

    @Override
    public void saveMenu(List<VisitMenu> menus) throws Exception {
//        1、校验数据合法性
        String projectUuid = menus.get(0).getProjectUuid();
        String centerUuid = menus.get(0).getCenterUuid();
        if (MyUtils.isNull(projectUuid) || MyUtils.isNull(centerUuid)) {
            throw new Exception("缺少项目、中心号:" + projectUuid + centerUuid);
        }

//        2、删除之前菜单下存在的所有菜单、先不删除子菜单
        QueryWrapper<VisitMenu> wrapper = new QueryWrapper<>();
        wrapper.eq("projectUuid", projectUuid);
        wrapper.eq("centerUuid", centerUuid);
        int delete = mapper.delete(wrapper);

        // 3、保存所有菜单
        for (int i = 0; i < menus.size(); i++) {
            VisitMenu menu = menus.get(i);
            if (MyUtils.isNull(menu.getUuid()))
                menu.setUuid(MyUtils.genUuid());
            menu.setSequence(String.valueOf(i));
            mapper.insert(menu);
        }
    }

    @Override
    public List<VisitMenu> getMenu(String projectUuid, String centerUuid) {
        QueryWrapper<VisitMenu> wrapper = new QueryWrapper<>();
        wrapper.eq("projectUuid", projectUuid);
        wrapper.eq("centerUuid", centerUuid);
        wrapper.orderByAsc("sequence");

        return mapper.selectList(wrapper);
    }


}
