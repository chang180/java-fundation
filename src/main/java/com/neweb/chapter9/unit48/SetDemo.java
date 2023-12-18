package com.neweb.chapter9.unit48;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        // Set demo
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("Java");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }

    }
}
