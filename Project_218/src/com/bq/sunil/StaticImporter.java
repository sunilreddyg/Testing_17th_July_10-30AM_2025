package com.bq.sunil;

import static java.lang.Integer.*;
public class StaticImporter 
{

	public static void main(String[] args) 
	{
			//When you add static to import statement
			//Not requied to use class or object call it's methods
			System.out.println(MAX_VALUE);
			
			
			//When you don't add static to import statement
			//Class name or object required to call methods 
			System.out.println(Byte.SIZE);
			
			System.out.println(System.currentTimeMillis());
			
	}

}
