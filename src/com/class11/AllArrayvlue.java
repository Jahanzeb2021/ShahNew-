package com.class11;

public class AllArrayvlue {

	public static void main(String[] args) {
		int[][] array = new int[3][3];

		array[0][0] = 10;
		array[0][1] = 20;
		array[0][2] = 30;

		array[1][0] = 60;
		array[1][1] = 70;
		array[1][2] = 80;

		array[2][0] = 110;
		array[2][1] = 120;
		array[2][2] = 1300;

		System.out.println(array.length);

		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[r].length; c++) {

				System.out.print(array[r][c] + " ");
			}
			System.out.println();
		}

	}

}
