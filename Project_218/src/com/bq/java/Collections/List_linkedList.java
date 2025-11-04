package com.bq.java.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class List_linkedList {

	public static void main(String[] args) {
		//List store object in Order
		//Duplication allowed
		LinkedList<String> list=new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		list.add("eight");
		list.add("six");
		
		//Adding first and last object to list 
		list.addFirst("ten");
		list.addLast("eleven");

		//Remove object from collection
		list.remove("four");
	
		//List allows to read any object using index wise
		String indexobj=list.get(2);
		System.out.println("Index object is-->"+indexobj);
	
		
		//Size of object...
		int count=list.size();
		System.out.println(count);
		
		//Checking Object Contains at collection
		boolean flag=list.contains("eight");
		System.out.println("Object Contains --> "+flag);
		
		//Read first iteratable value
		String itr=list.iterator().next();
		System.out.println("First iterated value:--> "+itr);
		
		
		//Clear Data from collection
		//list.clear();
		
		//Check collection empty status
		boolean status=list.isEmpty();
		System.out.println("Collection empty status:--> "+status);
		
		//Reading all object from list
		for (String string : list) 
		{
			System.out.println("=>"+string);
		}
		
		
		//Reading collection of objects using while loop
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext())
		{
			String each=iterator.next();
			System.out.println("#"+each);
		}
		
		
		//Reading object using for loop
		for (Iterator iterator2 = list.iterator(); iterator2.hasNext();) 
		{
			String string = (String) iterator2.next();
			System.out.println("$"+string);
		}

		//Reading object using index number
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println("*** "+list.get(i));
		}

		
	}

}
