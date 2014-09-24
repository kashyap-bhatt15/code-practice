package structures.data;

public class StringRotation {
	private String str;
	private String[] rotatedStrs;
	
	public StringRotation(String str) {
		this.str = str;
		this.rotatedStrs = new String[str.length()];
	}
	
	public String getStr() {
		return str;
	}

	String[] getStringRotations() {
		
		for(int i = 0; i < str.length(); i++) {
			rotatedStrs[i] = "";
			for(int j = i; j < i + str.length(); j++) {
				if(j < str.length()) {
					rotatedStrs[i] += str.substring(j, j+1);
				} else {
					rotatedStrs[i] += str.substring(j - str.length(), j - str.length() + 1);
				}
			}
		}
		return rotatedStrs;
	}

}
