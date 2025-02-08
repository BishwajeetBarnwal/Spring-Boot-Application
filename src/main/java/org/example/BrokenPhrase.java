package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BrokenPhrase {

//	Given what is supposed to be typed and what is actually typed, write a function that returns the broken key(s). The function looks like:
//
//		findBrokenKeys(correct phrase, what you actually typed)
//		Examples
//		findBrokenKeys("happy birthday", "hawwy birthday") ➞ ["p"]
//
//		findBrokenKeys("starry night", "starrq light") ➞ ["y", "n"]
//
//		findBrokenKeys("beethoven", "affthoif5") ➞ ["b", "e", "v", "n"]
//		Notes
//		Broken keys should be ordered by when they first appear in the sentence.
//		Only one broken key per letter should be listed.
//		Letters will all be in lower case.

	public static List<String> findBrokenKeys(String correct, String typed) {
		// Create a set to track broken keys
		Set<Character> brokenKeys = new LinkedHashSet<>();

		// Use IntStream to iterate over the characters of the strings
		IntStream.range(0, Math.min(correct.length(), typed.length())).forEach(i -> {
			char correctChar = correct.charAt(i);
			char typedChar = typed.charAt(i);
			// If the characters do not match, add the correct character to broken keys
			if (correctChar != typedChar) {
				brokenKeys.add(correctChar);
			}
		});

		// Handle the case where the typed string is shorter than the correct one
		if (typed.length() < correct.length()) {
			for (int i = typed.length(); i < correct.length(); i++) {
				brokenKeys.add(correct.charAt(i));
			}
		}

		// Return the broken keys as a list
		return brokenKeys.stream().map(String::valueOf).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(findBrokenKeys("happy birthday", "hawwy birthday")); // ➞ ["p"]
		System.out.println(findBrokenKeys("starry night", "starrq light")); // ➞ ["y", "n"]
		System.out.println(findBrokenKeys("beethoven", "affthoif5")); // ➞ ["b", "e", "v", "n"]
	}
}
