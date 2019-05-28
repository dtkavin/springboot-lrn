package com.github.dtkavin.controller;

import com.github.dtkavin.SpringApplication;
import com.github.dtkavin.entity.FlinkBizJob;
import com.github.dtkavin.repository.FlinkBizJobRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: springboot-lrn
 * @description: repository测试
 * @author: zhangzhiyong
 * @create: 2019-04-18 09:53
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringApplication.class)
public class FlinkJobControllerTest {

    @Autowired
    private FlinkBizJobRepository flinkBizJobRepository;

    @Test
    public void test(){
        Long jobId=1000000002L;
//        FlinkBizJob flinkBizJob = flinkBizJobRepository.findFlinkBizJobByJobId(jobId);

//        System.out.println(flinkBizJob.getJobName());
    }
}
