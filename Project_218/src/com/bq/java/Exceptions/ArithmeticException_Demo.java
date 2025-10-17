package com.bq.java.Exceptions;

public class ArithmeticException_Demo {

	public static void main(String[] args) {


		try {
			
			 int a = 30, b = 0;
	         int c = a/b;  // cannot divide by zero //ErroCode
	         System.out.println ("Result = " + c);
	         
	         
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
         
        System.out.println("Continue");
         
         

	}

}
