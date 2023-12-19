package com.neweb.chapter13.unit60;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
    public static void readFile(String fileName) throws IOException {
        InputStream is = new FileInputStream(fileName);
        XSSFWorkbook workbook = new XSSFWorkbook(is);
        XSSFSheet Sheet = workbook.getSheetAt(0);
        Iterator itRow = Sheet.rowIterator();

        while(itRow.hasNext()) {
            XSSFRow row = (XSSFRow) itRow.next();
            Iterator itCell = row.cellIterator();

            while(itCell.hasNext()) {
                XSSFCell cell = (XSSFCell) itCell.next();
                System.out.print(cell.toString() + " ");
            }
            System.out.println();
        }
    }

    public static void writeFile(String fileName, List<String[]> dataList) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("sheet1");
        XSSFRow titleRow = sheet.createRow(0);

        XSSFCell cell1 = titleRow.createCell(0);
        cell1.setCellValue("ID");
        XSSFCell cell2 = titleRow.createCell(1);
        cell2.setCellValue("Name");
        XSSFCell cell3 = titleRow.createCell(2);
        cell3.setCellValue("Score");

        for(int i = 0; i < dataList.size(); i++) {
            String[] row = dataList.get(i);
            XSSFRow dataRow = sheet.createRow(i + 1);
            for(int j = 0; j < row.length; j++) {
                XSSFCell dataCell = dataRow.createCell(j);
                dataCell.setCellValue(row[j]);
            }
        }

        FileOutputStream fos = new FileOutputStream(fileName);
        workbook.write(fos);
        fos.flush();
        fos.close();
    }
}
