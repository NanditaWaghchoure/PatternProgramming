package assignmentpattern;

public class Patter1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			
			
			for(int j=1;j<=n;j++) {
				
				if(j==i) {
				System.out.print(j);  //sop(i);
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
11311
11141
11115
 */
