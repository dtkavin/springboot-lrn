package com.github.dtkavin.controller.http;

import com.github.dtkavin.entity.FlinkBizJobM;
import com.github.dtkavin.services.JobMetaMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-lrn
 * @description: mybatis测试
 * @author: zhangzhiyong
 * @create: 2019-04-22 12:02
 **/
@RestController
@RequestMapping("/mybatis/job")
public class MybatisHelloController {
    @Autowired
    private JobMetaMService mybatisService;

    @RequestMapping("/findById")
    public FlinkBizJobM getFlinkJobById(@RequestParam Long jobId) {
        return mybatisService.findJobByJobId(jobId);
    }

}
