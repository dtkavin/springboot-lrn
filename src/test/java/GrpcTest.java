import com.github.dtkavin.face.FlinkJobGrpc;
import com.github.dtkavin.face.FlinkJobOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: springboot-lrn
 * @description: grpc test
 * @author: zhangzhiyong
 * @create: 2019-04-22 19:55
 **/

@Slf4j
@RunWith(SpringRunner.class)
public class GrpcTest {

    private FlinkJobGrpc.FlinkJobBlockingStub blockingStub;


    @Test
    public void test() {
        Long jobId=1000000004L;
        ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 30071).usePlaintext(true).build();

        FlinkJobOuterClass.MyReqeust.Builder builder = FlinkJobOuterClass.MyReqeust.newBuilder();
        builder.setJobId(jobId);
        blockingStub=FlinkJobGrpc.newBlockingStub(channel);
        FlinkJobOuterClass.MyResponse response = blockingStub.getJobById(builder.build());
        System.out.println(response.getJobAlias());
        System.out.println("--》 "+response.getJobOwner());
    }

}
