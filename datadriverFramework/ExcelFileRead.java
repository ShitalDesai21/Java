package datadriverFramework;

import java.io.File;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExcelFileRead {
  @Test
  public void fileRead() throws IOException 
  
  {
	  File f1=new File("./"+"//TestData\\data.xlsx");
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //Workbook-->sheet-->row-->cell--value
	  
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  XSSFSheet sheet1= wb.getSheetAt(0);
	  XSSFRow row1=sheet1.getRow(1);
	  XSSFCell cell1=row1.getCell(0);
	  String value= cell1.getStringCellValue();
	  
	   System.out.println(value);
	  
	 
  }

	

}
