package com.bq.java.String;

public class StringBuilder_Example {

	public static void main(String[] args) {
		
		
		String name="ArjunVishal";
		System.out.println("String is --> "+name);
		
		 StringBuilder sb = new StringBuilder("SunilReddy");
	     System.out.println("Initial StringBuilder: " + sb);

	     // Append a string to the StringBuilder
	     sb.append(" gajjala");
	     System.out.println("After append: " + sb);
	     
	     // 2. Insert a substring at a specific position
	     sb.insert(5, " kumar ");
	     System.out.println("After insert: " + sb);
	     
	     // 3. Replace a substring with another string
	     sb.replace(0, 5, "Welcome to");
	     System.out.println("After replace: " + sb);
	     
	     // 4. Delete a substring from the StringBuilder
	      sb.delete(8, 14);
	      System.out.println("After delete: " + sb);

	      // 5. Reverse the content of the StringBuilder
	      sb.reverse();
	      System.out.println("After reverse: " + sb);
	      
	      // 7. Get the length of the StringBuilder
	      int length = sb.length();
	      System.out.println("Current length: " + length);

	      // 8. Access a character at a specific index
	      char charAt5 = sb.charAt(5);
	      System.out.println("Character at index 5: " + charAt5);

	      // 9. Set a character at a specific index
	      sb.setCharAt(5, 'X');
	      System.out.println("After setCharAt: " + sb);

	      // 10. Get a substring from the StringBuilder
	      String substring = sb.substring(5, 10);
	      System.out.println("Substring (5 to 10): " + substring);
	    
	     
	}

}
