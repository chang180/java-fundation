package com.neweb;

public class StaticNewDemo {
    public static void main(String[] args) {
        System.out.println(StaticDemo.i); // i is a static variable
//        System.out.println(staticDemo.Str); // Str is not a static variable
//        staticDemo.function1(); // function1 is not a static method

        // must create an instance of staticDemo to access non-static members
        StaticDemo sd = new StaticDemo();
        System.out.println(sd.str);
        sd.function1();
    }
}
