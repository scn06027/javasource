package condition;

import java.util.Scanner;

public class DowhileEx2 {

	public static void main(String[] args) {
		// q가 입력되기 전까지 문자를 입력받기
		Scanner sc= new Scanner(System.in);
		System.out.println("메세지를 입력해주세요.");
		System.out.println("종료를 원하시면 q를 입력해주세요. ");
		
		String msg="";
		
		do {
			System.out.println(">>");
			
			msg=sc.nextLine();
			System.out.println(msg);
		}while(!msg.equals("q"));
		
		System.out.println("시스템 종료");
	}

}
