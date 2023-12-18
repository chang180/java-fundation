package com.neweb.chapter8.unit47;

import java.util.Calendar;

public class TestDemo {
    public static void main(String[] args) {
        Product product = Factory.getProduct();
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(1));
    }
}
