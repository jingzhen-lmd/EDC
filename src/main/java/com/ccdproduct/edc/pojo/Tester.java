package com.ccdproduct.edc.pojo;

import com.ccdproduct.edc.pojo.basic.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 实体：受试者
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tester extends Entity {
    /**
     * 实验中使用的编号
     */
    private int id;
    private String projectUuid;
    private String centerUuid;

    private String name;


}
