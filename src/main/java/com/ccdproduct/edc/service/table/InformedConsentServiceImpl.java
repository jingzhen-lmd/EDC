package com.ccdproduct.edc.service.table;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ccdproduct.edc.mapper.table.InformedConsentMapper;
import com.ccdproduct.edc.pojo.table.TInformedConsent;
import org.springframework.stereotype.Service;

@Service
public class InformedConsentServiceImpl extends ServiceImpl<InformedConsentMapper, TInformedConsent>
        implements InformedConsentService {
}
