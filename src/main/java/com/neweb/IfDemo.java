package com.neweb;

public class IfDemo {
    public static void main(String[] args) {
//        demo1();
        // if else if demo
        double a = Math.random()*10;
        System.out.println("a = " + a);
        if (a > 5) {
            System.out.println("a > 5");
        } else if (a > 3) {
            System.out.println("a > 3");
        } else {
            System.out.println("a <= 3");
        }
    }

    private static void demo1() {
        // if demo
        double a = Math.random()*10;
        System.out.println("a = " + a);
        if (a > 5) {
            System.out.println("a > 5");
        } else {
            System.out.println("a <= 5");
        }
    }
}
