
public class pattern {

	public static void main(String[] args) {
	
		int x = 0,y = 2;
		
        while(y > 0){
        	
        if(x == 0){
        	
            for(int i=1;i<=5;i++)
       {
               for(int j=1;j<=i;j++)
            	
       {
            System.out.print(j);
          }
            System.out.println();
          }
            
            x++ ;
       } 
        
        else{
            
        	for(int i=1,r=5-1;i<=5-1;i++,r--)
            {
            for(int j=1;j<=r;j++)
            {
            System.out.print(j);            
            }
            System.out.println();
        }
    }
        y--;
        }
	
	}
	
}
