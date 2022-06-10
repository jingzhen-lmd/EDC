package com.ccdproduct.edc.pojo;

import com.ccdproduct.edc.pojo.basic.Entity;
import lombok.Data;

/**
 * 项目
 * 登陆后选中的项目
 */
@Data
public class Project extends Entity {
    private String name;
    private String note;
}
