package datadriven.Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Multiple_Cells 
{

	public static void main(String[] args) throws Exception {
		
		
		//Target Excel input file
		String path="TestData\\Data.xlsx";
		
		//GetWorkbook access using filepath
		XSSFWorkbook book=new XSSFWorkbook(path);
		
		//Target Sheet using book reference
		XSSFSheet sht=book.getSheetAt(3);
		
		//Target row using sheet
		XSSFRow row=sht.getRow(0);
		
		//Get first and last cell where data started and ended in excel
		int Fcell=row.getFirstCellNum();
		int Lcell=row.getLastCellNum();
		
		for (int i = Fcell+1; i < Lcell; i++) 
		{
			String EachCell=row.getCell(i).getStringCellValue();
			System.out.println(EachCell);
		}

	}

}
