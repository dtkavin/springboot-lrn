package com.github.dtkavin.entity;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @program: springboot-lrn
 * @description: flink任务
 * @author: zhangzhiyong
 * @create: 2019-04-17 18:26
 **/
@Data
@Entity
@Table(name = "rt_scm_biz_job")
@Proxy(lazy = false)
public class FlinkBizJob implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "job_id", length = 11)
    private Long jobId;
    @Column(name = "job_branch", nullable = false)
    private String jobBranch;
    @Column(name = "job_twig", nullable = false)
    private String jobTwig;
    @Column(name = "job_name", nullable = false)
    private String jobName;
    @Column(name = "job_alias", nullable = false)
    private String jobAlias;
    @Column(name = "rules_etl", nullable = false)
    private String rulesEtl;
    @Column(name = "conf_resource")
    private String confResource;
    @Column(name = "conf_channel")
    private String confChannel;
    @Column(name = "job_owner", nullable = false)
    private String jobOwner;
    @Column(name = "conf_monitor")
    private String confMonitor;
    @Column(name = "describe")
    private String describle;
    @Column(name = "stat", length = 11)
    private Integer state;

    @Column(name = "create_time", updatable = false, nullable = false)
    private Date createTime;
    @Column(name = "update_time", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date updateTime;

}
