package com.grpcserver.service;

import grpc.admin.SaveUserGrpc.SaveUserImplBase;
import grpc.admin.SaveUserInfoRequest;
import grpc.admin.SaveUserInfoResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class RegisterUserService extends SaveUserImplBase {

    @Override
    public void saveUser(SaveUserInfoRequest request,
        StreamObserver<SaveUserInfoResponse> responseObserver) {

        SaveUserInfoResponse response;
        if(request.getUsername().equals("od")){
            response = SaveUserInfoResponse.newBuilder()
                .setResult("N")
                .setMessage("이미 등록된 사용자 입니다.")
                .build();
        } else {
            response = SaveUserInfoResponse.newBuilder()
                .setResult("Y")
                .build();
        }

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
