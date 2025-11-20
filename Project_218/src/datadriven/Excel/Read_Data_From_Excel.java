package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel {

	public static void main(String[] args) throws IOException {
		
		
		
		//Targeting file location
		FileInputStream fi=new FileInputStream("TestData\\Data.xlsx");
		
		//Get Workbook using fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using above workbook
		XSSFSheet sht=book.getSheet("util");
		
		//Target row using sheet
		XSSFRow row=sht.getRow(1);
		
		//Target cell using row
		XSSFCell cell=row.getCell(0);
		
		//Reading String data from cell
		String CellData=cell.getStringCellValue();
		System.out.println(CellData);
		
		//Reading string data from cell
		String URL=row.getCell(1).getStringCellValue();
		String UID=row.getCell(2).getStringCellValue();
		String PWD=row.getCell(3).getStringCellValue();
		
		
		System.out.println(URL+"\n"+UID+"\n"+PWD);
	}

}
