package org.example;

public class Time {

	public static boolean isPangram(String str) {
		// Convert the string to lowercase to handle case insensitivity
		str = str.toLowerCase();

		// Create a boolean array to track the presence of each letter
		boolean[] alphabet = new boolean[26];
		int index;

		// Iterate through each character in the string
		for (char c : str.toCharArray()) {
			// Check if the character is a letter from 'a' to 'z'
			if (c >= 'a' && c <= 'z') {
				index = c - 'a'; // Calculate the index for the letter
				alphabet[index] = true; // Mark the letter as present
			}
		}

		// Check if all letters are present
		for (boolean present : alphabet) {
			if (!present) {
				return false; // If any letter is missing, it's not a pangram
			}
		}
		return true; // All letters are present
	}

	public static void main(String[] args) {
		String testString = "The quick brown fox jumps over a lazy dog!";
		System.out.println(isPangram(testString)); // Output: true
	}
}
