package com.cogni;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("E:\\Trainings\\Live\\Java\\Selenium\\CoreJavaPractice\\src\\main\\resources\\excels\\Social_demography.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
//		String cellvalue1 = sheet.getRow(0).getCell(0).getStringCellValue();
//		String cellvalue2 = sheet.getRow(0).getCell(1).getStringCellValue();
//		String cellvalue3 = sheet.getRow(1).getCell(0).getStringCellValue();
//		String cellvalue4 = sheet.getRow(1).getCell(1).getStringCellValue();
	
		int rowCount = sheet.getLastRowNum();
		for( int i=0 ; i < rowCount; i ++)
		{
			XSSFRow row = sheet.getRow(i);
			int cellCount = row.getPhysicalNumberOfCells();
			for (int j = 0 ; j<cellCount ; j++)
			{
				XSSFCell cell = row.getCell(j);
				System.out.print(getCellValue(cell) +":");
			}
			System.out.println();
		}
		workbook.close();
		fis.close();
	}

	public static String getCellValue(XSSFCell cell)
	{
		switch (cell.getCellType())
		{
			case NUMERIC:
				return String.valueOf(cell.getNumericCellValue());
			case BOOLEAN:
				return String.valueOf(cell.getBooleanCellValue());
			case STRING:
				return String.valueOf(cell.getStringCellValue());
			default:
				return String.valueOf(cell.getStringCellValue());
		}
		
	}
	
}
