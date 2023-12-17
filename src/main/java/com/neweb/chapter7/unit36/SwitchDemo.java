package com.neweb.chapter7.unit36;

public class SwitchDemo {
    public static void main(String[] args) {
        // switch demo
        int a = (int) (Math.random() * 10);
        System.out.println("a = " + a);
        switch (a) {
            case 0:
                System.out.println("a = 0");
                break;
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            case 3:
                System.out.println("a = 3");
                break;
            case 4:
                System.out.println("a = 4");
                break;
            case 5:
                System.out.println("a = 5");
                break;
            case 6:
                System.out.println("a = 6");
                break;
            case 7:
                System.out.println("a = 7");
                break;
            case 8:
                System.out.println("a = 8");
                break;
            case 9:
                System.out.println("a = 9");
                break;
            default:
                System.out.println("a = " + a);
                break;
        }
    }
}
