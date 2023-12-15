package com.neweb;

public class MethodDemo {
    public static void main(String[] args) {
        MethodDemo methodDemo = new MethodDemo();

        System.out.println(methodDemo.sayHello("Kevin"));
    }

    public String sayHello(String name) {
        return "Hello " + name;
    }
}
