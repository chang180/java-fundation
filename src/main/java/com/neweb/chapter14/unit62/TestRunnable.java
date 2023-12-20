package com.neweb.chapter14.unit62;

public class TestRunnable implements Runnable {
    private String name;

    public TestRunnable(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Thread " + name + " start");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + name + " end");
    }
}
