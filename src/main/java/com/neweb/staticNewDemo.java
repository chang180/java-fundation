package com.neweb;

public class staticNewDemo {
    public static void main(String[] args) {
        System.out.println(staticDemo.i); // i is a static variable
//        System.out.println(staticDemo.Str); // Str is not a static variable
//        staticDemo.function1(); // function1 is not a static method

        // must create an instance of staticDemo to access non-static members
        staticDemo sd = new staticDemo();
        System.out.println(sd.str);
        sd.function1();
    }
}
