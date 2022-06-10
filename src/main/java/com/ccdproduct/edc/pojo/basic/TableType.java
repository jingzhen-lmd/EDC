package com.ccdproduct.edc.pojo.basic;

/**
 * 表类型
 */
public enum TableType {

    受试者表("tester"),
    访视日期("fangshi"),
    知情同意("agree"),
    人口统计学资料("agree"),
    既往史("agree"),
    过敏史("agree"),
    家族史("agree"),
    结肠镜检查原因("agree"),
    体格检查("agree"),
    生命体征("agree"),
    血常规("agree"),
    血生化("agree"),
    凝血功能("agree"),
    尿液分析("agree"),
    导联心电图("agree"),
    G6PD酶检测("agree"),
    入选排除标准("agree"),
    分发IMP和肠道清洁制剂("agree"),
    结肠镜检查准备("agree"),
    摄入肠道清洁制剂("agree"),
    服用IMP("agree"),
    BBPS("agree"),
    结肠镜检查("agree"),
    病变总结页("agree"),
    镜下评估研究中心内镜医师("agree"),
    镜下评估中心阅片人("agree"),
    镜下评估裁决人("agree"),
    病变漏诊评估("agree"),
    组织病理学评估("agree"),
    电话随访("agree"),
    研究结束("agree"),
    不良事件("agree"),
    既往伴随用药("agree"),
    既往伴随非药物治疗("agree"),
    死亡信息("agree"),
    计划外询问页("agree");

    private String caption;

    TableType(String caption) {
        this.caption = caption;
    }
}
