package com.ccdproduct.edc.pojo.table;

import com.ccdproduct.edc.comment.Bill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 预筛表单:
 * 人员资料表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TYushaiPeopleData extends Bill {
    // 年龄
    private int age;
    // 生日
    private Date logDate;
    // 种族
    private String race;
    // 其他说明
    private String note;

}
