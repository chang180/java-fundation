package com.neweb.chapter8.unit46;

import static java.lang.Thread.*;

public class TestDemo {
    public static void main(String[] args) {
        GC gc1 = new GC("gc1");
        GC gc2 = new GC("gc2");
        GC gc3 = new GC("gc3");

        gc1 = null;
        gc2 = null;
        gc3 = null;

        System.gc(); // release memory

        try{
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
