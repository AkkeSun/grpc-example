package com.grpcclient.service;

import com.grpcclient.dto.FindUserAppVersionResponse;
import grpc.chameleon.ChameleonGrpc.ChameleonBlockingStub;
import grpc.chameleon.FindUserAppVersionGprcRequest;
import grpc.chameleon.FindUserAppVersionGrpcResponse;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class FindUserAppVersionService {

    @GrpcClient("chameleon")
    private ChameleonBlockingStub chameleon;

    public FindUserAppVersionResponse saveUser (String userId) {

        FindUserAppVersionGprcRequest request = FindUserAppVersionGprcRequest.newBuilder()
            .setUserId(userId)
            .setOs("iOS")
            .setShopLoginId("1234")
            .setShopCode("02")
            .build();
        try {
            FindUserAppVersionGrpcResponse response = chameleon.findUserAppVersion(request);
            return new FindUserAppVersionResponse().of(response);
        } catch (Exception e) {
            return FindUserAppVersionResponse.builder()
                .result(false)
                .errMessage("server error - " + e)
                .build();
        }
    }
}
