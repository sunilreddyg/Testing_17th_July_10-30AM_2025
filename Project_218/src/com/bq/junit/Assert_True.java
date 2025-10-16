package com.bq.junit;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Assert_True {

	@Test
	void test() 
	{
		String Status="Account 100 Created";
		boolean flag=Status.contains("101");
		Assert.assertTrue(flag);
		System.out.println("Number Available");
	}

}
