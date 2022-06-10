package com.ccdproduct.edc.pojo.generate;

import com.ccdproduct.edc.pojo.basic.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 动态菜单对象
 * 返回给前端
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiveMenu extends Entity {
    private int menuType;
    private String tableName;
    private String path;
    private String icon;

    private List<ActiveMenu> children;
}
