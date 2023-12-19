package com.neweb.chapter12.unit58;

import java.io.File;

import static com.neweb.chapter12.IOUtil.copyFile;
import static com.neweb.chapter12.IOUtil.writeTxtFile;

public class TestDemo {
    public static void main(String[] args) {
//        demo1();
        String source = "test\\test.jpg";
        String dest = "test\\dest\\test.jpg";
        copyFile(new File(source), new File(dest));
    }

    private static void demo1() {
        String filename = "test\\write.txt";
        writeTxtFile(filename);
    }
}
