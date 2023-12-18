package com.neweb.chapter8.unit43;

public abstract class Network{
    public void transfer(String fileName){
        connect();
        System.out.println("Download " + fileName);
        disconnect();
    }

    public abstract void connect();
    public abstract void disconnect();
}
