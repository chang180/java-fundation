package com.neweb.chapter14.unit64;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println("main thread start");

        Thread t1 = new Thread(new TestThread("A"));
        Thread t2 = new Thread(new TestThread("B"));


        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main thread end");
    }
}
