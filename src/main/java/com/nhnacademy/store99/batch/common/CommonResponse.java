package com.nhnacademy.store99.batch.common;

import lombok.Builder;

public class CommonResponse<T> {
    private final CommonHeader header;
    private final T result;

    @Builder
    private CommonResponse(CommonHeader header, T result) {
        this.header = header;
        this.result = result;
    }
}