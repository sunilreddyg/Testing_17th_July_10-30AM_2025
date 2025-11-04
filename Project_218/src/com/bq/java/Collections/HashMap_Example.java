package com.bq.java.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example {

	public static void main(String[] args) {
		
		
		Map<String, Double> map=new HashMap<String,Double>();
		map.put("Samsung", 65000.00);
		map.put("iphone", 75000.00);
		map.put(null, null);
		map.put("vivo", null);
		map.put("Oppo", 45000.00);
		
		//Get size of the collection
		System.out.println(map.size());
		
		//Using get method read vaue with help of key
		Double price=map.get("iphone");
		System.out.println(price);
		
		//Remove object
		map.remove("vivo");
		
		//Check key availability
		boolean flag=map.containsKey("Oppo");
		System.out.println("key available status is --> "+flag);
		
		//Replace key and value
		map.replace("iphone", 52000.00);
		
		//Reading all values using key name
		for (String eachkey : map.keySet()) 
		{
			System.out.println("=> "+map.get(eachkey));
		}
		
		//Read only value
		for (Double prices : map.values()) {
			System.out.println(prices);
		}
		
	}

}
