import java.util.Scanner;


public class Pattern2 {

	private static Scanner scanner;

	public static void main(String[] args) {

    int num= 0;// inter the value = 16, the pattern can be display
    scanner = new Scanner (System.in);
	System.out.println("Enter the integer value:-");
	num = scanner.nextInt();
	
		 for(int i=1;i<=num;i+=3)
		 {
			 System.out.println(+i);
		 }
			 
	}

}
