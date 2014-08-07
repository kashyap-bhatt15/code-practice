package structures.data;

import static org.junit.Assert.*;
import org.junit.Test;

public class UniqueCharacterStringTest {

	
	@Test
	public void checkIfStringHasAllUniqueCharactersTest() {
		assertFalse("abcc should return false",UniqueCharacterString.checkIfStringHasAllUniqueCharacters("abcc"));
		assertTrue("abc should return true",UniqueCharacterString.checkIfStringHasAllUniqueCharacters("abcdefghijklmnopqrstuvwxyz1234567890"));
		assertFalse("abcc should return false",UniqueCharacterString.checkIfStringHasAllUniqueCharacters("abcc"));
	}
	
	@Test
	public void isUniqueChars2Test() {
		assertFalse("abcc should return false",UniqueCharacterString.checkIfStringHasAllUniqueCharacters2("abcc"));
		assertTrue("abc should return true",UniqueCharacterString.checkIfStringHasAllUniqueCharacters2("abcdefghijklmnopqrstuvwxyz1234567890"));
		assertFalse("abcc should return false",UniqueCharacterString.checkIfStringHasAllUniqueCharacters2("abcc"));
	}

}
