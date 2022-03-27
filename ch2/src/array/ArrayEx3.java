package array;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//score 배열명으로 5개의 int값을 담는 배열 생성
		
		//0,10,20,30,40
		int score[]= {0,10,20,30,40};
		
		int score2[] = new int[5];
		
		for (int i = 0; i < score2.length; i++) {
			score2[i]=i*10; //값 입력
		}
		
		
		for (int i = 0; i < score2.length; i++) {
			System.out.println(score[i]); //값 출력
		}
		
		
		int score3[]= {45,78,25,65,36,79};
		int sum=0;
		for (int i = 0; i < score3.length; i++) {
			sum+=score3[i];
		}
		System.out.println("평균은 "+sum/(score3.length));
	}

}
