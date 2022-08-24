package com.class9;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class NestedLoopCock {

	public static void main(String[] args) {
	   System.out.println("----------Print clock---------------");
	   /*
	    * hour from 1 to 24 hrs
	    * Min from 1 to 60 Min 
	    */

	   for(int h = 0; h < 24; h++) {
		   for (int m = 0; m < 60; m++) {
			   if(h<10) {
				   System.out.println("0"+h+":"+m);
			   if(m<10) {
				   System.out.println("0"+m+":"+h);
			   }else {
				  System.out.println(h+":"+m);
			   }
			   }else {
				   //System.out.println(h+":"+m);
			   }
			   
		   }
		   
	   }
	}

}
