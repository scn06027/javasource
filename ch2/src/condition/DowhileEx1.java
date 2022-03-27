package condition;

import java.util.Scanner;

public class DowhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//1~100사이의 임의의 숫자 맞추기
		
		int answer=(int)(Math.random()*100)+1;
		Scanner sc= new Scanner(System.in);
		
	int input=0;
			System.out.println("1에서 100 사이의 숫자를 입력해주세요.");
		do {
		
			input=sc.nextInt();
			
			if(answer<input) {
				System.out.println("더 작은 수를 입력하세요");
			}else if(answer>input){
				System.out.println("더 큰 수를 입력하세요");
			}else {
				System.out.println("정답! 프로그램을 종료합니다.");
			}
			
		}while(input!=answer);
		
		

	}

}
