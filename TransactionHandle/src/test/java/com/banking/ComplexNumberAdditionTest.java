package com.banking;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ComplexNumberAdditionTest {

	int real;
	int imaginary;
	ComplexNumberAddition complexNumberAddition = new ComplexNumberAddition(4, 4);
	public ComplexNumberAdditionTest(int real, int imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}
	
	
	@SuppressWarnings("rawtypes")
	@Parameters
	public static Collection testAddComplexNumbers() {
		Collection cols = Arrays.asList(new Object[][] {
			{12,3} , {80, 30}, {30, 20}
		});
		return cols;
	}
	@Test
	public void test() {
		
		
		ComplexNumberAddition c1 = new ComplexNumberAddition(this.real, this.imaginary);
		complexNumberAddition.complexNumer(c1);
	
		this.real +=4;
		this.imaginary += 4;
		assertEquals(complexNumberAddition.getReal(), this.real);
	    assertEquals(complexNumberAddition.getImaginary(), this.imaginary);
	}

}
