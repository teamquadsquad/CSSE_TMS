package com.csse.csse_tms_back_end.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TransactionIdException extends RuntimeException{
    public TransactionIdException(String message) {
        super(message);
    }
}