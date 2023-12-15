package com.onePiece;

import com.naruto.Naruto;

public class Usopp extends Naruto {
    private String name = "Usopp";
    public Naruto teacher = new Naruto();
    public String skill_ex1 = skill_3; // Same package, so we can access protected variable
}
