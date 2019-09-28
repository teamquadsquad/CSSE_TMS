package com.csse.csse_tms_back_end.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TripIdException extends RuntimeException {
    public TripIdException(String message) {
        super(message);
    }
}
