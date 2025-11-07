package com.bq.java.oops.Abstract;

public class Circle extends Shape
{

	@Override
	void draw() 
	{
		System.out.println("Circle Draw Method");
	}
	
	void addcolor(String colorname)
	{
		System.out.println(colorname);
	}
	

	public static void main(String[] args) 
	{
		   Shape obj=new Circle();
		   obj.draw();
		   obj.corners();
		   
		   //For static method We can access using classname
		   System.out.println(Shape.name);
		   Shape.Capture();
		
	}



}
