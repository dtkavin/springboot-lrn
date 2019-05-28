package com.github.dtkavin.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: springboot-lrn
 * @description: flink任务
 * @author: zhangzhiyong
 * @create: 2019-04-17 18:26
 **/
@Data
public class FlinkBizJobM implements Serializable {

    private Long id;
    private Long job_id;
    private String job_branch;
    private String job_twig;
    private String job_name;
    private String job_alias;
    private String rules_etl;
    private String conf_resource;
    private String conf_channel;
    private String job_owner;
    private String conf_monitor;
    private String describle;
    private Integer state;

    private Date create_time;
    private Date update_time;

}
