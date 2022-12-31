package org.p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadrivenIterationChallenge {
	public static void main(String[] args) throws IOException {
		
		//1.to read the file path
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenProject1\\Excel\\project1.xlsx");
		
		//2.to read the file
		FileInputStream fis = new FileInputStream(f);
		
		//3.to read xlsx format and upcasting
		Workbook wk = new XSSFWorkbook(fis);
		
		//4.to read the excel sheet
		Sheet mySheet = wk.getSheet("Datas");
		
		//iterate the sheet
		for (int i = 0; i < mySheet.getPhysicalNumberOfRows() ; i++) {
			Row iterateRow = mySheet.getRow(1);
			for (int j = 0; j < iterateRow.getPhysicalNumberOfCells() ; j++) {
				Cell iCell = iterateRow.getCell(0);
				
				System.out.println(iCell);
				
			}
			
		}
	}

}
