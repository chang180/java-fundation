package com.neweb.chapter11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
//        demo1();
        Comparator<Integer> com = Math::subtractExact;
        System.out.println(com.compare(10, 5));
    }

    private static void demo1() {
        Comparator<Integer> com = (o1, o2) -> o1 - o2;
        System.out.println(com.compare(10, 5));

        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
//        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println); // static method reference
    }
}
