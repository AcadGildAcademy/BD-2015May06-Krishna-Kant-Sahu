package assing2;

import java.util.Scanner;

public class NestedLeapYear {

	private static Scanner scanner;

	public static void main(String[] args) {
		
        int year = 0 ;
		
		scanner = new Scanner (System.in);
		System.out.println("Enter a year :-");
		
		year = scanner.nextInt();
		
        if (year%400==0)
			System.out.println(+ year + " is a leap year.");
        else if (year%100==0)
        	System.out.println(+ year + " is not a leap year");
		else if (year%4==0)
			System.out.println(+year + " is a leap year.");
		
    
	}

}
