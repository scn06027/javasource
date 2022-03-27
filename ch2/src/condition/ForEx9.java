package condition;

public class ForEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("구구단을 외자");
		for (int i = 2; i <10; i++) {
			for (int j = 1; j <10; j++) {
				
				System.out.printf("%d×%d=%d\t",i,j,i*j);
				
			}
			System.out.println();
		}
	}

}
