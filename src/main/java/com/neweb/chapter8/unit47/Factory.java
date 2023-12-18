package com.neweb.chapter8.unit47;

public class Factory {
    public static Product getProduct(){
        System.out.println("Product on going...");
        return new Product();
    }
}
