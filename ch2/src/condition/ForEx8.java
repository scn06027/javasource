package condition;

public class ForEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i<=5; i++) {
			for(int j=1; j<=i;j++)
				System.out.print("*");
			System.out.println();
			
		}
		
		
		
		for(int i=1;i<=5; i++) {
			
			for(int t=5;t>i;t--) 
				System.out.print(" ");
			
			
			for(int j=1;j<=i;j++) 
				System.out.print("*");
			
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=5;j>=1;j--) {
				System.out.print(j<=i?"*":" ");
			}
			System.out.println();
		}
		
		/*
for(int i=1;i<=5; i++) {
			
			for(int t=5;t>i;t--) 
				System.out.print("*");
			
			
			for(int j=1;j<=i;j++) 
				System.out.print(" ");
			
			System.out.println();
		}
		
		*/
	
		
	}
	
	
}
