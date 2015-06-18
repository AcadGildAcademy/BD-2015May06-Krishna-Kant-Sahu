import java.util.Scanner;


public class EnterPin {

	public static void main(String[] args) {
	
		int Password = 9873;
		
		System.out.println("WELCOME TO STATE BANK OF INDIA");
		
		Scanner password = new Scanner (System.in);
		System.out.println("Enter your pin:-");
		
		Password = password.nextInt();

		if(Password == 9873)
		{
			System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		}
		else
		{   System.out.println("Incorrect Pin . Try Again.");
		
		
		 System.out.println("Enter your pin:-");
		 Password = password.nextInt();
		 return ;
		}
	}

}
