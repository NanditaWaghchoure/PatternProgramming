package assignmentpattern;

public class Pattern9 {

	public static void main(String[] args) {
		int n=5;
		
		
		for(int i=1;i<=n;i++) {
			for(int k=0;k<=(n-1)-i;k++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				
			}
			System.out.println();
			
		}
			
		}

	}
/*
 
    1
   12
  123
 1234
12345

 */


