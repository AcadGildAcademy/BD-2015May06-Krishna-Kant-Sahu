
public class PrimeNumber {

	public static void main(String[] args) {
		
		int x ;
		
		System.out.println("Prime numbers between 1 to 100 is :- " );
       
          for(int i = 1; i < 100; i++)
          {
            x = 1;
                
          for(int j=2; j < i ; j++)
          {
                       
           if(i % j == 0)
          {
             x = 0 ;
           break;
           }
           }
                
           if(x==1){
        	   
                System.out.println(i + " ");
           }
         }
		}
		
	}
	


