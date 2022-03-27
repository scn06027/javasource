package condition;

public class ContinueEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0~10까지의 숫자 중에서 짝수만 출력 (continue 사용)
		for(int i=0; i<=10; i++) {
			if(i%2!=0) {
				continue; // 홀수면 출력문 실행이 안됨
			}
			System.out.print(i+" ");
		}
		System.out.println();
		int sum=0;
		for(int i=1; i<101; i++) {
			if(i%2==0) {
				continue;
				 // 홀수면 출력문 실행이 안됨
			}
			sum=sum+i;
		}
		
		
		System.out.println("홀수의 합은 "+sum);
	}

}
