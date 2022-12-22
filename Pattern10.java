package assignmentpattern;

public class Pattern10 {

	public static void main(String[] args) {
		int n=1;
		for(int i=5;i>=1;i--) {
			for(int k=5;k>=(n-i)+1;k--) {
				System.out.print(" ");
			}
			
			for(int j=5;j>=i;j--) {
			System.out.print(n+j-i);
			}
			System.out.println();
		}
	
		
		
	}

	
	}



