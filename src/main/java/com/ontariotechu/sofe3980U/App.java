package com.ontariotechu.sofe3980U;
import java.util.HashMap; // import the HashMap class

class App {
  public static int charCount(String input, char character) {
    // Store a count of all characters in the HashMap
    // use the keys to represent the character and the value to
    // represent the number of times the character is listed in
    // the input string
    HashMap<Character, Integer> charMap = new HashMap<>();
    for (char current : input.toCharArray()) {
      // Default to a count of 1, if the character
      // has never been seen before
      int count = 1;

      // If the character already exists in the HashMap
      // bump up the character count by 1
      if (charMap.containsKey(current)) {
        count = charMap.get(current) + 1;
      }

      charMap.put(current, count);
    }

	if (!charMap.containsKey(character)) {
	  return 0;
	}
	
    return charMap.get(character);
  }

  public static void main(String[] args) {
    String input = "Hello World";

    System.out.println("Count of 'o': " + charCount(input, 'o'));
  }
}