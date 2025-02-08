package org.example;

import java.util.Scanner;

//Roman numerals are represented by seven different symbols – I, V, X, L, C, D and M
//		 
//		I = 1
//		V = 5
//		X = 10
//		L = 50
//		C = 100
//		D = 500
//		M = 1000
//		 
//		Please write a program which will accept an integer and convert into Roman numerals?  This can be in a language of your choice.
//		 
//		E.g.
//		 
//		10 equates to X
//		20 equates to XX
//		12 equates to XII
//		17 equates to XVII
//		has context menuRoman numerals are represented by seven different symbols – I, V, X, L, C, D and M
//		 
//		I = 1
//		V = 5
//		X = 10
//		L = 50
//		C = 100
//		D = 500
//		M = 1000
//		 
//		Please write a program which will accept an integer and convert into Roman numerals?  This can be in a language of your choice.
//		 
//		E.g.
//		 
//		10 equates to X
//		20 equates to XX
//		12 equates to XII
//		17 equates to XVII
//		has context menu

public class Sample {
	// Method to convert integer to Roman numeral
	public static String intToRoman(int num) {
		// Arrays to hold the Roman numeral symbols and their corresponding values
		String[] romanNumerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		StringBuilder roman = new StringBuilder();

		// Loop through the values and build the Roman numeral
		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				roman.append(romanNumerals[i]);
				num -= values[i];
			}
		}

		return roman.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = scanner.nextInt();

		// Validate input
		if (num <= 0 || num >= 4000) {
			System.out.println("Please enter a number between 1 and 3999.");
		} else {
			String romanNumeral = intToRoman(num);
			System.out.println(num + " equates to " + romanNumeral);
		}

		scanner.close();
	}
}
