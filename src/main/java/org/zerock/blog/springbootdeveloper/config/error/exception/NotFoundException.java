package org.zerock.blog.springbootdeveloper.config.error.exception;

import org.zerock.blog.springbootdeveloper.config.error.ErrorCode;

public class NotFoundException extends BusinessBaseException{
    public NotFoundException(ErrorCode errorCode) {
        super(errorCode.getMessage(), errorCode);
    }
    public NotFoundException() {
        super(ErrorCode.NOT_FOUND);
    }
}
