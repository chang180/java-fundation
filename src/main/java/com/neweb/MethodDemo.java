package com.neweb;

// Overloading
public class MethodDemo {
    public static void main(String[] args) {
        MethodDemo methodDemo = new MethodDemo();

        System.out.println(methodDemo.sayHello("Kevin"));
        System.out.println(methodDemo.sayHello("Kevin", "Good morning"));
        sayHello();
    }

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public String sayHello(String name, String greeting) {
        return "Hello " + name + " , " + greeting;
    }

    public static void sayHello() {
        System.out.println("Hello");
    }
}
