package assing2;

import java.util.Scanner;

public class EligibleForVote {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		int age = 0 ;
		scanner = new Scanner (System.in);
		System.out.println("Enter your:-");
		age = scanner.nextInt();
		
		if(age>=18)
		
			System.out.println("You are eligible to vote.");
		else
		
			System.out.println("You are not eligible to vote.");


	}

}
