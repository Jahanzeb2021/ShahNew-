package com.class6;

import java.util.Scanner;

public class SalesDemo {

	public static void main(String[] args) {
		
		boolean sale;
		Scanner scan = new Scanner(System.in);
	    System.out.println("Does the store has sale ?");
	    sale = scan.nextBoolean();
		
	    if(!sale) {
	    	System.out.println("We are  going to shopping");
	    }else {
	    	System.out.println("we are not going to shopping");
	    }
	    
	    
	}

}
