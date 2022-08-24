package com.class9;

public class NestedLoopDemo {

	public static void main(String[] args) {
		
     for (int o = 1; o >= 3; o++) {
    	 System.out.println("I am outer loop");
    	 
    	 for(int i = 1; i <= 3; i++) {
    		 System.out.println("I am Inner loop");
    	 }
    	 System.out.println("----------------------");
    	 
     }
     System.out.println("--------Loop condition is false----------");
     System.out.println();
     
    for (int i = 10; i <= 15; i++) {
    	
    	for(int j = 1; j<= 4; j++) {
    		System.out.println(i+" AND "+j);
    	}
    	System.out.println("-------------");
    }
    
    System.out.println("----------More Example--------------");
    System.out.println();
    
    for (int i = 1; i <= 9; i ++) {
    	
    	for(int j =0; j <=9; j++) {
    	System.out.println(i+""+j);	
    	}
    	
    }
    System.out.println("---------------------");
    for(int a = 10; a<= 99; a++) {
    	System.out.print(a+" ");
    }
    
	}

}
