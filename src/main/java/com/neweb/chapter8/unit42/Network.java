package com.neweb.chapter8.unit42;

public interface Network {
//    public static final String test = "test";
    public void connect();
    public void disconnect();
    public void transfer(String fileName);
}
