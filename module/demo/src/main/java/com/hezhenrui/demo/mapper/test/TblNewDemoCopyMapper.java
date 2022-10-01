package com.hezhenrui.demo.mapper.test;

import com.hezhenrui.demo.domain.test.TblNewDemoCopy;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface TblNewDemoCopyMapper extends Mapper<TblNewDemoCopy> {
    int updateBatch(List<TblNewDemoCopy> list);

    int updateBatchSelective(List<TblNewDemoCopy> list);

    int batchInsert(@Param("list") List<TblNewDemoCopy> list);
}