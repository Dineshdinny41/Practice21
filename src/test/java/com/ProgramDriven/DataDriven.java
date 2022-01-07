package com.ProgramDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
public static void ParticularData() throws IOException{
	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\AutomationPractice\\DataDriven.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetat = wb.getSheetAt(0);
	Row row=sheetat.getRow(2);
	Cell cell = row.getCell(3);
	
	CellType celltype = cell.getCellType();
	if(celltype.equals(celltype.STRING)) {
		String Stringcelltype = cell.getStringCellValue();
	}
	else if(celltype.equals(celltype.NUMERIC)) {
		double numericcelltype=cell.getNumericCellValue();
		int i=(int)numericcelltype;
		System.out.println(i);
	}
}
public static void allData() throws IOException {
	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\AutomationPractice\\DataDriven.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetat=wb.getSheetAt(0);
	int rowsize=sheetat.getPhysicalNumberOfRows();
	for (int i = 0; i < rowsize; i++) {
		Row row=sheetat.getRow(i);
		int cellsize = row.getPhysicalNumberOfCells();
		for (int j = 0; j < rowsize; j++) {
		Cell cell=	row.getCell(j);
		CellType celltype=cell.getCellType();
		if(celltype.equals(celltype.STRING)) {
			String stringcellvalue = cell.getStringCellValue();
			System.out.println(stringcellvalue);
		}
		else if(celltype.equals(celltype.NUMERIC)) {
			double numericvalue=cell.getNumericCellValue();
			int value=(int)numericvalue;
			System.out.println(value);
			
		}
		
	
			
		}
		
	}
	
}


public static void main(String[] args) throws IOException {
	ParticularData();
	allData();
}

}
