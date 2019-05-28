package com.github.dtkavin.repository;

import com.github.dtkavin.entity.FlinkBizJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

public interface FlinkBizJobRepository extends JpaRepository<FlinkBizJob, Long> {

    @Transient
    FlinkBizJob findFlinkBizJobByJobId(Long jobId);

    @Transactional(timeout = 10)
    @Query("select j from FlinkBizJob j where j.jobOwner =?1")
    FlinkBizJob findByOwner(String owner);
}
