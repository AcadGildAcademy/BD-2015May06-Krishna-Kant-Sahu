package assing2;

import java.util.Scanner;

public class palindrome {

	private static Scanner scanner;

	public static void main(String[] args) {
		
	
		int num = 0 ;
				
	    scanner = new Scanner (System.in);
		System.out.println("Enter a number to check for palindrome");
		
		num = scanner.nextInt();
	 
		int number = num;

		int reverse = 0;

		while(num!=0){

		reverse=reverse*10;

		reverse=reverse+ num % 10;

		num =num/10;
		}

		if(number == reverse){

		System.out.println("The given number "+ number +" is palindrome");

		}

		else

		System.out.println("The given number "+ number +" is not palindrome");

   }

}
