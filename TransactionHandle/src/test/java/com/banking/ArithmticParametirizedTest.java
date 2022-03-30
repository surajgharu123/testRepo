package com.banking;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ArithmticParametirizedTest {

	int x;
	int y;
	
	public ArithmticParametirizedTest(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@SuppressWarnings("rawtypes")
	@Parameters
	public static Collection testData() {
		Collection col = Arrays.asList(new Object[][] {
			{12,3} , {80, 30}, {30, 20}
		});
		return col;
	}
	@Test
	public void test() {
		Arithmtic arithmtic = new Arithmtic();
		assertEquals(arithmtic.add(x, y), x+y);
	}

}
