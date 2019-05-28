package com.github.dtkavin.services;

import com.github.dtkavin.entity.FlinkBizJobM;

public interface JobMetaMService {
    FlinkBizJobM findJobByJobId(Long jobId);
}
