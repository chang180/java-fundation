package com.neweb.chapter10.unit54;

public class MyException extends Exception{
    private final String message;
    public MyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "test message: " + message;
    }

}
