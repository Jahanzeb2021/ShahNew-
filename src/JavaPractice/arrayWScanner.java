package JavaPractice;

import java.util.Scanner;

public class arrayWScanner {

	public static void main(String[] args) {

		int[] array;
		int size;
		int sum = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("How many vlaue wouid like to store? ");
		
		size = input.nextInt();
        array = new int[size];
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Please enter a number");
			array[i] = input.nextInt();
			
		}

		for (int i = 0; i < array.length; i++) {

			sum+=array[i];
			
		}
		System.out.println(sum);
		
//		for(int arr:array) {
//			sum+=arr;
//			
//		}
//		System.out.println(sum);
	}

}
