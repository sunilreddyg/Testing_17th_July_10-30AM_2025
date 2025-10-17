package com.bq.java.Exceptions;

public class Multiple_Catch {

	public static void main(String[] args) {
		
		try {
			//Write ErrorCode here
			//Write Another Error Here
		} catch (ArithmeticException e){
			//Handle ArithmeticError here
		
		} catch (ArrayIndexOutOfBoundsException e) {
			//Handle ArrayIndex Out of boundsexception
		}
		
		
		
		try {
			 int a = 30, b = 0;
	         int c = a/b;  // cannot divide by zero //ErroCode
	       
	         char ch[]= {'a','b'};
	         System.out.println(ch[5]);  //ErrorCOde
	         
		} catch (ArithmeticException e) {
			System.out.println("Handled Arithmetic error");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("boundary exception");
		}
		
		
		
		
		
		//Using Webdriver
		
		
		
		
		
		
	}

}
