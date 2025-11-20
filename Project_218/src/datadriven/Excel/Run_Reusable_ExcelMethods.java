package datadriven.Excel;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import utility.CommonExcel;
import utility.ExcelUtility;

public class Run_Reusable_ExcelMethods {

	public static void main(String[] args) throws IOException {

		
		  
		  CommonExcel.getExcel("TestData\\Data.xlsx","util"); 
		  String browser=CommonExcel.getCellDataInString(1, 0);
		  System.out.println(browser);
		  
		 

		  CommonExcel.getExcel("TestData\\Data.xlsx","celltypes"); 
		  String val=CommonExcel.getCellDataInString(1, 2); 
		  System.out.println(val);
		 
		  String val1=CommonExcel.getCellDataInString(1, 1); 
		  System.out.println(val1);
		 

	}

}
