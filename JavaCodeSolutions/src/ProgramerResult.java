import java.util.Scanner;


public class ProgramerResult {

	public static void main(String[] args) {
		char grade = 0;
		int success = 0;
		Scanner scanner = new Scanner ( System.in);
		System.out.println("Enter your grade :-");
		grade = scanner.next().charAt(0);
	    
	    
	switch(grade){
		 
	        case 'A':
	        	System.out.println("Excellent Grade" );
	        	success = 1 ; 
	        break;

	        case 'B': 
	        	System.out.println("Very Good Grade" );
		        success = 1 ;  
	        break;

		    case 'C': 
		    	System.out.println("Good Grade" );
                success = 1;
            break;

	        case 'D': 
	        	System.out.println("Low Grade" );
		        success = 0;
	        break;


		    default: 
		    	System.out.println("INVALID GRADE" );
                success = -1;	        
		    break;
                
		    }	
	
            switch(success){
            
            case -1:
            	System.out.println("NO RESULT");
            break;
            	
            case 0 :
            	System.out.println("Final result:- FAIL");
            break;
            	
            case 1 :
            	System.out.println("final result:- PASS");
            break;
            	
            }
                
         }
	}


