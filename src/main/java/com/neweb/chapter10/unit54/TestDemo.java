package com.neweb.chapter10.unit54;

public class TestDemo {
    public static void main(String[] args) {
        try {
            throw new MyException("My error message");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
