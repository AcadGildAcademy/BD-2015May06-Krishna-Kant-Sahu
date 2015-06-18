package assing2;

import java.util.Scanner;

public class EvenOdd {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		int num = 0 ;
		
		scanner = new Scanner (System.in);
		System.out.println("Enter a number:-");
		
		num = scanner.nextInt();
		
		
		if(num%2==0)
		
			System.out.println(  + num + " is an even number.");
		
		else
			System.out.println(+ num + "is an odd number.");


	}

}
