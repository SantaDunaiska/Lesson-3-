package com.lesson3;
//perform simple calculation using methods

public class Calculator {// opens the body of the method
//declare instance variables to store result of
	private double result; 
	// declare a method called add= each method describes behaviour
	//with two parameters
	
	public void add(double numberOne, double NumberTwo){
		//add value numberOne and Number Two andstore in result
		result = numberOne + NumberTwo;
		System.out.println(numberOne + "+" + NumberTwo + "=" + result);
		
		result = numberOne - NumberTwo;
		System.out.println(numberOne + "-" + NumberTwo + "=" + result);
		
		result = numberOne / NumberTwo;
		System.out.println(numberOne + "/" + NumberTwo + "=" + result);
		
		
	}// end the body of the method
	

	public static void main(String[] args) {
	// reuse the calculator class
		//declare a variable of type calculator
		Calculator calc;
					calc = new Calculator();
	calc.add(12.6,  18.8);
	
	}//end main

}//end class
