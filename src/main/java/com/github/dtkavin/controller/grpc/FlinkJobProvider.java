package com.github.dtkavin.controller.grpc;

import com.apus.springboot.autoconfig.grpc.server.GrpcService;
import com.github.dtkavin.entity.FlinkBizJobM;
import com.github.dtkavin.face.FlinkJobGrpc;
import com.github.dtkavin.face.FlinkJobOuterClass;
import com.github.dtkavin.services.JobMetaMService;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: springboot-lrn
 * @description: grpc接口
 * @author: zhangzhiyong
 * @create: 2019-04-22 17:19
 **/
@GrpcService(FlinkJobGrpc.class)
public class FlinkJobProvider extends FlinkJobGrpc.FlinkJobImplBase {

    @Autowired
    private JobMetaMService mybatisService;

    @Override
    public void getJobById(FlinkJobOuterClass.MyReqeust request, StreamObserver<FlinkJobOuterClass.MyResponse> responseObserver) {
//        super.getJobById(request, responseObserver);

        long jobId = request.getJobId();
        FlinkBizJobM job = mybatisService.findJobByJobId(jobId);

        FlinkJobOuterClass.MyResponse.Builder builder = FlinkJobOuterClass.MyResponse.newBuilder();
        builder.setJobId(job.getJob_id());
        builder.setJobBranch(job.getJob_branch());
        builder.setJobTwig(job.getJob_twig());
        builder.setJobName(job.getJob_name());
        builder.setJobAlias(job.getJob_alias());
        builder.setRulesEtl(job.getRules_etl());
        builder.setJobOwner(job.getJob_owner());
        builder.setCreateTime(job.getCreate_time().getTime());
        builder.setUpdateTime(job.getUpdate_time().getTime());

        FlinkJobOuterClass.MyResponse myResponse = builder.build();
        responseObserver.onNext(myResponse);
        responseObserver.onCompleted();

    }
}
