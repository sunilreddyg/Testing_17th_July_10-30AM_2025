package com.bq.java.oops.polymorphism.overriding;

public class Square extends Shape
{
	
	@Override   //annoation helps to find method is override method or not
	public void draw()
	{
		System.out.println("Square class method");
	}
	
	public void Custom_drawing()
	{
		System.out.println("Square method Custom Drawing Executed");
	}

	public static void main(String[] args) {
		
		Shape obj=new Square();
		obj.draw();  //override child class method
		
		
		Square ref=new Square();
		ref.draw();
		ref.Custom_drawing();
		
	}

}
