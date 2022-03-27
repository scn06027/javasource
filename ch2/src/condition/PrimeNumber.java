package condition;



public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100까지의 숫자 중에서 소수 구하기
		//1과 자기 자신으로만 나누어지는 수..가 소수입니다
		System.out.println("1~100의 숫자 중 소수는 ");
	int cnt=0;
		for (int i = 2; i <101; i++) {
			
			for (int j = 1; j <=i; j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt==2)
				System.out.print(i+" ");
				cnt=0;
			
		}
		
		System.out.println("입니다.");
		
	}

}
