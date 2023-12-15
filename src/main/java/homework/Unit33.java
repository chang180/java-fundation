package homework;

public class Unit33 {

    public static void main(String[] args) {
        Unit33 unit33 = new Unit33();
        System.out.println(unit33.homework("Java", "Java is a programming language", "Kevin", "2020/01/01"));
        System.out.println(unit33.homework("Java", "Java is a programming language", "Kevin"));
        System.out.println(unit33.homework("Java", "Java is a programming language"));
    }
    public String homework(String title, String content, String name, String date) {
        return "HomeWork: " + title + "\n" + "Content: " + content + "\n" + "Name: " + name + "\n" + "Date: " + date + "\n";
    }

    // overloading
    public String homework(String title, String content, String name) {
        return "HomeWork: " + title + "\n" + "Content: " + content + "\n" + "Name: " + name + "\n";
    }

    // overloading
    public String homework(String title, String content) {
        return "HomeWork: " + title + "\n" + "Content: " + content + "\n";
    }
}
