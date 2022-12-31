package org.p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataDrivenReadMultipleValues {
	public static void main(String[] args) throws IOException {
		//1.read the xl file 
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenProject1\\Excel\\Book2.xlsx");
		
		//2.read the file 
		FileInputStream fis = new FileInputStream(f);
		
		//3.read xlsx format 
		Workbook wk = new XSSFWorkbook(fis);
		
		//4.read xl sheet 
		Sheet mySheet = wk.getSheet("Data3");
		
		for (int i = 0; i < mySheet.getPhysicalNumberOfRows(); i++) {
			Row r = mySheet.getRow(i);
			for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				
				//to call cell type method
				int cellType = c.getCellType();
				
				if (cellType == 1) {
					String value1 = c.getStringCellValue();
					System.out.println(value1);
				}
				else if (DateUtil.isCellDateFormatted(c)) {
					Date dd = c.getDateCellValue();
					SimpleDateFormat d = new SimpleDateFormat("dd-mm-yy");
					String value2 = d.format(dd);
					System.out.println(value2);
				}
				//to convert numeric values
				else {
					double db = c.getNumericCellValue();
					//downcasting
					long l = (long)db;
					String value3 = String.valueOf(l);
					System.out.println(value3);
				}
			}
			
		}
		
		
		
		
	}

}
