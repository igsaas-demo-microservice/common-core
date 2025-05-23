package com.igsaas.common_core.common.exception.aabstract;

import lombok.Getter;

@Getter
public class AbstractExternalServiceException extends RuntimeException {

    private final String errorCode;
    private final String errorMessage;

    public AbstractExternalServiceException(final String errorCode,
                                            final String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}