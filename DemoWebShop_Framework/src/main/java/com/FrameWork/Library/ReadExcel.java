package com.FrameWork.Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements FrameWorkConstants{
	public static File file=new File(excelPath);;
    public static FileInputStream fis;
    public static Workbook wk;
    public static Sheet sheet;
    
    public static Sheet prepareTheFile(String Sheet) {
    	try {
    		fis = new FileInputStream(file);
    	} catch (FileNotFoundException e1) {
    		e1.printStackTrace();
    	}
    	try {
    	  wk = WorkbookFactory.create(fis);
    	} catch (EncryptedDocumentException e) {
    		e.printStackTrace();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	 sheet = wk.getSheet(Sheet);
    	 return sheet;
    	
    }
    
    public static String getStringData(String Sheet,int r,int c) {
		return prepareTheFile(Sheet).getRow(r).getCell(c).getStringCellValue();
    }
    public static java.util.Date getDate(String Sheet,int r,int c){
    	return prepareTheFile(Sheet).getRow(r).getCell(c).getDateCellValue();
    }
    public static double getNumData(String Sheet,int r,int c) {
    	return prepareTheFile(Sheet).getRow(r).getCell(c).getNumericCellValue();
    }
    public static boolean getBooleanData(String Sheet,int r,int c) {
    	return prepareTheFile(Sheet).getRow(r).getCell(c).getBooleanCellValue();
    }
    
    public static Object[][] testData(String Sheet) {
		sheet=prepareTheFile(Sheet);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object [][] data = new Object[rowCount-1][colCount];
		  
		  for (int i =1; i < rowCount;i++) {
			  for (int j = 0; j < colCount; j++) {
				  data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			  }
		  }
		  return data;
		  
	}
}
