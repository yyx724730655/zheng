package com.zheng.yyx.dao.mapper;

import com.zheng.yyx.dao.model.YyxPlayer;
import com.zheng.yyx.dao.model.YyxPlayerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyxPlayerMapper {
    long countByExample(YyxPlayerExample example);

    int deleteByExample(YyxPlayerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YyxPlayer record);

    int insertSelective(YyxPlayer record);

    List<YyxPlayer> selectByExample(YyxPlayerExample example);

    int updateByExampleSelective(@Param("record") YyxPlayer record, @Param("example") YyxPlayerExample example);

    int updateByExample(@Param("record") YyxPlayer record, @Param("example") YyxPlayerExample example);
}