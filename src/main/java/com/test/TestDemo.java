package com.test;

public class TestDemo {

//    public static String name = "John";
//
//    public static int age2 = 19;
//
//    public static String gender = "male";
    public static void main(String[] args) {
//        Integer age = 18;
        System.out.println("Hello " + Person.name + ", your age is " + Person.age + ", and your gender is " + Person.gender + "!");
    }

    public static class Person {
        public static String name = "John";
        public static int age = 19;
        public static String gender = "male";
    }
}
