 package my001.datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;

public class tset {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("E:\\Java\\datadriven\\data\\datad.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int totalrows = sheet.getLastRowNum();
        int totalcols = sheet.getRow(0).getLastCellNum();

        System.out.println("Rows: " + (totalrows + 1));
        System.out.println("Cols: " + totalcols);

        for (int i = 0; i <= totalrows; i++) {  // FIXED
            XSSFRow row = sheet.getRow(i);

            for (int j = 0; j < totalcols; j++) {
                XSSFCell cell = row.getCell(j);

                System.out.print(cell.toString() + "    ");
            }
            System.out.println();
        }

        workbook.close();
        file.close();
    }
}
