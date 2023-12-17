package com.neweb.chapter8.unit39;

public class SuperClass {
    public String name;

    static{
        System.out.println("SuperClass static block");
    }
    public SuperClass() {
        name = "super";
        System.out.println("SuperClass constructor");
    }

    public SuperClass(String str) {
        name = str;
    }

}
