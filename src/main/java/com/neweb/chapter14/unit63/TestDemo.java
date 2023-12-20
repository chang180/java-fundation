package com.neweb.chapter14.unit63;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println("main thread start");

        Thread t1 = new Thread(new TestThread("A"));
        Thread t2 = new Thread(new TestThread("B"));
        Thread t3 = new Thread(new TestThread("C"));

        t1.start();
        t2.start();
        t3.start();

        System.out.println("main thread end");
    }
}
