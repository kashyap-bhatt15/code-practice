package structures.data;

import java.util.HashMap;

/*
 * Problem: Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */
public class UniqueCharacterString {
	static boolean checkIfStringHasAllUniqueCharacters(String s) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char [] chars = s.toCharArray();
		for(int i=0; i < chars.length; i++) {
			if(hm.containsKey(chars[i])) {
				return false;
			} else {
				hm.put(chars[i], 1);
			}
		}
		
		return true;
	}

	static boolean checkIfStringHasAllUniqueCharacters2(String str) {
		if (str.length() > 256) {
			return false;
		}
		boolean [] chars = new boolean[256];
		
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if(chars[val]) {
				return false;
			}
			chars[val] = true;
		}
		return true;
	}
}
