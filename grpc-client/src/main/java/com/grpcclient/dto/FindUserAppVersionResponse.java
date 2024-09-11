package com.grpcclient.dto;

import grpc.chameleon.FindUserAppVersionGrpcResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class FindUserAppVersionResponse {
    private boolean result;
    private String appVersion;
    private String errMessage;

    @Builder
    public FindUserAppVersionResponse(boolean result, String appVersion, String errMessage) {
        this.result = result;
        this.appVersion = appVersion;
        this.errMessage = errMessage;
    }

    public FindUserAppVersionResponse of(FindUserAppVersionGrpcResponse response) {
        return FindUserAppVersionResponse.builder()
            .result(response.getResult())
            .appVersion(response.getAppVersion())
            .build();
    }

}
