package com.bq.java.methods;

	public class InputDevices
	{
		//Instant method
		public void mouse()
		{
			System.out.println("Mouse Called");
		}

		public static void keyboard()
		{
			System.out.println("Keyboard called");
		}

		public static void main(String[] args)
		{
			//Calling instant method
			//new Classname().methodname();
			new InputDevices().mouse();
			
			//Calling static method
			//Classname.methodname();
			InputDevices.keyboard();
		}
		

	}