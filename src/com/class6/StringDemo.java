package com.class6;

public class StringDemo {

	public static void main(String[] args) {
		
		String str = "hello";
		String str1 = "Hello";
		boolean result;
		
		result = str.equals(str1);
	    System.out.println("The result is "+result);
	    
	    System.out.println("--------------------------");
	    
	    result = str.equalsIgnoreCase(str1);
	    System.out.println("The result is "+result);
	    
	    

	}

}
