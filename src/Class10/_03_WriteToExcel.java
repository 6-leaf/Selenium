package Class10;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _03_WriteToExcel {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/testData/EmployeeList.xlsx";
        FileInputStream fis = new FileInputStream(filePath);
        Workbook wb = new XSSFWorkbook(fis);

        Sheet sheet1 = wb.getSheet("Sheet1");
        sheet1.getRow(0).createCell(6).setCellValue("Seniority Level");
        sheet1.getRow(1).createCell(6).setCellValue("Mid-Level");
        sheet1.getRow(2).createCell(6).setCellValue("Entry-Level");
        sheet1.getRow(3).createCell(6).setCellValue("Senior-Level");

        // Write your own name on the very last row

        sheet1.createRow(4).createCell(0).setCellValue("Ibrahim");
        sheet1.getRow(4).createCell(1).setCellValue("6yaprak");
        sheet1.getRow(4).createCell(4).setCellValue("QA");
        sheet1.getRow(4).createCell(5).setCellValue(99999);

        //Create new sheet
        Sheet sheet2 = wb.createSheet("Sheet2");
        

        FileOutputStream fos = new FileOutputStream(filePath);
        wb.write(fos);
        fos.close();



    }
}
