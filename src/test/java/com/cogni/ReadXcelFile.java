package com.cogni;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DateUtil;


public class ReadXcelFile {
	
	public String path;
	public FileInputStream fis = null;
	public FileOutputStream fos = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;
	
	public ReadXcelFile(String path)
	{
		this.path=path;
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			row = sheet.getRow(0);
			fis.close();
					
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	// returns the row count in a sheet

	public int getRowCount(String sheetName){
		int index = workbook.getSheetIndex(sheetName);
		if(index==-1)
			return 0;
		else{
		sheet = workbook.getSheetAt(index);
		int number=sheet.getLastRowNum()+1;
		return number;
		}
		
	}
	
		// returns the row count in a sheet
		
		// returns number of columns in a sheet	
		public int getColumnCount(String sheetName){
			// check if sheet exists
			if(!isSheetExist(sheetName))
			 return -1;
			
			sheet = workbook.getSheet(sheetName);
			row = sheet.getRow(0);
			
			if(row==null)
				return -1;
			
			return row.getLastCellNum();
		}
		
		
	// Return the data present in a cell of an excel sheet
		
		public String getDataCell(String sheetName,String colName , int rowNum)
		{
			try
			{
			if(rowNum <=0)
				return "";
			int index = workbook.getSheetIndex(sheetName);
			int col_Num = -1;
			if(index == -1)
				return "";
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(0);
			for(int i = 0 ; i<row.getLastCellNum();i++)
			{
				if( row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
					col_Num=i;
			}
			if(col_Num ==-1)
				return "";
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(rowNum-1);
			if (row == null)
				return "";
			cell = row.getCell(col_Num);
			if(cell == null)
				return "";
			if(cell.getCellType() == CellType.STRING)
				return cell.getStringCellValue();
			else if (cell.getCellType()== CellType.NUMERIC ||cell.getCellType()==CellType.FORMULA )
			{
				String cellText = String.valueOf(cell.getNumericCellValue());
				if (DateUtil.isCellDateFormatted(cell))
				{
					double dt = cell.getNumericCellValue();
					Calendar cal = Calendar.getInstance();
					cal.setTime(DateUtil.getJavaDate(dt));
					cellText = (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
					cellText = cal.get(Calendar.DAY_OF_MONTH)+"/"+cal.get(Calendar.MONTH) +1+ "/" +cellText;
					
				}
				return cellText;
			}
			else if (cell.getCellType()==CellType.BLANK)
				return "";
			else
				return String.valueOf(cell.getBooleanCellValue());
		
			
			}catch(Exception e)
				{
					e.printStackTrace();
					return "row "+rowNum+" or column "+colName +" does not exist in xls";
				}
		}
		
		
		
		// returns the data from a cell
		public String getCellData(String sheetName,int colNum,int rowNum){
			try{
				if(rowNum <=0)
					return "";
			
			int index = workbook.getSheetIndex(sheetName);

			if(index==-1)
				return "";
			
		
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(rowNum-1);
			if(row==null)
				return "";
			cell = row.getCell(colNum);
			if(cell==null)
				return "";
			
		  if(cell.getCellType()==CellType.STRING)
			  return cell.getStringCellValue();
		  else if(cell.getCellType()==CellType.NUMERIC || cell.getCellType()==CellType.FORMULA ){
			  
			  String cellText  = String.valueOf(cell.getNumericCellValue());
			  if (DateUtil.isCellDateFormatted(cell)) {
		           // format in form of M/D/YY
				  double d = cell.getNumericCellValue();

				  Calendar cal =Calendar.getInstance();
				  cal.setTime(DateUtil.getJavaDate(d));
		            cellText =
		             (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
		           cellText = cal.get(Calendar.MONTH)+1 + "/" +
		                      cal.get(Calendar.DAY_OF_MONTH) + "/" +
		                      cellText;
		           
		         

		         }

			  
			  
			  return cellText;
		  }else if(cell.getCellType()==CellType.BLANK)
		      return "";
		  else 
			  return String.valueOf(cell.getBooleanCellValue());
			}
			catch(Exception e){
				
				e.printStackTrace();
				return "row "+rowNum+" or column "+colNum +" does not exist  in xls";
			}
		}

	//set cellData successfully
	public boolean setCellData(String sheetName,String colName,int rowNum,String data)
	{
		try
		{
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			if (rowNum <=0)
			{
				return false;
			}
			int index = workbook.getSheetIndex(sheetName);
			int colNum = -1;
			if(index ==-1)
				return false;
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++)
			{
				System.out.println(row.getCell(i).getStringCellValue().trim());
				if(row.getCell(i).getStringCellValue().trim().equals(colName))
					colNum=i;
				
			}
			
			if(colNum ==-1)
				return false;
			sheet.autoSizeColumn(colNum);
			row = sheet.getRow(rowNum-1);
			if (row ==null)
				row = sheet.createRow(rowNum-1);
			cell = row.getCell(colNum);
			if(cell == null)
				cell = row.createCell(colNum);
			cell.setCellValue(data);
			fos = new FileOutputStream(path);
			workbook.write(fos);
			fos.close();
				
			}catch(Exception e){
				e.getStackTrace();
				return false;
			}
		return true;
		
	}
	
	// returns true if sheet is created successfully else false
		public boolean addSheet(String sheetname) {

			FileOutputStream fileOut;
			try {
				workbook.createSheet(sheetname);
				fileOut = new FileOutputStream(path);
				workbook.write(fileOut);
				fileOut.close();
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}
		
		// returns true if sheet is removed successfully else false if sheet does
		// not exist
		public boolean removeSheet(String sheetName) {
			int index = workbook.getSheetIndex(sheetName);
			if (index == -1)
				return false;

			FileOutputStream fileOut;
			try {
				workbook.removeSheetAt(index);
				fileOut = new FileOutputStream(path);
				workbook.write(fileOut);
				fileOut.close();
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}	
	
		// returns true if column is created successfully
		public boolean addColumn(String sheetName, String colName) {
			// System.out.println("**************addColumn*********************");
			FileOutputStream fileOut;
			try {
				fis = new FileInputStream(path);
				workbook = new XSSFWorkbook(fis);
				int index = workbook.getSheetIndex(sheetName);
				if (index == -1)
					return false;

				XSSFCellStyle style = workbook.createCellStyle();
				// style.setFillForegroundColor(HSSFColor.GREY_40_PERCENT.index);
				// style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

				sheet = workbook.getSheetAt(index);

				row = sheet.getRow(0);
				if (row == null)
					row = sheet.createRow(0);

				// cell = row.getCell();
				// if (cell == null)
				// System.out.println(row.getLastCellNum());
				if (row.getLastCellNum() == -1)
					cell = row.createCell(0);
				else
					cell = row.createCell(row.getLastCellNum());

				cell.setCellValue(colName);
				cell.setCellStyle(style);

				fileOut = new FileOutputStream(path);
				workbook.write(fileOut);
				fileOut.close();

			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}

			return true;

		}
		// find whether sheets exists
		public boolean isSheetExist(String sheetName) {
			int index = workbook.getSheetIndex(sheetName);
			if (index == -1) {
				index = workbook.getSheetIndex(sheetName.toUpperCase());
				if (index == -1)
					return false;
				else
					return true;
			} else
				return true;
		}
		// removes a column and all the contents
		public boolean removeColumn(String sheetName, int colNum) {
			FileOutputStream fileOut;
			try {
				if (!isSheetExist(sheetName))
					return false;
				fis = new FileInputStream(path);
				workbook = new XSSFWorkbook(fis);
				sheet = workbook.getSheet(sheetName);
				XSSFCellStyle style = workbook.createCellStyle();
				// style.setFillForegroundColor(HSSFColor.GREY_40_PERCENT.index);
				XSSFCreationHelper createHelper = workbook.getCreationHelper();
				// style.setFillPattern(XSSFCellStyle.NO_FILL);
				for (int i = 0; i < getRowCount(sheetName); i++) {
					row = sheet.getRow(i);
					if (row != null) {
						cell = row.getCell(colNum);
						if (cell != null) {
							cell.setCellStyle(style);
							row.removeCell(cell);
						}
					}
				}
				fileOut = new FileOutputStream(path);
				workbook.write(fileOut);
				fileOut.close();
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;

		}
		
	public static void main(String args[])
	{
		ReadXcelFile xlfile = new ReadXcelFile("E:\\Trainings\\Live\\Java\\Selenium\\CoreJavaPractice\\src\\main\\resources\\excels\\Social_demography.xlsx");
		XSSFSheet sheet = xlfile.workbook.getSheetAt(0);
		String sheetname = sheet.getSheetName();
	
		int rowCount = xlfile.getRowCount(sheetname);
		int colCount = xlfile.getColumnCount(sheetname);
	
		Object[][] data = new Object[rowCount+1][colCount];
		for(int i=2; i<=rowCount ; i++)
		{
			
			for (int j = 0 ; j<colCount ; j++)
			{
			
				data[i][j] = xlfile.getCellData(sheetname,j,i);
				System.out.print("||"+data[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(xlfile.getColumnCount(sheetname));
		System.out.println(xlfile.getRowCount(sheetname));
		//System.out.println(xlfile.getDataCell(sheetname, "Head of the family", 5));
		// System.out.println(xlfile.setCellData(sheetname, "Head of the family", 42, "Hello World"));
		//System.out.println(xlfile.addSheet("Status"));
		//System.out.println(xlfile.removeSheet("Status"));
		//System.out.println(xlfile.addColumn(sheetname,"Status"));
		//System.out.println(xlfile.removeColumn(sheetname,6));
	}	
}

