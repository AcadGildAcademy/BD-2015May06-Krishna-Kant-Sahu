import java.util.Scanner;


public class MonthDay2 {

	public static void main(String[] args) {
		
		int month = 0 ;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the month in integer value:-");
		month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            	
                System.out.print("number of days is 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("number of days is 30 ");
                break;
            case 2:
            	System.out.print("number of days is 29");
            	break;
            	
            default:
                System.out.println("Invalid month.");
                break; 
                
    }

	}

}
