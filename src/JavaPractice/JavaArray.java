package JavaPractice;

public class JavaArray {
	public static void main(String[] args) {

		String[] countries = { "USA ", "Afghanistan ", "India ", " Turkey " + "Vien" };

		String capital = null;
		for (int i = 0; i < countries.length; i++) {

			if (countries.equals("USA")) {
				capital = "DC";
			} else if (countries.equals("Afghanistan")) {
				capital = "Kabul";
			} else if (countries.equals("India")) {
				capital = "Delhi";
			} else if (countries.equals("Turkey")) {
				capital = "Istanbul";
			} else if (countries.equals("Vien")) {
				capital = "Austria";

			}
			System.out.println(countries[i]+" "+capital);
		}
		

	}

}
