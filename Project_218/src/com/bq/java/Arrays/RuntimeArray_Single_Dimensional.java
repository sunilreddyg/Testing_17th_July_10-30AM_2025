package com.bq.java.Arrays;

public class RuntimeArray_Single_Dimensional {

	public static void main(String[] args) {
		
		
		
		//Storing group o strnigs
		String browsers[]= {"chrome","firefox","edge","ie"};
		String edge=browsers[2];
		System.out.println(edge);
		System.out.println("String array length is --> "+browsers.length);
		
		//Stroing group on integer values
		Integer num[]= {100,200,300,400,500};
		System.out.println(num[3]);
		System.out.println("Integer array length is--> "+num.length);
		
		
		//Different datatypes to store
		Object obj[]= {"ipone",5,true,65000.00};
		//Casting value
		String phone=(String)obj[0];
		System.out.println(phone);
	}

}
