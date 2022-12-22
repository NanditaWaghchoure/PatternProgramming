package assignmentpattern;

public class Pattern7 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5;j++) {
				if(i<=j) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}

}

/*
11111
01111
00111
00011
00001
 
 */
