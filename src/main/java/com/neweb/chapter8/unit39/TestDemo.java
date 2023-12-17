package com.neweb.chapter8.unit39;

public class TestDemo {
    public static void main(String[] args) {
//        demo1();
        // static block only runs once demo
        SuperClass super1 = new SuperClass();
        SuperClass super2 = new SuperClass();
        SuperClass super3 = new SuperClass(); // static block only runs once, constructor runs 3 times
    }

    private static void demo1() {
        SuperClass superOne = new SuperClass();
        System.out.println(superOne.name);
        SuperClass superTwo = new SuperClass("superTwo");
        System.out.println(superTwo.name);

        SubClass subOne = new SubClass();
        System.out.println(subOne.nickName);
    }
}
