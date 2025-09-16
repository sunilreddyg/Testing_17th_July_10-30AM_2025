package com.bq.java.callbyreference;

public class GetDetails 
{

	public void getinfo(Student1 std)
	{
		std.PrintDetails();
	}
	
	public void getgroupdetails()
	{
		System.out.println(Student1.Group);
	}
	
	public static void main(String[] args) 
	{
		
		GetDetails obj=new GetDetails();
		obj.getinfo(new Student1());
		obj.getgroupdetails();

	}

}
