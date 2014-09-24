package structures.data;

public class MainProgram {

	public static void main(String[] args) {
		System.out.println("Hello from Main Program");
		System.out.println(UniqueCharacterString.checkIfStringHasAllUniqueCharacters("hellobc"));
		System.out.println(UniqueCharacterString.checkIfStringHasAllUniqueCharacters("abcc"));
		for(int i = 0; i < new StringRotation("ABTOP").getStringRotations().length; i++) {
			System.out.println(new StringRotation("ABTOP").getStringRotations()[i]);
		}
		
	}

}
