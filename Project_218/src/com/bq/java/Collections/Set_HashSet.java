package com.bq.java.Collections;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {

	public static void main(String[] args) {
		
		
		Set<String> set=new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("six");
		set.add("seven");
		set.add("eight");

		//Remove object from collection
		set.remove("four");
	
		
		//Size of object...
		int count=set.size();
		System.out.println(count);
		
		//Checking Object Contains at collection
		boolean flag=set.contains("eight");
		System.out.println("Object Contains --> "+flag);
		
		//Read first iteratable value
		String itr=set.iterator().next();
		System.out.println("First iterated value:--> "+itr);
		
		
		//Clear Data from collection
		set.clear();
		
		//Check collection empty status
		boolean status=set.isEmpty();
		System.out.println("Collection empty status:--> "+status);
		
		//Reading all object from set
		for (String string : set) 
		{
			System.out.println(string);
		}
		

	}

}
