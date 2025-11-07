package com.bq.java.oops.polymorphism.overloading;

public class Overloading
{
	//Method without paramter
	public void print_product()
	{
		System.out.println("Iphone");
	}
	
	//Overloading method with double paramter
	public void print_product(double price)
	{
		System.out.println("Iphone"+"     "+price);
	}
	
	//Overloading method with String,double paramter
	public void print_product(String color, double price)
	{
		System.out.println("Iphone"+"   "+color+"     "+price);
	}
	
	//Overloading method with double paramter
	public void print_product(double price, String color)
	{
		System.out.println("Iphone"+"   "+price+"     "+color);
	}
	
	//Sequence paramter
	public void print_product(String name,String Config)
	{
		System.out.println(name+"  "+Config);
	}
	

	public static void main(String[] args)
	{
		Overloading obj=new Overloading();
		obj.print_product();
		obj.print_product(100000.00);
		obj.print_product("Blue", 150000.00);
		obj.print_product(230000.00, "Red");
		obj.print_product("Samsung", "126GB");
	}

}
