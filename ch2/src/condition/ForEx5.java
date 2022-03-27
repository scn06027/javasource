package condition;

public class ForEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단 만들어 보기
		
		
		for(int i=1; i<=10;i++) {
		System.out.print("2×"+i+"="+i*2+" ");	
		}
		
		for (int i = 1; i<=9; i++) {
			for (int j = 1; j<=9; j++) {
				System.out.print(i+"×"+j+"="+i*j+"  ");
			}
			System.out.println();
		}
	}

}
