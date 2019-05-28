package com.github.dtkavin.services;

import com.github.dtkavin.entity.FlinkBizJob;

public interface JobMetaService {

    FlinkBizJob findJobByJobId(Long jobId);

    FlinkBizJob findJobByOwner(String owner);
}
