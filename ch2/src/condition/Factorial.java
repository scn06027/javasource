package condition;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// 숫자 입력받고 그 숫자의 팩토리얼 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 하나 입력해주세요.");
		int num = sc.nextInt();
		int fac=1;
		
		
		for(int i=num; i>0; i--) {
			fac*=i;
		}
		System.out.println("factorial 값은 "+fac);
sc.close();
	}

}
