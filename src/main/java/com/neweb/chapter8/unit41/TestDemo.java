package com.neweb.chapter8.unit41;

public class TestDemo {
    public static void main(String[] args) {
//        demo1();
//        demo2();

    }

    public void process(Multimedia media) {
        System.out.print("Do something start");
        media.play();
        System.out.print("Do something end");
    }

    private static void demo2() {
        // 向下轉型
        Multimedia media = new Video();
        Video video = (Video) media;
        video.play();
    }

    private static void demo1() {
        // 向上轉型
        Multimedia media = new Video();
        Multimedia media2 = media;
        media.play();
        media2.play();
    }
}
