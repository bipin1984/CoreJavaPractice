package com.cogni.utils;

import java.util.Hashtable;

import com.cogni.utils.ExcelReader;

public class ReadingExcel {

	public static void main(String[] args) {
		
		ExcelReader excel = new ExcelReader(
				System.getProperty("user.dir") + "\\src\\test\\resources\\data.xlsx");
		String sheetName = "AddCustomerTest";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		//Object[][] data = new Object[rows - 1][1];
		for (int rowNum = 1; rowNum <= rows; rowNum++) { // 2
			for (int colNum = 0; colNum < cols; colNum++) {
				System.out.println(excel.getCellData(sheetName, colNum, rowNum));
			
			}

		}
		
		
	
				
				
				
				
	}

}
