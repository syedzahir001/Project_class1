package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Wite_data {
	
	public static void wirte_Data() throws Throwable {
		
		
		File f = new File("C:\\Users\\home\\Desktop\\Write_data.xlsx");
		
		FileInputStream fis =  new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("Data").createRow(0).createCell(0).setCellValue("Username");
		
		wb.getSheet("Data").createRow(0).createCell(1).setCellValue("Password");
		
		wb.getSheet("Data").getRow(1).createCell(1).setCellValue(56);
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		System.out.println("Write");

	}
	
	public static void main(String[] args) throws Throwable {
		
		wirte_Data();
		
		
		
		
		
	}
	

}
