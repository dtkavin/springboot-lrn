package com.github.dtkavin.services.impl;

import com.github.dtkavin.entity.FlinkBizJob;
import com.github.dtkavin.repository.FlinkBizJobRepository;
import com.github.dtkavin.services.JobMetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-lrn
 * @description: 实现
 * @author: zhangzhiyong
 * @create: 2019-04-17 20:53
 **/
@Service("jobMetaService")
public class JobMetaServiceImpl implements JobMetaService {

    @Autowired
    private FlinkBizJobRepository flinkBizJobRepository;

    @Override
    public FlinkBizJob findJobByJobId(Long jobId) {
        return flinkBizJobRepository.findFlinkBizJobByJobId(jobId);
    }

    @Override
    public FlinkBizJob findJobByOwner(String owner) {
        return flinkBizJobRepository.findByOwner(owner);
    }
}
