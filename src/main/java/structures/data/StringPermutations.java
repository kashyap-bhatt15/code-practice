package structures.data;

import utils.StringUtil;

/* 
 * Problem: Given two strings, write a method to decide if one is
 * a permutation of the other
 */
public class StringPermutations {
	private static StringUtil util = new StringUtil();
	
	static boolean checkIfStringPermutations(String one, String two) {
		if(one.length() != two.length())
			return false;
		
		if(!util.getCharacterCounts(one).equals(util.getCharacterCounts(two)))
			return false;
		
		return true;
	}
	
	static boolean checkIfStringPermutationsBySotring(String one, String two) {
		if(one.length() != two.length())
			return false;
		
		return util.sort(one).equals(util.sort(two));
	}


}
