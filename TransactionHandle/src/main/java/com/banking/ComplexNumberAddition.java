package com.banking;

public class ComplexNumberAddition {
	
	private int real;
	private int imaginary;
	public ComplexNumberAddition(int real, int imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}
		
	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}



	public void complexNumer(ComplexNumberAddition complexNumberAdd) {
		this.real += complexNumberAdd.real;
		this.imaginary += complexNumberAdd.imaginary;
		
	}

}
