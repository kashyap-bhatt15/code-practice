package utils;

import java.util.Arrays;
import java.util.HashMap;

public class StringUtil {
	
	public HashMap<Character, Integer> getCharacterCounts(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int j = 0; j < str.length(); j++) {
			if(map.containsKey(str.charAt(j))) {
				map.put(str.charAt(j), Integer.valueOf(map.get(str.charAt(j))+ 1));
			} else {
				map.put(str.charAt(j), Integer.valueOf(1));
			}
		}
					
		return map;
	}
	
	public String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

}
