package com.ccdproduct.edc.service.table;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ccdproduct.edc.comment.MyUtils;
import com.ccdproduct.edc.comment.StringUtil;
import com.ccdproduct.edc.mapper.table.AllergicHistoryMapper;
import com.ccdproduct.edc.pojo.table.AllergicHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllergicHistoryServiceImpl extends ServiceImpl<AllergicHistoryMapper, AllergicHistory>
        implements AllergicHistoryService {

    @Autowired
    AllergicHistoryMapper mapper;

    @Override
    public AllergicHistory getAllergicHistoryByUuid(String uuid) {
        return mapper.getAllergicHistoryByUuid(uuid);
    }

    @Override
    public String saveAllergicHistory(AllergicHistory resource) {
        int result;
        if (StringUtil.isnull(resource.getUuid())) {
            resource.setUuid(MyUtils.genUuid());
            result = mapper.saveAllergicHistory(resource);
        } else {
            result = mapper.updateAllergicHistory(resource);
        }
        return result == 1 ? "保存成功" : "保存失败";
    }


}
