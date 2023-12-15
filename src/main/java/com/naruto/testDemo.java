package com.naruto;

import com.onePiece.Usopp;

public class testDemo {
    public static void main(String[] args) {
        Boruto child1 = new Boruto();
        Himawari child2 = new Himawari();
        Usopp student = new Usopp();

        System.out.println("Boruto's father is " + child1.father.getMyName() + " and his skill is " + child1.skill);
        System.out.println("Himawari's mother is " + child2.mother.getMyName() + " and her skill is " + child2.skill_1);
        System.out.println("Usopp's teacher is " + student.teacher.getMyName() + " and his skill is " + student.skill_ex1);
    }
}
