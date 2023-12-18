package com.neweb.chapter9.unit49;

import java.util.*;

public class TestDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Java";
        // List demo
        List<String> list = List.of(s1, s2, s3);
        System.out.println("List: " + list);
        // ArrayList demo
        List<String> listArray = new ArrayList<>();
        listArray.add(s1);
        listArray.add(s2);
        listArray.add(s3);
        System.out.println("ListArray: " + listArray);
        // Map demo
        Map<String, String> map = Map.of("1", "Hello", "2", "World", "3", "Java");
        System.out.println("Map:" + map);
        // HashMap demo
        Map<String, String> mapHash = new HashMap<>();
        mapHash.put("1", "Hello");
        mapHash.put("2", "World");
        mapHash.put("3", "Java");
        System.out.println("MapHash:" + mapHash);
        // Set demo
        Set<String> set = Set.of(s1, s2, s3);
        System.out.println("Set: " + set);
        // HashSet demo
        Set<String> setHash = new HashSet<>(List.of(s1, s2, s3));
        System.out.println("SetHash" + setHash);
        // LinkedHashSet demo
        Set<String> setLinked = new LinkedHashSet<>(List.of(s1, s2, s3));
        System.out.println("LinkedHashSet: " + setLinked);
    }
}
