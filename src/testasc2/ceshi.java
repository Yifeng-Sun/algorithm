package testasc2;

import org.junit.Assert;
import org.junit.Test;

public class ceshi {

	public static void main(String[] args) {
		char c = 'a';
		int i = (int)c;
		System.out.println((char)(c+1));
	}

	public int getone(){
		return 1;
	}

	@Test
	public void testgetone(){
		assert getone()==1;
		Assert.assertEquals(3.000000001,getone(),2.1);
	}
}
