package com.neweb;

import java.util.stream.IntStream;

public class ForDemo {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();

    }

    private static void demo3() {
        // foreach loop demo
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println("i = " + i);
        }
        IntStream.of(arr).forEach(System.out::println);
    }

    private static void demo2() {
        // 99乘法表
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9 ; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }

    private static void demo1() {
        // for loop demo
        int j = 0;
        for (int i = 0; i <= 10; i++) {
            j += i;
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }
    }
}
