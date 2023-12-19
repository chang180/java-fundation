package com.neweb.chapter12.unit56;

import com.neweb.chapter12.IOUtil;

import java.io.File;

public class TestDemo {
    public static void main(String[] args) {
//      demo1();
//        demo2();
//        demo3();


    }

    private static void demo3() {
        File file = new File("D:\\test\\testFolder");
        file.delete();
    }

    private static void demo2() {
        String[] files = IOUtil.readFolder("D:\\test\\");
        for (String file : files) {
            System.out.println(file);
        }
    }

    private static String demo1() {
        String filename = "D:\\test\\testFolder";
        IOUtil.createFolder(filename);
        System.out.println("end");
        return filename;
    }
}
