package op;

import java.util.Scanner;

public class Degrees {
public static void main(String[] args) {
	//화씨온도=> 섭씨온도
	//float라는 점 잊지 말기~!
	Scanner sc=new Scanner(System.in);
	
	System.out.println("화씨 온도를 입력하세요.");

	int h=sc.nextInt();
	
	double cel=(h-32)*5/9.0;
	//format을 지정하겠습니다.. %f(실수),%d(정수),%c(문자 - '  '),%s(문자열 - "  " )
	System.out.printf("입력한 화씨 온도를 섭씨 온도로 변경하면? %.3f",cel);
System.out.println("프로그램 종료");
	sc.close();
}
}
