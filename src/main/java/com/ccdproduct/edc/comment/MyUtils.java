package com.ccdproduct.edc.comment;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ccdproduct.edc.pojo.basic.Table;
import com.ccdproduct.edc.pojo.basic.TableInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.util.List;
import java.util.UUID;

/**
 * 工具类
 */
public class MyUtils {
    public static String genUuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }


    /**
     * 转为json格式
     */
    public static String toJson(Object o) {
        ObjectMapper mapper = new JsonMapper();
        String result = null;
        try {
            result = mapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static boolean isNull(String str) {
        return str == null || str.length() == 0;
    }

    public static <T> boolean checkNull(List<T> menus) {
        return menus == null || menus.isEmpty();
    }

}
