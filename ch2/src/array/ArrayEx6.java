package array;
import java.util.Arrays;

public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10명의 점수를 배열로 생성하고 최댓값, 최솟값 출력
		int score[]= {79,88,91,33,100,55,95,45,48,82};
		
		int max=score[0],min=score[0];
		
		for (int i = 1; i < score.length; i++) {
				if(max<score[i])
					max=score[i];
				if(min>score[i])
					min=score[i];
			
		}
		
		System.out.printf("최댓값은 %d, 최솟값은 %d",max,min);
		
		
	}

}
