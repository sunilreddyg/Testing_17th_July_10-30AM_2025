package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class CommonExcel 
{
	
	
	public static XSSFWorkbook book;
	public static XSSFSheet sht;
	String filepath="TestData\\Data.xlsx";
	
	
	//GetExcel Workbook
	public static void getExcel(String Ifilepath,String sheetname)
	{
		
		try {
			 book=new XSSFWorkbook(Ifilepath);
			 sht=book.getSheet(sheetname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	//Get CellData
	public static String getCellDataInString(int row, int cell)
	{
		CellType celltype=sht.getRow(row).getCell(cell).getCellType();
		XSSFCell CELL=sht.getRow(row).getCell(cell);
		switch (celltype) {
        case STRING:
            return CELL.getStringCellValue();
        case NUMERIC:
            return String.valueOf(CELL.getNumericCellValue());
        case BOOLEAN:
            return String.valueOf(CELL.getBooleanCellValue());
        case FORMULA:
            return CELL.getCellFormula();
        default:
            return "";
    }
	}
	
	
	

}
