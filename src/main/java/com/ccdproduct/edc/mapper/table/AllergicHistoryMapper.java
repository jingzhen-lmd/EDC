package com.ccdproduct.edc.mapper.table;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ccdproduct.edc.pojo.table.AllergicHistory;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AllergicHistoryMapper extends BaseMapper<AllergicHistory> {

    @Select("select * from Allergic_History t where uuid =#{uuid}")
    AllergicHistory getAllergicHistoryByUuid(String uuid);

    @Insert("insert into Allergic_History " +
            "(uuid,isAllergicHistory,testeruuid,projectuuid,centeruuid,tablename) " +
            "value (#{uuid},#{isAllergicHistory},#{testerUuid},#{projectUuid},#{centerUuid},#{tableName})")
    int saveAllergicHistory(AllergicHistory allergicHistory);

    @Update("update Allergic_History t set t.isAllergicHistory = #{isAllergicHistory} where uuid =#{uuid}")
    int updateAllergicHistory(AllergicHistory allergicHistory);


}
