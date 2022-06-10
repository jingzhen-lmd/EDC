package com.ccdproduct.edc.service.table;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ccdproduct.edc.pojo.table.AllergicHistory;

/**
 * 过敏史
 */
public interface AllergicHistoryService  extends IService<AllergicHistory> {

    AllergicHistory getAllergicHistoryByUuid(String uuid);

    String saveAllergicHistory(AllergicHistory allergicHistory);
}
