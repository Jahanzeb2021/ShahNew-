package JavaPractice;

import java.util.Scanner;

public class Repls37 {

	public static void main(String[] args) {
//Take 2 boolean inputs from a user:
//Are you thirsty?"
//Are you sleepy?"
//If user is thirsty and not sleepy--> drink=water
//If user is thirsty and sleepy--> drink=coffee
//If user is not thirsty and sleepy --> drink=tea
//Otherwise drink="nothing"
		
		String drink;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Are you thirsty ?");
	    boolean thirsty = scan.nextBoolean();
	    System.out.println("Are you sleepy ?");
	    boolean sleepy = scan.nextBoolean();
	    
	    if(thirsty && !sleepy) {
	    	drink = "Water";
	    }else if(thirsty && !sleepy) {
	    	drink = "coffee"; 	
	    }else if(!thirsty && sleepy) {
	    	drink ="tea";
	    }else {
	    	drink ="nothing";
	    }
	    
	    System.out.print("Looks like you need to drink (:) "+drink+" ");
	    System.out.println();
        
	}

}
