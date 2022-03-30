package com.banking;

public class Arithmtic {
	
	public int add(int x, int y) {
		try {
			Thread.sleep(3000);
		}
		catch (Exception e) {
			// TODO: handle exception
		   System.out.println(e.getStackTrace());
		}
	       return x+y;
	}
	
	public int divide(int x, int y) {
	       return x/y;
	}
	

}
