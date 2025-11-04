package com.bq.findElements.Webtable;

public class DynamicXpath_Adding_numbers {

	public static void main(String[] args) {
		
		// Define the dynamic XPath template using %d placeholders for integers
		String xpathTemplate = "//table[@id='marketDepthTable']/tbody/tr[%d]/td[%d]";

		// Define your dynamic numerical indices (1-based for XPath)
		int rowIndex = 5;  // For the 5th row
		int cellIndex = 3; // For the 3rd cell

		// Use String.format to inject the values into the template
		String dynamicXPath = String.format(xpathTemplate, rowIndex, cellIndex);

		// Output the result
		System.out.println("Dynamic XPath: " + dynamicXPath);
		// Output: Dynamic XPath: //table[@id='marketDepthTable']/tbody/tr[5]/td[3]

	}

}
