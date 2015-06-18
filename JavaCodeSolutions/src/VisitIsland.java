import java.util.Scanner;


public class VisitIsland {

	public static void main(String[] args) {
		
		String Island = "null";
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the Island you want to visit & i will take you there.");
		
		
		Island = scanner.next();
		
		switch(Island) {
			
		case "SANTORINI":
			 System.out.println("User wants to visit Santorini Island");
		break;
			
		case "ANDAMAN":
			   System.out.println("User wants to visit Andaman Island");
	    break;
			
	    case "NICOBAR":
               System.out.println("User wants to visit Nicobar Island");
        break;
			
	    case "HAWAII":
		       System.out.println("User wants to visit Hawaii Island");
		break;
		
	    case "EASTER":
	    	   System.out.println("User wants to visit Easter Island");
		break;
		
	    default:
			   System.out.println("Unknown Island");
	    break;

		}
	}

}
