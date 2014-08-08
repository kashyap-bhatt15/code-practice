package structures.data;

/*
 * Problem: Implement a method to perform basic sting compression using the counts of repeated
 * characters. For example, the string aabbcccccaaa would become a2b2c5a3. If the "compressed"
 * string would not become smaller than the original string, mehod should return the original string.
 */
public class StringCompression {
	
	private String str;
	private String compressedStr;
	
	public StringCompression() {
		compressedStr = "";
	}

	public String getOriginalString() {
		return str;
	}

	public void setString(String str) {
		this.str = str;
	}
	
	public String getCompressedStr() {
		compressedStr = "";
		int count = 1;
		String currentOccurance = "";
		for (int i = 0; i < this.str.length(); i++) {
			if(i > 0) {
				if(str.charAt(i) == str.charAt(i - 1)) {
					count++;
					currentOccurance = String.valueOf(str.charAt(i));
					currentOccurance += String.valueOf(count);
				}
				else {
					compressedStr += str.charAt(i - 1);
					compressedStr += count;
					count = 1;
				}
			}
		}
		compressedStr += currentOccurance;
		if(compressedStr.length() < str.length())
			return compressedStr;
		else
			return str;
	}

}
