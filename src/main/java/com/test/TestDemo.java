package com.test;

import java.util.Calendar;

public class TestDemo {

    public static void main(String[] args) {
        // 問候
        greet();
        // 計算退休年齡
        retireCalc();
        // 計算BMI
        double bmi = calcBMI(Person.height, Person.weight);
         // 判斷BMI，給予健康建議
        judgeBMI(bmi);
    }

    private static void judgeBMI(double bmi) {
        // use switch case
        if (bmi < 18.5) {
            System.out.println("You are underweight. You should see a doctor.");
        } else if (bmi < 24) {
            System.out.println("You are normal. Keep it up!");
        } else if (bmi < 27) {
            System.out.println("You are overweight. You should exercise more.");
        } else if (bmi < 30) {
            System.out.println("You are obese. You should see a doctor.");
        } else {
            System.out.println("You are extremely obese. You should see a doctor.");
        }
    }

    private static double calcBMI(int height, int weight) {
        double bmi =  weight / Math.pow(height / 100.0, 2);
        System.out.println("Your BMI is " + bmi);
        return bmi;
    }

    private static void greet() {
        System.out.println("Hello " + Person.name + ", your age is " + Person.age + ", and your gender is " + Person.gender + "!");
    }

    private static void retireCalc() {
        int age = Person.age;
        int retireAge = 65;
        int yearsLeft = retireAge - age;
        int nowYear = Calendar.getInstance().get(Calendar.YEAR);
        int retireYear = nowYear + yearsLeft;
        System.out.println("Your age is " + age + ". You want to retire at age " + retireAge + ".");
        System.out.println("It's " + nowYear + " now.");
        System.out.println("You have " + yearsLeft + " years left until you can retire. The retirement year is " + retireYear + ".");
    }

    public static class Person {
        public static String name = "Kevin";
        public static int age = 50;
        public static String gender = "male";
        public static int height = 180;
        public static int weight = 100;
    }
}
