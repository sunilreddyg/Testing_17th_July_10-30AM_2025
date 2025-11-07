package com.bq.java.oops.Abstract;

public  class Rectangle extends Shape
{

	@Override
	void draw() 
	{
		
		System.out.println("Rectange Method Executed");
	}


	public static void main(String[] args) {
		
		Shape obj=new Rectangle();
		obj.draw();
		obj.corners();
		
		//Calling Static method from abstract class
		Shape.Capture();
		System.out.println(Shape.name);
		
		
		
	}


}
