package com.naruto;

public class Asura {
    private String name = "Asura";
    Hagoromo father = new Hagoromo();

    protected String skill_1 = father.skill_1;

    String getMyName() {
        return name;
    }

}
