package com.grpcclient.service;

import grpc.admin.SaveUserGrpc.SaveUserBlockingStub;
import grpc.admin.SaveUserInfoRequest;
import grpc.admin.SaveUserInfoResponse;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class GrpcService {

    @GrpcClient("test")
    private SaveUserBlockingStub saveUserBlockingStub;

    public SaveUserInfoResponse grpcProcess (String name) {
        SaveUserInfoRequest request = SaveUserInfoRequest
            .newBuilder()
            .setUsername(name)
            .build();
        return saveUserBlockingStub.saveUser(request);
    }
}
