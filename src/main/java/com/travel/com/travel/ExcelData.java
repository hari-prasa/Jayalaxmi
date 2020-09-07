package com.travel.com.travel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelData {
	//public static   void  getExcelData(String path,String sheetName,int rowNum , int colNum ) throws FileNotFoundException {

		//FileInputStream fis = new FileInputStream("E:\\Jaya\\Test_Data.xlsx");
		
		public void writeExcel(String filePath,String fileName,String sheetName,String[] dataToWrite) throws IOException{

	        

	        File file =    new File(filePath+"\\"+fileName);

	          FileInputStream inputStream = new FileInputStream(file);

	        Workbook Workbook = null;


	        String fileExtensionName = fileName.substring(fileName.indexOf("."));

	        if(fileExtensionName.equals(".xlsx")){


	     //   Workbook = new Workbook(inputStream);

	        }

	        //Check condition if the file is xls file

	        else if(fileExtensionName.equals(".xls")){

	           
	       Workbook = new HSSFWorkbook(inputStream);

	        }    

	    //Read excel sheet by sheet name    

	    Sheet sheet = Workbook.getSheet(sheetName);

	    //Get the current count of rows in excel file

	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

	    //Get the first row from the sheet

	    Row row = sheet.getRow(0);

	    //Create a new row and append it at last of sheet

	    Row newRow = sheet.createRow(rowCount+1);

	    //Create a loop over the cell of newly created Row

	    for(int j = 0; j < row.getLastCellNum(); j++){

	        //Fill data in row

	        Cell cell = newRow.createCell(j);

	        cell.setCellValue(dataToWrite[j]);

	    }

	    //Close input stream

	    inputStream.close();

	    //Create an object of FileOutputStream class to create write data in excel file

	    FileOutputStream outputStream = new FileOutputStream(file);

	    //write data in the excel file

	    Workbook.write(outputStream);

	    //close output stream

	    outputStream.close();
		
	    }

	    public static void main(String...strings) throws IOException{

	        String[] valueToWrite = {"Mr. E","Noida"};


	       ExcelData objExcelFile = new ExcelData();

	        //Write the file using file name, sheet name and the data to be filled

	       objExcelFile.writeExcel(System.getProperty("user.dir")+"\\src\\excelExportAndFileIO","ExportExcel.xlsx","E:\\Jaya\\Test_Data.xlsx",valueToWrite);

	    }

	}


