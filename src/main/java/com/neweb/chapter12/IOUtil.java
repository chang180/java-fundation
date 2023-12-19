package com.neweb.chapter12;

import javax.annotation.processing.Filer;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOUtil {
    public static void createFolder(String filename) {
        File file = new File(filename);
        file.mkdirs();
    }

    public static String[] readFolder(String filename) {
        File file = new File(filename);
        return file.list();
    }

    public static void deleteFolder(String filename) {
        File file = new File(filename);
        file.delete();
    }

    public static void readTxtFile(String filename) {
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        String tmp = null;
        try {
            while ((tmp = br.readLine()) != null) {
                System.out.println(tmp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeTxtFile(String filename) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(File source, File dest) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(source);
            fos = new FileOutputStream(dest);
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
