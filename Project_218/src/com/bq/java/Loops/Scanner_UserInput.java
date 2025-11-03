package com.bq.java.Loops;

import java.util.Iterator;
import java.util.Scanner;

public class Scanner_UserInput {

	public static void main(String[] args) {
		
		
		//Creating object for Scanner
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Start Number:-->");
		int start=sc.nextInt();
		
		System.out.println("Enter End Number:-->");
		int End=sc.nextInt();
		
		for (int i = start; i <= End; i++) 
		{
			System.out.println(i);
		}
		
		
	}

}
