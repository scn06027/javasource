package op;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		//키보드(System.in)에서 입력을 받고 싶을 때
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요."); //사용자에게 무엇을 입력해야 될지를 알려준 것.
		int num=sc.nextInt(); //사용자에게 숫자를 입력받는 부분(문자 입력하면 Exception 발생.)
		
		System.out.println("입력한 숫자는 "+num);
		sc.close();
	}

}
