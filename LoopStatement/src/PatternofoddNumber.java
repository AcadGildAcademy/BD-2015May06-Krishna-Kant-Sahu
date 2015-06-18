import java.util.Scanner;


public class PatternofoddNumber {

	private static Scanner scanner;

	public static void main(String[] args) {
      int num = 0 ;
		
	    scanner = new Scanner (System.in);
		System.out.println("Enter a number :-");
		
		num = scanner.nextInt();

		 for(int i=1; i <=num; i++){
             
       
             if( i % 2 != 0){
       
            	 System.out.print(i + " ");
	
             }
         System.out.println();
             }
          

     }
}