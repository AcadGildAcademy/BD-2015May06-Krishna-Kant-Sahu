package assing2;

import java.util.Scanner;

public class ArmstrongNumber {

	private static Scanner scanner;

	public static void main(String[] args) {
		int num = 0 , remainder;
		
	    scanner = new Scanner (System.in);
		System.out.println("Enter a number to check for armstrong number:-");
		
		num = scanner.nextInt();
	 
		int number = num;

		int reverse = 0;

		while(num!=0){

		remainder = num %10;

		reverse=reverse+ remainder*remainder*remainder;

		num =num/10;
		}

		if(number == reverse){

		System.out.println("The given number "+ number +" is a armstrong number");

		}

		else

		System.out.println("The given number "+ number +" is not a armstrong number");
	} 

}
