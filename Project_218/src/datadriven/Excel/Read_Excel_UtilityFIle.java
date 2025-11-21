package datadriven.Excel;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import utility.ExcelUtility;

public class Read_Excel_UtilityFIle {

	public static void main(String[] args) throws Exception {
		
		
		List<Map<String, String>> data=
				ExcelUtility.readExcel
				("TestData//Data.xlsx", "conditionaldata");
		
		for (Map<String, String> row : data) 
		{
			//System.out.println(row);
			for (String keys : row.keySet()) 
			{
				String val=row.get(keys);
				System.out.println(val);
			}
		}
		
		
		

	}

}
