package com.bq.java.Arrays;

public class Static_Array_SingleDimensional {

	public static void main(String[] args) {
		
		
		
		
		//String array
		String arr[]=new String[3];
		arr[0]="apple";
		arr[1]="samsung";
		arr[2]="vivo";
		
		System.out.println(arr[1]);
		System.out.println("array length is--> "+arr.length);
		
		//Integer array
		Integer num[]=new Integer[3];
		num[0]=100;
		num[1]=200;
		num[2]=300;
		
		int val=num[2];  //Array storing into variable
		
		System.out.println(num[1]);
		
		
		//Store group of datatype values
		Object obj[]=new Object[4];
		obj[0]="samsung";
		obj[1]=5;
		obj[2]=true;
		obj[3]=25000.00;
		
		//Print method had default casting option
		System.out.println(obj[0]);
		
		//Add casting to convert object into variable
		double price=(double) obj[3];
		String phone=(String) obj[0];
		boolean status=(boolean)obj[2];
		int fnum=(int)obj[1];
		
		System.out.println(price);
		System.out.println(phone);
		System.out.println(status);
		System.out.println(fnum);
		

	}

}
