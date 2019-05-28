package com.github.dtkavin.dao;

import com.github.dtkavin.entity.FlinkBizJobM;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FlinkBizJobMapper {
    FlinkBizJobM findBizJobById(Long jobId);
}
