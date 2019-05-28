package com.github.dtkavin.services.impl;

import com.github.dtkavin.dao.FlinkBizJobMapper;
import com.github.dtkavin.entity.FlinkBizJobM;
import com.github.dtkavin.services.JobMetaMService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: springboot-lrn
 * @description: mybatis测试
 * @author: zhangzhiyong
 * @create: 2019-04-22 12:06
 **/
@Service("mybatisService")
public class JobMetaServiceMyBatisServiceImpl implements JobMetaMService {

    @Resource
    private FlinkBizJobMapper flinkBizJobMapper;

    @Override
    public FlinkBizJobM findJobByJobId(Long jobId) {
        return flinkBizJobMapper.findBizJobById(jobId);
    }

}
