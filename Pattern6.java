package assignmentpattern;

public class Pattern6 {

	public static void main(String[] args) {
	   int n=6;
	   for(int i=1;i<n;i++) {
		   for(int j=1;j<=n;j++) {
			   
			   if(i%2!=0 && j%2==0 || i%2==0 && j%2!=0) {
				   System.out.print("0");
				   
				   
			   }
			   else
				 
				   
				    {
				  
				   
				   System.out.print("1");
				   
				   
			   }
		   }
		   System.out.println();
	   }

	}

}

/*
101010
010101
101010
010101
101010 
 */
