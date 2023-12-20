package com.neweb.chapter14.unit62;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println("main thread start");

//        demo1();
        Thread t1 = new Thread(new TestRunnable("A"));
        Thread t2 = new Thread(new TestRunnable("B"));
        Thread t3 = new Thread(new TestRunnable("C"));

        t1.start();
        t2.start();
        t3.start();


        System.out.println("main thread end");
    }

    private static void demo1() {
        TestThread t1 = new TestThread("A");
        TestThread t2 = new TestThread("B");
        TestThread t3 = new TestThread("C");

        t1.start();
        t2.start();
        t3.start();
    }
}
