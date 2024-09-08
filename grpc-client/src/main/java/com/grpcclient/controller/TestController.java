package com.grpcclient.controller;

import com.grpcclient.service.GrpcService;
import grpc.admin.SaveUserInfoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final GrpcService grpcService;

    @GetMapping ("/test")
    public SaveUserInfoResponse test (String name) {
        return grpcService.grpcProcess(name);
    }
}
