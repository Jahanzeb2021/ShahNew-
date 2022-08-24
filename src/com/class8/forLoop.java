package com.class8;

public class forLoop {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			System.out.print(i+" ");
		}
		System.out.println("----------------");
		System.out.println();
		
		for(int a = 10; a >= 1; a--) {
			System.out.print(a+" ");
		}
		
		System.out.println();
	     System.out.println("---------------What will be the out put----------");
	    for(int i = 0; i <= 30; i+=3) {
		System.out.print(i+" ");
	    }
	    
	    System.out.println();
	    
	    System.out.println();
	    for(int i = 20; i <= 40; i+=2) {
	    	System.out.print(i+" ");
	    }
	    System.out.println();
	    System.out.println("---------Even number Way one -------------");
	    for(int i = 20; i >= 2; i-=2) {
	    	System.out.print(i+" ");
	    }
	    System.out.println();
	    System.out.println("------------Even Number way two--------------");
	    for(int i = 20; i >= 2; i--) {
	    	if(i%2==0) {
	    		System.out.print(i+" ");
	    	}
	    	
	    }
	    
	    System.out.println();
	    System.out.println("--------------odd number way one-------------");
	    for(int i = 20; i <= 50; i++) {
	    	if(i%2==1) {
	    		System.out.print(i+" ");
	    	}
	     
	}
	    System.out.println();
	    System.out.println("--------------odd number way two-------------");
	    for(int i = 19; i < 50; i+=2) {
	    	
	    		System.out.print(i+" ");
	    	
	    
	    }    
	    
	}
}
