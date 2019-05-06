package com.roro.msconsumertimeoutdemo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MyTimeoutException extends RuntimeException {

    private Integer code;

    private String msg;
}
