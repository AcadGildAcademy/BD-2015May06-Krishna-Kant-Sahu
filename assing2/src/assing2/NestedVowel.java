package assing2;

import java.util.Scanner;

public class NestedVowel {

	private static Scanner scanner;

	public static void main(String[] args) {
	
        char ch = 0 ;
		
		scanner = new Scanner (System.in);
		System.out.println("Enter the character :-");
		ch = scanner.next().charAt(0);

		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch =='o' || ch=='O' || ch == 'u' || ch == 'U')
			
		    System.out.println("The given character "+ ch +" is vowel");
		
		else
			  
		    System.out.println("The given character "+ ch +" is consonant");
	}

}
