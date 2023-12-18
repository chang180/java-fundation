package com.neweb.chapter8.unit45;

import java.util.List;

public class Foo<T extends List> {
    private T foo;

    public T getFoo() {
        return foo;
    }

    public void setFoo(T foo) {
        this.foo = foo;
    }
}
