package com.neweb.chapter8.unit43;

public class FTP extends Network {
    @Override
    public void connect() {
        System.out.println("FTP connect");
    }

    @Override
    public void disconnect() {
        System.out.println("FTP disconnect");
    }
}
