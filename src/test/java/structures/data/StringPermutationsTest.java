package structures.data;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringPermutationsTest {

	@Test
	public void checkIfStringPermutationsTest() {
		assertTrue("string and stirng should return true", StringPermutations.checkIfStringPermutations("string", "stirng"));
		assertFalse("abs and abc should return false", StringPermutations.checkIfStringPermutations("abs", "abc"));
		
		assertFalse("abcdcccs and abddcssccc should return false", StringPermutations.checkIfStringPermutations("abcdcccs", "abddcssccc"));
		assertTrue("abs and abc should return false", StringPermutations.checkIfStringPermutations("kshypkrt", "krtkyshp"));
		
		assertTrue("aaaaabbbbcccdde and eddcccbbbbaaaaa should return true", StringPermutations.checkIfStringPermutations("aaaaabbbbcccdde", "eddcccbbbbaaaaa"));
		
		assertTrue("string and stirng should return true", StringPermutations.checkIfStringPermutationsBySotring("string", "stirng"));
		assertFalse("abs and abc should return false", StringPermutations.checkIfStringPermutationsBySotring("abs", "abc"));
	}

}
