package com.neweb.chapter10.unit53;

import java.util.Optional;

public class User {
    private String name;
    private int age;

    // to prevent NullPointerException
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
