package com.ccdproduct.edc.pojo.menu.visitmenu;

import com.ccdproduct.edc.pojo.basic.Entity;
import lombok.Data;

/**
 * 访视期明细
 */
@Data
public class VisitMenuItem extends Entity {
    private String visitMenuUuid;
    private String tableType;
    private String tableName;
    private int sequence;
}
