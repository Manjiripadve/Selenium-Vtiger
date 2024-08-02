package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility1 {

	
	
	
	public String excel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException 
	{
	FileInputStream fls=new FileInputStream("C:\\TestData\\VTiger.xlsx");
	   Workbook wb=WorkbookFactory.create(fls);
	   org.apache.poi.ss.usermodel.Sheet  sheet = wb.getSheet("Sheet1");
	   
	 String s= sheet.getRow(row).getCell(cell).toString();
	 return s;
	
	}
}
