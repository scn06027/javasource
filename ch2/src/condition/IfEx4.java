package condition;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//숫자 입력받고 짝수인지 홀수인지
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 하나 입력해주세요");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		
			
		}
	}

}
