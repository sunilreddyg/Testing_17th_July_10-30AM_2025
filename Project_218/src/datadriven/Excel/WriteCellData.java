package datadriven.Excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteCellData 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Target Excel input file
		String path="TestData\\Data.xlsx";
		
		//GetWorkbook access using filepath
		XSSFWorkbook book=new XSSFWorkbook(path);
		
		//Target Sheet using book reference
		XSSFSheet sht=book.getSheetAt(4);
		
		//Writing Data into Existing row and Existing Cell
		sht.getRow(1).getCell(1).setCellValue("Crt@123");
		
		//Writing Data into Existing row and New Cell
		sht.getRow(0).createCell(3).setCellValue("STATUS");
		
		//Writing data into new row and new cell
		sht.createRow(14).createCell(0).setCellValue("Darshan13");
		
		//Create output file
		FileOutputStream fo=new FileOutputStream("TestData\\Op.xlsx");
		//Write Exising Excel data into New File
		book.write(fo);
		book.close();
	}

}
