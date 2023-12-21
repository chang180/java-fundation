package com.neweb.chapter16.google_cloud_vision_api;

public class TestDemo {
    public static void main(String[] args) throws Exception{
        String input = "test\\input";
        String output = "test\\output";

        VisionHelp visionHelp = new ExcelHelp();
        visionHelp.analysisPicture(input, output);
        System.out.println("Done!");
    }
}
