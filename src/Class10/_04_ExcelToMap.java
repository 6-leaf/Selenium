package Class10;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class _04_ExcelToMap {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/testData/EmployeeList.xlsx";
        FileInputStream fis = new FileInputStream(filePath);
        Workbook wb = new XSSFWorkbook(fis);

        Sheet sheet1 = wb.getSheet("Sheet1");
        int totalRows = sheet1.getPhysicalNumberOfRows();
        short totalColumns = sheet1.getRow(0).getLastCellNum();


        Map<String, String> map = new LinkedHashMap<>();
        for (int i = 1; i < totalRows; i++) {
            for (int j = 0; j < totalColumns; j++) {
                String key = sheet1.getRow(0).getCell(j).toString();
                String value =sheet1.getRow(i).getCell(j).toString();
                map.put(key, value);
            }
            System.out.println(map);
        }
    }
}
