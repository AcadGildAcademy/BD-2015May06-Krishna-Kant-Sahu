package assing2;

import java.util.Scanner;

public class VowelConsonant {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		char ch = 0 ;
		
		scanner = new Scanner (System.in);
		System.out.println("Enter the character :-");
		ch = scanner.next().charAt(0);
		
		switch(ch)
        {
            case 'A':
            System.out.println("The given character "+ ch +" is vowel");
            break;
 
            case 'E':
            System.out.println("The given character "+ ch +" is vowel");
            break;
 
            case 'I':
            System.out.println("The given character "+ ch +" is vowel");
            break;
 
            case 'O':
            System.out.println("The given character "+ ch +" is vowel");
            break;
 
            case 'U':
            System.out.println("The given character "+ ch +" is vowel");
            break;
 
            default:
            System.out.println("The given character "+ ch +" is consonant");
            break;
        }
		

	}

}
