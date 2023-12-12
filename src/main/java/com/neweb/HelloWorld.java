package com.neweb;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Pi(萊布尼茲級數) = " + calcPi(100000000));
        System.out.println("Pi(蒙地卡羅演算法) = " + calcPiMonteCarlo(100000000));
    }

    // 計算圓周率(萊布尼茲級數)
    public static double calcPi(int n) {
        double pi = 0;
        for (int i = 0; i < n; i++) {
            pi += Math.pow(-1, i) / (2 * i + 1);
        }
        return pi * 4;
    }

    // 使用蒙地卡羅法計算圓周率
    public static double calcPiMonteCarlo(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            if (x * x + y * y <= 1) {
                count++;
            }
        }
        return (double) count / n * 4;
    }
}
