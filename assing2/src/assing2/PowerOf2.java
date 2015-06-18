package assing2;

import java.util.Scanner;

public class PowerOf2 {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		int number = 0 ;
		
	    scanner = new Scanner (System.in);
		System.out.println("Enter a number to check for palindrome");
		
		number = scanner.nextInt();
		int num = number;
		if(num%2==0){
		while (num!= 2 ) {
               num = num/2;
			
			return;
			
		}

			System.out.println("power"+num);
			
		}
		else
		{
			System.out.println("not"+num);
		}
	

	}

}
