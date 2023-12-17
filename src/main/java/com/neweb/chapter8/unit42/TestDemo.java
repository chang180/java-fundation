package com.neweb.chapter8.unit42;

public class TestDemo {
    public static void main(String[] args) {
        File file = new Multimedia();
        System.out.println(file.getFileName());
    }

    public void process(File file, Network net){
        net.connect();
        file.getFileName();
        net.transfer(file.getFileName());
    }
}
