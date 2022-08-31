package com.class11;

public class ArryOF2DPresident {

	public static void main(String[] args) {
		
		String [][] president = {
				{"MR","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"},
		};
		System.out.println(president[0][1]+" "+president[1][0]+" "+president[0][0]+" "+president[1][3]);
		//System.out.println(president[0][0]+" "+president[1][3]);
		
		System.out.println("----------------------");
		System.out.println();
		
		String [][] president1 = new String [2][4];
		//row 1 
		president1[0][0]= "MR";
		president1[0][1]= "Mrs";
		president1[0][2]= "Ms";
		president1[0][3]= "Miss";
		//row 2
		president1[1][0]= "Smith";
		president1[1][1]= "Jordan";
		president1[1][2]= "Jackson";
		president1[1][3]= "Obama";
		
		
		System.out.println(president1[0][0]+" "+president1[1][0]+", "+president1[0][3]+" "+president1[1][2]);
		
      
	}

}
