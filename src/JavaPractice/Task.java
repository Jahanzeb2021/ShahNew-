package JavaPractice;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

//Declare boolean variable isSunny, ask the user "Is it sunny outside?"
//Declare int temperature and ask user "What is the temperature outside?"
//Your program should check:**
//If the weather is sunny output should be "It is a sunny day, I should go somewhere!
//If it is not sunny output should be "I stay home and practice Java"
//If the weather is sunny you want to check the temperature "What is the temperature outside?"
//If the temperature is higher than 85 then "I am going to the beach
//otherwise, "I am going to the park"
		
	boolean isSunny;
	int temPerature ;
	Scanner in = new Scanner(System.in);
    System.out.println("Is it sunny outsie ?");
    isSunny = in.nextBoolean();
    
    if(isSunny) {
    	System.out.println("Wow! It is Sunny outside, We shouId go somewhere!!!");
        System.out.println("What is the temperature outside ?");
        temPerature = in.nextInt();
    	if(temPerature > 90) {
    		System.out.println("tempreture is = "+temPerature+" I am going to the beach WoWoooo!!!");
    	}else {
    		System.out.println("I am going to park with Family! ");
    	}
    	
    }else {
    	System.out.println("I Stay home practice my java lessons (:)");
    }
    
	

	}

}
