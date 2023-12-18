package com.neweb.chapter8.unit46;

public class GC {
    private String name;
    public GC(String name) {
        this.name = name;
        System.out.println("GC " + name + " created");
    }

    protected void finalize() {
        System.out.println("GC " + name + " finalized");
    }
}
