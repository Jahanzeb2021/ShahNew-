package com.class4;

public class IFStatmentTask {

	public static void main(String[] args) {
		

		double mortgageRate = 4.4;
		int mortgagePrice = 2000000;
		
		if(mortgageRate > 4.5) {
			System.out.println("I will not buy a house when MortgageRate is > 4.5 so it is "+mortgageRate);
		}else {
			System.out.println("I will Buy a house when MortgageRage is < 4.5 so it is "+mortgageRate);
			
			if(mortgagePrice > 200000) {
				System.out.println("I will take a loan ");
			}else {
				System.out.println("I will pay cash");
			}
		}
			

		
	}

}
