package seleniumexamples;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class WriteDataToExcel {
  
    public void writeToExcel(String filePath,String fileName,String sheetName,String[] dataToWrite) throws IOException{
 
    //Create a object of File class to open xlsx file
 
    File file = new File("C:\\TestData.xlsx");
 
    //Create an object of FileInputStream class to read excel file
 
    FileInputStream inputStream = new FileInputStream(file);
 
    Workbook workbook = null;
 
    //Find the file extension by spliting file name in substring and getting only extension name
 
    String fileExtensionName = fileName.substring(fileName.indexOf("."));
 
    //Check condition if the file is xlsx file
 
    if(fileExtensionName.equals(".xlsx")){
 
    //If it is xlsx file then create object of XSSFWorkbook class
 
    workbook = new XSSFWorkbook(inputStream);
 
    }
 
    //Check condition if the file is xls file
 
    else if(fileExtensionName.equals(".xls")){
 
        //If it is xls file then create object of XSSFWorkbook class
 
        workbook = new HSSFWorkbook(inputStream);
 
    }
 
    //Read sheet inside the workbook by its name
 
    Sheet sheet = workbook.getSheet(sheetName);
 
    //Find number of rows in excel file
 
    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
    
     //Create a loop over all the rows of excel file to read it
 
     Row row = sheet.getRow(0);
    Row newRow = sheet.createRow(rowCount+1);
    //Create a loop to print cell values in a row
    for(int j = 0; j < row.getLastCellNum(); j++){
    	 
        //Fill data in row
 
        Cell cell = newRow.createCell(j);
 
        cell.setCellValue(dataToWrite[j]);
 
    }
    inputStream.close();
    
    //Create an object of FileOutputStream class to create write data in excel file
 
    FileOutputStream outputStream = new FileOutputStream(file);
 
    //write data in the excel file
    workbook.write(outputStream);
    outputStream.close();
}
 
    //Main function is calling readExcel function to read data from excel file
 
    public static void main(String args[]) throws IOException{
    	 
    	String[] valueToWrite = {"Newlyadded100","JustNow100"};
 
       WriteDataToExcel objExcelFile = new WriteDataToExcel();
 
    //Prepare the path of excel file
 
    //String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";
 
     objExcelFile.writeToExcel("C:\\,","TestData.xlsx","Sheet1",valueToWrite);
 
    }
 
}
