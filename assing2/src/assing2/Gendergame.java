package assing2;

import java.util.Scanner;

public class Gendergame {

	private static Scanner gender;
	private static Scanner name;
	private static Scanner lastname;
	private static Scanner ag;

	public static void main(String[] args) {

	
	String  Name , Last_name;
	char Gender= 0, married = 0;
	int age;
	 
	
	gender = new Scanner(System.in);
	System.out.println("ENTER YOUR GENDER(M or F):- ");
    Gender = gender.next().charAt(Gender);
   
    name = new Scanner(System.in);
    System.out.println("FIRST NAME:-");
    Name = name.next();
    
    lastname = new Scanner(System.in);
    System.out.println("LAST NAME");
    Last_name = lastname.next();
    
    System.out.println("ENTER AGE");
    ag = new Scanner(System.in);
    age = ag.nextInt();
    
    
    switch(Gender){
    
    case 'M':
    	    if (age>=20)
    	    	System.out.println("Then I shall be " + "Mr."+ Name + Last_name );
    	    else
    	    	System.out.println("Then I shall be  " + Name + Last_name);
    	    	
    	    break;
    	    
    case 'F':
    
		if (age>= 20) {
			System.out.println("Are you married," + Name +"(Y or N)");
    	    married = new Scanner(System.in).next().charAt(0);
    	    
    	    switch(married){
    	    
    	    case 'Y':
    		   System.out.println("then I shall be Mrs." + Name + Last_name  );
    	    break;
    	   
    	    case 'N':
    			   System.out.println("then I shall be Ms."+ Name + Last_name);
    		break;
    		
    		default:
    			   System.out.println("Enter correct match");
    	    break;}
    	    }
    	    	    
		
    	    else {
			   System.out.println("then I shall be Ms."+ Name + Last_name);
    	   }
    	break;
		
		
    	default:
    		System.out.println(" enter your corret gender");
		break;
		
	}
    	
	
	}
}
    
	



