package com.ust.Rating.exception;

public class RatingServiceCustomException extends RuntimeException{
    private String errorCode;
    private int status;

    public RatingServiceCustomException(String message, String errorCode, int status) {
        super(message);
        this.errorCode = errorCode;
        this.status = status;
    }
}
