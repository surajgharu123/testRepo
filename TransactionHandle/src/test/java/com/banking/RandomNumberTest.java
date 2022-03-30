package com.banking;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RandomNumberTest {

	int startingNumber;
	int endNuber;
	
	
	
	
	public RandomNumberTest(int startingNumber, int endNuber) {
		super();
		this.startingNumber = startingNumber;
		this.endNuber = endNuber;
	}
	
	double is(RandomNumber r, int start, int end) {
		if(r.getRandomNumber() > start && r.getRandomNumber() < end)
			return 1;
		return r.getRandomNumber();
		
	}
	@SuppressWarnings("rawtypes")
	@Parameters
	public static Collection testAddComplexNumbers() {
		Collection cols = Arrays.asList(new Object[][] {
			{1, 100}, {1,100}, {1,100}
		});
		return cols;
	}
	@Test
	public void test() {
		RandomNumber randomNumber = new RandomNumber();
	    assertNotEquals(randomNumber.getRandomNumber(), is(randomNumber, this.startingNumber, this.endNuber));		
	  }

}
