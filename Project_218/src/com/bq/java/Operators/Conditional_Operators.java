package com.bq.java.Operators;

public class Conditional_Operators {

	public static void main(String[] args) {
		
		
		/*
		 * 		== 	Equal to 					x == y 	
		 * 		!= 	Not equal 					x != y 	
		 * 		> 	Greater than 				x > y 	
		 * 		< 	Less than 					x < y 	
         * 		>= 	Greater than or equal to 	x >= y 	
         * 		<= 	Less than or equal to 		x <= y
         * 
         * Note:--> All are boolean return.
		 */
		
		int a=10;
		int b=20;
		
		System.out.println(a==b);   //false
		System.out.println(a!=b);   //True
		System.out.println(a>b);    //False
		System.out.println(a<b);    //True
		System.out.println(a>= 10); //True
		System.out.println(b<=20);  //False
		
		
		int age=18;
		if(age>= 18)
			System.out.println("valid age");
		else
			System.out.println("invalid age");
		
		/*
		 * Logical Operators
		 * 		
		 * 		&&  	Logical and 	Returns true if both statements are true 	
		 * 						x < 5 &&  x < 10 	
         *      ||  	Logical or 	    Returns true if one of the statements is true 	
         *      				x < 5 || x < 4 	
         *      ! 	   Logical not 	    Reverse the result, returns false if the result is true 	
         *      				!(x < 5 && x < 10)
		 */
		
		int x=3;
		int y=28;
		
		if(x<5 &&  y>10)
			System.out.println(true);
		else
			System.out.println(false);
		

		if(x>5 ||  y>10)
			System.out.println(true);
		else
			System.out.println(false);
		
		
		if(!(x<5 &&  y>10))
			System.out.println("Not Operator");
	}

}
