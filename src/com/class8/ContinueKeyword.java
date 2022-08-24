package com.class8;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 10; i++) {
			if(i == 5 || i == 3) {
				
				continue;
			}
			System.out.print(i+" ");
		}

	}

}
