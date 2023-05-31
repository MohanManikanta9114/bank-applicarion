package com.cisco.demos;

public class AddArguments2 {

	public static void main(String[] args) {
		
		try {
		int sum=0;
		for (String element : args) {
			sum += Integer.parseInt(element);
		}
		System.out.println("Sum ="+sum);
		}
		catch(NumberFormatException variable) {
			variable.printStackTrace();
			//System.err.println(variable.getMessage());
		}
		finally {
			System.out.println("correct the mistake");
		}
	}

}
