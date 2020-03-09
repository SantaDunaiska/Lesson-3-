package com.lesson3;
//calculate the salary payment based on the working hours(standard hr.,overtime hr.)


public class Payment {

	//declare instance  variables for the values to be calculated
	
			private static double standardPay;
			private static double overtimePay;
			private static double totalPay;
			
	//declare methodvwith 3parameters to calculate the payment 
			public  void calculatePayment(double payRate, double standartHours, double overtime){
				double standartPay = payRate * standartHours;
				double overtimePayRate = payRate * 1.5;
				overtimePay = overtimePayRate * overtime;
	
				
				totalPay = standartPay + overtimePay;
				
				
			}
			
	public static void displayPayment() {
		
		System.out.println("My standard pay is : " + standardPay);
		System.out.println("My overtime pay is : " + overtimePay);
		System.out.println("My total pay is : " + totalPay);
	}
	
	public static void main(String[] args){
		
	Payment myPayment;
	
	myPayment = new Payment();
	
	double pR, sH, oH;
	pR = 20;
	sH = 40;
	oH = 20; 
	
	myPayment.calculatePayment(pR, sH, oH);
	myPayment.displayPayment();
	
	myPayment.calculatePayment (19.5, 35, 12);
	myPayment.displayPayment();
	}//end main

}// end class
