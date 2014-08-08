package structures.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCompressionTest {
	
	StringCompression sc = new StringCompression();
	
	@Test
	public void test() {
		sc.setString("aabbccaaccbbb");
		assertEquals("incorrect output", "a2b2c2a2c2b3",sc.getCompressedStr());
		
		sc.setString("abc");
		assertEquals("incorrect output", "abc",sc.getCompressedStr());
		
		sc.setString("aaaa");
		assertEquals("incorrect output", "a4",sc.getCompressedStr());
		
		sc.setString("abcdddddd");
		assertEquals("incorrect output", "a1b1c1d6",sc.getCompressedStr());
		
		sc.setString("whyamI");
		assertEquals("incorrect output", "whyamI",sc.getCompressedStr());
		
		sc.setString("jkjk12ddd5rfyrrrrrrrrrrhhhhhhhhhh");
		assertEquals("incorrect output", "j1k1j1k11121d351r1f1y1r10h10",sc.getCompressedStr());
	}

}
