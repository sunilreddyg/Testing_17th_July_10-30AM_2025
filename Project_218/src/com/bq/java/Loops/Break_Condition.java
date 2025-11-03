package com.bq.java.Loops;

public class Break_Condition {

	public static void main(String[] args) {
		
		
		//Print numbers 1 to 100
		for (int i = 1; i < 101; i++) 
		{
			System.out.println(i);
			if(i==5)
			{
				break;  //Eject from iteration
			}
			
		}
		
		
		System.out.println("\n");
		
		
		//Continue 
		for (int i = 1; i < 101; i++) 
		{
			
			if(i==5 || i==10)
			{
				continue;      //It Skip one iteration
			}
			System.out.println(i);
		}
		
		
		

	}

}
