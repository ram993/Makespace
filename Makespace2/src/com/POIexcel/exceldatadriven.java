package com.POIexcel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class exceldatadriven {

    public void readExcel() throws IOException {
        FileInputStream excel = new FileInputStream("/Users/ramsubramaniansenthilnathan/Downloads/Makespace2/JXL_Datadriven.xls");

        Workbook workbook = new XSSFWorkbook(excel);

        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();

        while(rowIterator.hasNext()){
            Row rowvalue = rowIterator.next();
            Iterator<Cell> columniterator =  rowvalue.iterator();

            while (columniterator.hasNext()){
                Cell cellvalue = columniterator.next();
                System.out.println(cellvalue);
            }
        }



    }
    public static void main(String[] args) throws IOException {

        exceldatadriven usingpoi = new exceldatadriven();
        usingpoi.readExcel();


    }
}
