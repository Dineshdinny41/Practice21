package com.ProgramDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	public static void Data() throws IOException {
	File f = new File("C:\\Users\\Admin\\Documents\\Writedate.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	wb.createSheet("Student details").createRow(0).createCell(0).setCellValue("student");
	wb.getSheet("student details").getRow(0).createCell(1).setCellValue("password");
	wb.getSheet("Student details").createRow(1).createCell(0).setCellValue("dinesh");
	wb.getSheet("Student details").getRow(1).createCell(1).setCellValue("dinesh@123");
	wb.getSheet("Student details").createRow(2).createCell(0).setCellValue("vignesh");
	wb.getSheet("Student details").getRow(2).createCell(1).setCellValue("vignesh@123");
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	wb.close();
	System.out.println("write operation succesfully completed");
	
	}
	public static void main(String[] args) throws IOException {
		Data();
	}
}
