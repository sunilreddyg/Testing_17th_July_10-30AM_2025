package datadriven.Excel;

import java.io.FileInputStream;

public class Read_Excel_File {

	public static void main(String[] args) {
		
		FileInputStream fi;
		try {
			fi=new FileInputStream("TestData\\Data.xlsx");
			System.out.println("file located");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
