package com.neweb.chapter13.unit60;

import java.io.IOException;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
//        readExcelDemo();

        // 寫入 Excel 資料
        String writeFileName = "test/write.xlsx";
        DataHelp dataHelp = new DataHelpImp();
        List<String[]> list = dataHelp.getData();
        try{
            ExcelUtil.writeFile(writeFileName, list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("寫入完成");
    }

    private static void readExcelDemo() {
        // 讀取 Excel 資料
        String readFileName = "test/demo.xlsx";
        try {
            ExcelUtil.readFile(readFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
