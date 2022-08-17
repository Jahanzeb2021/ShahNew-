package com.class4;

public class NestedIF {

	public static void main(String[] args) {
		
		boolean diploma = false;
	    double gpaScroe = 2.5;
		
		
		if(diploma) {
			System.out.println("Congragulations");
			if(gpaScroe >= 3.5 ) {
				System.out.println("Your eligible for schorlarship !!");
			}else {
				System.out.println("You shouid study harder as your can achieve your goal !!");
			}
		}else {
			System.out.println("You shouid get a degree");
		}
			

	}

}
