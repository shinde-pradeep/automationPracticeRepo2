package com.autoPractice.Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

	
	
// method to fetch data from Excel sheet
	
public static String getSheetData (String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {

	String fileLocation=System.getProperty("user.dir")+"\\src\\test\\resources\\DataForSelenium.xlsx";
			
	FileInputStream openConnection= new FileInputStream(fileLocation);//openConnection_selenium & localSystem
	
	String sheetData=WorkbookFactory.create(openConnection).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
	
	return sheetData;
}
	
	
}
