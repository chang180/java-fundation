package com.neweb.chapter16.google_cloud_vision_api;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.List;

public class ExcelHelp extends VisionHelp{
    @Override
    public void writeData(String outDir, String[] inputFileNames, List<List<String[]>> dataList) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        for (int i = 0; i < inputFileNames.length; i++) {
            XSSFSheet sheet = workbook.createSheet(inputFileNames[i]);
            List<String[]> datas = dataList.get(i);

            for(int j = 0; j < datas.size(); j++){
                XSSFRow row = sheet.createRow(j);
                String[] rowData = datas.get(j);

                XSSFCell desCell = row.createCell(0);
                desCell.setCellValue(rowData[0]);

                XSSFCell scoreCell = row.createCell(1);
                scoreCell.setCellValue(rowData[1]);
            }
        }
        try {
            FileOutputStream fis = new FileOutputStream(outDir + "\\result.xlsx");
            workbook.write(fis);
            fis.flush();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
