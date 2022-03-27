package condition;

public class ForEx6 {

	public static void main(String[] args) {
		// 1~100 정수 중에서 3의 배수 더하기 (단 9의 배수는 빼기)
		//1~100 정수 중에서 3의 배수와 5의 배수의 총합을 구해보기
		
		int hap=0;
		
		for(int i=3; i<=100; i+=3) {
			if(i%9!=0)
				hap+=i;
			
		}
		System.out.println("9의 배수를 제외한 3의 배수의 합은 "+hap);
		hap=0;
		for(int i=1; i<=100; i++) {
			
			if(i%3==0||i%5==0) {
				hap+=i;
				
			}
		}
		System.out.println("3의 배수와 5의 배수의 합은 "+hap);
	
	}

}
