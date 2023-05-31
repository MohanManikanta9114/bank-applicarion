package com.cisco.demos;

public class AddArguments {

	public static void main(String[] args) {
		
		
		int sum=0;
		for (String element : args) {
			try {
			sum += Integer.parseInt(element);
			}
			catch(NumberFormatException variable) {
				variable.printStackTrace();
				//System.err.println(variable.getMessage());
			}
			
		}
		System.out.println("Sum ="+sum);
		
	}

}
