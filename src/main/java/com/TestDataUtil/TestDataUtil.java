package com.TestDataUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class TestDataUtil {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static String First_Name;
	static String Last_Name;
	static String Business_Name;
	static String E_Mail;
	int row_count;
	static ArrayList<Object[]> myData = new ArrayList<Object[]>();
	
	public static ArrayList getDataFromExcel() {
	
	
		
		try
		{			
			workbook = new XSSFWorkbook("src/main/java/com/TestData/TestData.xlsx");
			sheet = workbook.getSheet("Testdata");
			Object[] cust_details = null;
			int row_count = sheet.getLastRowNum();
			System.out.println("row count - "+row_count);
			int cust_row_count = 0;
			for(int r = 1; r<=row_count; r++) {
				
				
				
				XSSFRow row = sheet.getRow(r);
				
				int col_count = row.getLastCellNum();
				
				int cust_count = 0;
				
				
				
				for(int c = 0; c<=col_count; c++) {
					
					XSSFCell cell = row.getCell(c);
					cust_count = cust_count+1;
					
					if(cust_count == 1) {
						First_Name = cell.toString();
						System.out.println(First_Name);
					}
					else if (cust_count == 2) {
						Last_Name = cell.toString();
						System.out.println(Last_Name);
					}
					else if (cust_count == 3) {
						Business_Name = cell.toString();
						System.out.println(Business_Name);
					}
					else if (cust_count == 4) {
						E_Mail = cell.toString();
						System.out.println(E_Mail);
						
					}
					
//					System.out.println(cust_details);
//					
					
				}

				cust_details = new Object[]{First_Name,Last_Name,Business_Name,E_Mail};
				//System.out.println("cust_details - "+cust_details.toString());
				
			}
			
			myData.add(cust_row_count, cust_details);
			cust_row_count = cust_row_count+1;
			
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		
		
		
		
		System.out.println(myData);
		return myData;
	}
	


}
		
	
	
	
	



	

	

