package op;

import java.util.Scanner;

public class ConditionalEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자를 입력받고, 그 숫자가 양수인지 음수인지 출력하는 프로그램
		Scanner sc= new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();
		System.out.println(num>0?"양수입니다.":num==0?"값이 0입니다.":"음수입니다.");
		sc.close();
	}

}
