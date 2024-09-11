package com.grpcclient.controller;

import com.grpcclient.dto.FindUserAppVersionResponse;
import com.grpcclient.service.FindUserAppVersionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final FindUserAppVersionService grpcService;
    @GetMapping ("/app-version")
    public FindUserAppVersionResponse test (String userId) {
        return grpcService.saveUser(userId);
    }

}
