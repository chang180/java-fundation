package com.neweb.chapter7.unit37;

public class WhileDemo {
    public static void main(String[] args) {
//        demo1();
//        demo2();
    }

    private static void demo2() {
        // do while demo
        int a = (int) (Math.random() * 10);
        System.out.println("a = " + a);
        do {
            a--;
            System.out.println("a - 1, a = " + a);
        } while (a > 5);
        System.out.println("a <= 5");
    }

    private static void demo1() {
        // while demo
        int a = (int) (Math.random() * 10);
        System.out.println("a = " + a);
        while (a > 5) {
            System.out.println("a > 5");
            a--;
            System.out.println("a - 1, a = " + a);
        }
        System.out.println("a <= 5");
    }
}
