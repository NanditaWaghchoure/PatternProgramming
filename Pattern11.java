package assignmentpattern;

public class Pattern11 {

	public static void main(String[] args) {
		int n=5;
		int ch=65;
		//char chh=(char)(ch++);
		
		
		
		for(int i=1;i<=n;i++) {
			int cnt=(char)ch;
			
			
			for(int j=1;j<=(n-i)+1;j++) {
				System.out.print((char)(cnt++));
			}
			
			
		
			
			System.out.println();
			int chh=(char)cnt+1;
			System.out.print(chh);
			

		}
		
		 

	}

}
