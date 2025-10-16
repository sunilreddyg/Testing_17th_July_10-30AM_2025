package com.bq.java.String;

public class String_Methods {

	public static void main(String[] args) {
		
		
		/*
		 * String:-->
		 * 			String store group of characters.
		 * 			String To valdate We have set
		 * 			of methods.
		 */
		
		
		 /* Equals:-->
		 * 		Method Verify equal comparision between two strings
		 * 		and return boolean value true/false.
		 * 		Note:--> Comparision is casesensitive.
		 */
		
		String name1="webdriver";
		String name2="WebDriver";
		
		boolean flag=name1.equals(name2);
		System.out.println("Equal Comparision is --> "+flag);
		
		
		/*
		 * EqualIgnorecase:-->
		 * 		Method verify equal comparision between two string
		 * 		by ignoring casesensitive..
		 */
		boolean flag1=name1.equalsIgnoreCase(name2);
		System.out.println("EqualIgnorecase Comaprision is --> "+flag1);
		
		
		/*
		 * contains:-->
		 * 		Method verify sub string characters available at main 
		 * 		string.
		 */
		String Status="Account 100 Created";
		System.out.println(Status.contains("Account"));
		System.out.println(Status.contains("Created"));
		System.out.println(Status.contains("Account Created"));
		
		
		/*
		 * length:-->
		 * 		Method get number of charactes available with
		 * 		in string
		 */
		String Mobile="9030248855";
		int len=Mobile.length();
		
		if (len==10) 
			System.out.println("Valid Mobile number");
		else 
			System.out.println("invalid Mobile Number");
		
		
		/*
		 * SubString:-->
		 * 		Method Get SubString characters from main String
		 */
		String AccountNum="123455889874";
		String LastDigits=AccountNum.substring(8);
		System.out.println("last Digits are --> "+LastDigits);
		
		String MiddleDigts=AccountNum.substring(4, 8);
		System.out.println("Middle Digits are --> "+MiddleDigts);
		
		String ProductPrice="$50000";
		System.out.println(ProductPrice.substring(1));
		
		
		/*
		 * Trim:-->
		 * 	Method trim extra spaces with in String
		 * 		[It only Trims left and right spaces only]
		 */
		String PinCode="    500075    ";
		System.out.println("Before trim ---> "+PinCode.length());
		String NewPincode=PinCode.trim();
		System.out.println("After trim ---> "+NewPincode.length());
		
		
		/*
		 * isEmpty:-->
		 * 		Method verify string empty status and return
		 * 		boolean value true/false
		 */
		String var1="";
		String var2="Hi";
		System.out.println("var1 empty status is ---> "+var1.isEmpty());
		System.out.println("Var2 empty status is ---> "+var2.isEmpty());
		
		
		/*
		 * startswith:-->
		 * 			Method verify given string started with expected characters
		 * 			and return boolean value
		 */
		String AccountNumber="111122227777";
		boolean flag5=AccountNumber.startsWith("1111");
		System.out.println("Starts with Comparision is --> "+flag5);
		
		
		/*
		 * endswith:-->
		 * 			Method verify given string ends with expected characters
		 * 			and return boolean value
		 */
		boolean flag6=AccountNumber.endsWith("7777");
		System.out.println("ends with Comparision is --> "+flag6);
		
		
		
		/*
		 * charsAt:-->
		 * 		Method return single character using index number
		 */
		String browsername="Chrome,Firefox";
		char ch=browsername.charAt(2);
		System.out.println("charcters available at 6th index number ---> "+ch);
		
		/*
		 * ToLowerCase:-->
		 * 		method convert all Uppercase characters
		 * 		into lowercase
		 */
		String toolname="WebDriver";
		System.out.println(toolname.toLowerCase());
		
		/*
		 * toUppercase:-->
		 * 		method convert all lowercase characters 
		 * 		into uppercase
		 */
		System.out.println(toolname.toUpperCase());
		
		
		/*
		 * concat:-->
		 * 			Method club two string 
		 */
		String firstname="SunilReddy";
		String surname="gajjala";
		System.out.println(firstname.concat(surname));  //Using Method
		System.out.println(firstname+surname);  //Using + Operator
		
		
		/*
		 * replace:-->
		 * 		Replace old characters with New characters 
		 */
		String msg="selenium test automated";
		String Rep=msg.replace('t', 'i');
		System.out.println("After replace character is --> "+Rep);
		System.out.println(msg.replaceAll("automated", "delivered"));
		
		
		
		
		
	}

}
