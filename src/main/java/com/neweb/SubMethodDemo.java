package com.neweb;

public class SubMethodDemo extends MethodDemo{
    public static void main(String[] args) {
        MethodDemo methodDemo = new MethodDemo();
        System.out.println(methodDemo.sayHello("Kevin"));

        SubMethodDemo subMethodDemo = new SubMethodDemo();
        System.out.println(subMethodDemo.sayHello("Kevin"));
    }

    public String sayHello(String name) {
        return "Good day, " + name;
    }
}
