package com.class5;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
     
		int heights;
		Scanner input;
		
		input = new Scanner (System.in);
		System.out.println("Please enter your height ");
		heights = input.nextInt();
		
		if (heights<60) {
			System.out.println("Short");
			
		}else if(heights> 60 && heights<72){
			System.out.println("Medium");
			
		}else if(heights>72) {       
			System.out.println("Tall");
			
		}else {
			System.out.println("Invalid age");
		}
		

	}

}
