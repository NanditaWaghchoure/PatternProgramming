package assignmentpattern;

public class Pattern2 {

	public static void main(String[] args) {
     int n=5;
     for(int i=1;i<=n;i++) {
    	 for(int j=1;j<=n;j++) {
    		 
    		 if(j<=i) {
    		 System.out.print(j);
    		 }
    		 else {
    			 System.out.print("1");
    		 }
    			
    		 
    	 }
    	 System.out.println();
     }

	}

}
/*
11111
12111
12311
12341
12345
*/