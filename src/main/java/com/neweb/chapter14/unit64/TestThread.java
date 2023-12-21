package com.neweb.chapter14.unit64;

public class TestThread implements Runnable{
    private String name;

    public TestThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Thread " + name + " start");
        System.out.println("Thread " + name + " running");
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + name + " end");
    }
}
