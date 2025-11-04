package com.bq.java.Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) {
		
		Set<String> set=new TreeSet<String>();
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
		//set.clear();
		
		//Check collection empty status
		boolean status=set.isEmpty();
		System.out.println("Collection empty status:--> "+status);
		
		//Reading all object from set
		for (String string : set) 
		{
			System.out.println("=>"+string);
		}
		
		
		//Reading collection of objects using while loop
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext())
		{
			String each=iterator.next();
			System.out.println("#"+each);
		}
		
		
		//Reading object using for loop
		for (Iterator iterator2 = set.iterator(); iterator2.hasNext();) 
		{
			String string = (String) iterator2.next();
			System.out.println("$"+string);
		}
		
		

	}

}
