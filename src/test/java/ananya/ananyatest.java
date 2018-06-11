package ananya;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class ananyatest {

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@Test
	public void test() {
		System.out.println("test");
	}

}
