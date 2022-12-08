package Class10;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class _02_ReadFromExcel {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/testData/EmployeeList.xlsx";
        FileInputStream fis = new FileInputStream(filePath);
        Workbook wb = new XSSFWorkbook(fis);

        Sheet sheet1 = wb.getSheet("Sheet1");
        Cell r0c5 = sheet1.getRow(0).getCell(5);
        System.out.println(r0c5);

        //Task: Locate and print QA
        System.out.println(sheet1.getRow(1).getCell(4));

        System.out.println(" --- iterate all rows & columns --- ");

        //Task: Get all Rows & Columns
        int totalRows = sheet1.getPhysicalNumberOfRows();
        int totalColumns = sheet1.getRow(0).getLastCellNum();

        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalColumns; j++) {
                Cell cellValues = sheet1.getRow(i).getCell(j);
                System.out.print(cellValues + ", ");
            }
            System.out.println();
        }

    }
}
