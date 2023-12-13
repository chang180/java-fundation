package com.test;

public class intTest {
    public static void main(String[] args) {
        Double d = new Double(3.14);
        double d2 = d;
        System.out.println("我要印字串：" + d);

        String s = String.valueOf(d);
        System.out.println("我要印另一個字串：" + s);
    }
}
