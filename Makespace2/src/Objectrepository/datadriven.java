package Objectrepository;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class datadriven {
    public static void main(String args[]) throws IOException {

        FileInputStream fis = new FileInputStream("/Users/ramsubramaniansenthilnathan/Desktop/Testdata2.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        int sheets= workbook.getNumberOfSheets();
        for (int i=0;i<sheets; i++){
            XSSFSheet sheet =  workbook.getSheetAt(i);

            Iterator<Row> rows = sheet.iterator();
            Row firsteow =  rows.next();
            Iterator<Cell> ce = firsteow.cellIterator();
            int k=0;
            int column = 0;

            while(ce.hasNext()){
                Cell value = ce.next();
                if (value.getStringCellValue().equalsIgnoreCase("TestCases")){
                    column = k;
                }
                k++;

            }
            System.out.println(column);

            while(rows.hasNext()){
                Row r = rows.next();
                if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase")){
                    Iterator<Cell> cv = r.cellIterator();
                    while (cv.hasNext()){
                        System.out.println(cv.next().getStringCellValue());
                    }

                }
            }


        }






    }
}
