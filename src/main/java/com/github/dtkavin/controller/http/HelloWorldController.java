package com.github.dtkavin.controller.http;

import com.alibaba.fastjson.JSONObject;
import com.github.dtkavin.entity.FlinkBizJob;
import com.github.dtkavin.services.JobMetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-lrn
 * @description: test
 * @author: zhangzhiyong
 * @create: 2019-04-17 12:08
 **/


@RestController
public class HelloWorldController {

    @Autowired
    private JobMetaService jobMetaService;

    @RequestMapping("/hello")
    public JSONObject index() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "aaa");
        jsonObject.put("age", 11L);
        return jsonObject;
    }

    @RequestMapping("/findjob")
    public FlinkBizJob findJobByJobId(@RequestParam Long jobId) {
        return jobMetaService.findJobByJobId(jobId);
    }

    @RequestMapping("/findJobByOwner")
    public FlinkBizJob flindJobByOwner(@RequestParam String owner) {
        return jobMetaService.findJobByOwner(owner);
    }

    @RequestMapping("/index")
    public String index(Model model, @RequestParam Long jobId) {
        FlinkBizJob job = jobMetaService.findJobByJobId(jobId);
        model.addAttribute("job", job);
        return "index";
    }
}
