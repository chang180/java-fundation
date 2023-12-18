package com.neweb;

public class SubFinalDemo extends FinalDemo {
    public void testFunction () {
        System.out.println("testFunction in subFinalDemo"); // can't redefine final method
    }
}
