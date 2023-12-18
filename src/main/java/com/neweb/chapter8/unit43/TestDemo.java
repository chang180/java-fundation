package com.neweb.chapter8.unit43;

public class TestDemo {
    public static void main(String[] args) {
        Network network = new FTP();
        network.transfer("TestFile.txt");
    }
}
