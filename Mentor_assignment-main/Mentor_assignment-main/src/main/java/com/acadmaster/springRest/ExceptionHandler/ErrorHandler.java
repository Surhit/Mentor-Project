package com.acadmaster.springRest.ExceptionHandler;

import lombok.Data;
@Data
public class ErrorHandler {
    private String timestamp;
    private String status;
    private String errorMessage;
}
