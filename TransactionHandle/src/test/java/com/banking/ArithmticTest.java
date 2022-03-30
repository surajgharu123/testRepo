package com.banking;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ArithmticTest {

	
	Arithmtic arithmtic = null;
	
	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("The Static Value  inside Class :: ");
	}
	
	@AfterClass
	public static void testAfterClass() {
		System.out.println("The Static Value Outside Class :: ");
	}
	@Before
	public void testBefore() {
		arithmtic = new Arithmtic();
	}
	
	@After
	public void testAfter() {
		arithmtic = null;
	}
	@Test(timeout = 1000)
	public void testAdd() {
		assertEquals(arithmtic.add(10, 5), 15);
		System.out.println("Inside testAdd()");
	}
	
	@Test
	@Ignore("Not Ready for Run")
	public void testAdd2() {
		assertEquals(arithmtic.add(19, 5), 24);
		System.out.println("Inside testAdd2()");
	}
	@Test(expected = ArithmeticException.class)
	public void testDivide() {
		assertEquals(arithmtic.divide(10, 0), 2);
		System.out.println("Inside testDivi()");
	}

}
