package com.class10;

public class LoopsRecap {

	public static void main(String[] args) {
		boolean condition = true;
		
		while(condition) {
			System.out.println("I am a while loop ");
			
			for(int i = 1; i <4; i++) {
				System.out.println("I am a for loop");
				condition =false;
				
			}
		}
	}

}
