package com.neweb.chapter8.unit39;

public class SubClass extends SuperClass{
    public String nickName;
    public SubClass() {
        this.nickName = "sub " + super.name;
    }
}
