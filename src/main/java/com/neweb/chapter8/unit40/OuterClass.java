package com.neweb.chapter8.unit40;

public class OuterClass {
    private static class InnerClass {
        private String name;
        public void SayHello(){
            System.out.println("Hello " + name);
        }
    }

    public void callInnerClass(){
        InnerClass inner = new InnerClass();
        inner.name = "Inner";
        inner.SayHello();
    }
}
