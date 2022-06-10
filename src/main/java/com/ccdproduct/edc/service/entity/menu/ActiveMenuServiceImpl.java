package com.ccdproduct.edc.service.entity.menu;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ccdproduct.edc.mapper.visit.ActiveMenuMapper;
import com.ccdproduct.edc.pojo.generate.ActiveMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActiveMenuServiceImpl extends ServiceImpl<ActiveMenuMapper, ActiveMenu> implements ActiveMenuService {

    @Autowired
    ActiveMenuMapper mapper;

    @Override
    public List<ActiveMenu> queryActive(String menuUuid) {
        List<ActiveMenu> activeMenus = mapper.queryActive(menuUuid);
        return activeMenus;
    }
}
