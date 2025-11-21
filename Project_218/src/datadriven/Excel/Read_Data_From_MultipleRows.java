package datadriven.Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_MultipleRows {

	public static void main(String[] args) throws IOException {
		
		
		//Target Excel input file
		String path="TestData\\Data.xlsx";
		
		//GetWorkbook access using filepath
		XSSFWorkbook book=new XSSFWorkbook(path);
		
		//Target Sheet using book reference
		XSSFSheet sht=book.getSheetAt(2);
		
		int Frow=sht.getFirstRowNum();
		int Lrow=sht.getLastRowNum();
		
		for (int i = Frow+1; i <= Lrow; i++) 
		{
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			System.out.println(UID+"  "+PWD);
		}
		
		

	}

}
