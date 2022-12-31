package org.p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Challenge01 {
	public static void main(String[] args) throws IOException {
		// 1.to mention the xl path file
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenDataDriven\\Excel\\datadriven.xlsx");

		// 2.to read the file
		FileInputStream fis = new FileInputStream(f);

		// 3.to read .xlsx format
		Workbook wb = new XSSFWorkbook(fis);

		// 4.get sheets form workbook
		Sheet mySheet = wb.getSheet("Datas");

		// 5.get the row from the sheet
		Row particularRow = mySheet.getRow(1);

		// 6.get the column from the sheet
		Cell Pcell = particularRow.getCell(0);
		System.out.println(Pcell);
	}

}
