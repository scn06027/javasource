package api;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenEx3 {

	public static void main(String[] args) {
		// 사용자로부터 문자열을 입력받아 공백으로 분리된 어절이 몇개인가 출력
		
		//오늘은 화요일 입니다. = >3
		// exit 문자를 입력하면 반복문 종료
		
		Scanner sc= new Scanner(System.in);
		
		do{
			System.out.print("아무말이나 입력해보세요");
			String input=sc.nextLine();
		
		if(input.equals("exit")) {
			System.out.println("반복문 종료.");
			break;
		}else {
			StringTokenizer st= new StringTokenizer(input," ");
			System.out.print("  => "+st.countTokens()+"\n");
		}
		}while(true);
		
		

	}

}
