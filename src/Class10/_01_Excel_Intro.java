package Class10;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _01_Excel_Intro {
    public static void main(String[] args) throws IOException {
        String filePath = "D:/MEGA/IT/Selenium_Working_Excel/TestFile.xlsx";
        FileInputStream fis = new FileInputStream(filePath);

        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheet("Sheet1");
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println(cell);

        // Task1: Get Los Angeles
        Row row1 = sheet.getRow(1);
        Cell r1c2 = row1.getCell(2);
        System.out.println(r1c2);

        // Task2: Access AZ
        Row row2 = sheet.getRow(2);
        Cell r2c3 = row2.getCell(3);
        System.out.println(r2c3);

        // Task3: Get Phoenix
        Cell r2c2 = sheet.getRow(2).getCell(2);
        System.out.println(r2c2);

        //2nd Way : Identifying cell data types using the .getCellType() method.
        CellType r0c2DataType = sheet.getRow(0).getCell(2).getCellType();
        System.out.println(r0c2DataType);

        String stringCellValue = sheet.getRow(0).getCell(2).getStringCellValue();
        System.out.println(stringCellValue);

        // Task4: Get CA ZipCode Data Type
        CellType r1c4DataType = sheet.getRow(1).getCell(4).getCellType();
        System.out.println(r1c4DataType);

        //How to find total number of the rows?
        int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
        System.out.println(physicalNumberOfRows);

        //How to find total number of the columns?
        short lastCellNum = sheet.getRow(0).getLastCellNum();
        System.out.println(lastCellNum);
    }
}
