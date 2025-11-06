package com.bq.java.oops.encapsulation;

public class User1 {

	public static void main(String[] args) {
		
		//User1 creating object
		Encaps obj=new Encaps();
		obj.setName("sunil");
		System.out.println(obj.getName());
		
		obj.setMobile("9030248855");
		System.out.println(obj.getMobile());
		
		//User2 creating object
		Encaps ref=new Encaps();
		ref.setName("srinivas");
		System.out.println(ref.getName());

	}

}
