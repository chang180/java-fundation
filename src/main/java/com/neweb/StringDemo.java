package com.neweb;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
//        demo5();
        demo6();
    }

    private static void demo6() {
        // string compare
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.compareTo(s3)); // 0
        System.out.println(s1.compareTo("abd")); // -1
        System.out.println(s1.compareTo("abb")); // 1
        System.out.println(s1.compareToIgnoreCase("ABC")); // 0
        System.out.println(s1.equalsIgnoreCase("ABC")); // true
        System.out.println(s1.equalsIgnoreCase("abc")); // true
        System.out.println(s1.compareToIgnoreCase("ABD")); // -1
    }

    private static void demo5() {
        // startWith and endWith demo
        String s = "123456789";
        System.out.println(s.startsWith("123"));
        System.out.println(s.endsWith("789"));
        System.out.println(s.startsWith("23", 1));
    }

    private static void demo4() {
        // replace demo
        String s = "123456789111";
        System.out.println(s.replace("1", "a"));

        // replaceAll regular expression demo
        String s1 = "123456789111";
        System.out.println(s1.replaceAll("[135]", "a"));
        System.out.println(s1.replaceAll("\\d", "a"));
    }

    private static void demo3() {
        // indexOf demo
        String s = "123456789";
        System.out.println(s.indexOf("5"));
        System.out.println(s.indexOf("0")); // -1, not found

        String s1 = "aabbccdd";
        System.out.println(s1.indexOf("b")); // 2, first index of "b"
        System.out.println(s1.lastIndexOf("b")); // 3, last index of "b"
        // contains
        System.out.println(s1.contains("bb")); // true
    }

    private static void demo2() {
        String s = "1,2,3,4, 5";
        String[] sArr = s.split(",");
        Arrays.stream(sArr).map(String::trim).forEach(System.out::println);

        // subString demo
        String s1 = "123456789";
        System.out.println(s1.substring(0, 3));
        // get the last 5 letters
        System.out.println(s1.substring(s1.length() - 5));
    }

    private static void demo1() {
        char[] c = {'a', 'b', 'c'};
        String s = new String(c);
        System.out.println(s);

        String s1 = "abc";
        System.out.println(s1.charAt(2));
    }
}
