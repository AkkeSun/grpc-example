package com.grpcserver.service;
import grpc.chameleon.ChameleonGrpc.ChameleonImplBase;
import grpc.chameleon.FindUserAppVersionGprcRequest;
import grpc.chameleon.FindUserAppVersionGrpcResponse;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
public class ChameleonService extends ChameleonImplBase {

    @Override
    public void findUserAppVersion(FindUserAppVersionGprcRequest request,
        StreamObserver<FindUserAppVersionGrpcResponse> responseObserver) {

        log.info("findUserAppVersion request: {}", request.toString().replaceAll("\\r?\\n", ", "));

        FindUserAppVersionGrpcResponse response;
        if(request.getUserId().equals("od")){
            response = FindUserAppVersionGrpcResponse.newBuilder()
                .setResult(true)
                .setAppVersion("1.2.3")
                .build();
        } else {
            response = FindUserAppVersionGrpcResponse.newBuilder()
                .setResult(false)
                .build();
        }

        log.info("findUserAppVersion response: {}", response.getAppVersion());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
