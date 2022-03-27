package condition;

import java.util.Scanner;

public class PayOfHours {

	public static void main(String[] args) {
		//사용자로부터 근무시간을 입력받기
		//근무시간 중 8시간까지는 시간당 9800원 지급
		//8시간을 초과하는 근무시간은 시간당 급여의 1.5배를 추가지급하는 프로그램 작성
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("근무 시간을 입력해주세요");
		int sal=sc.nextInt();
		
if(sal<=8) {
	System.out.println("급여는 "+sal*9800+" 원 입니다.");
}else {
	System.out.println("급여는 "+(int)(8*9800+(sal-8)*9800*1.5)+" 원 입니다.");
}





sc.close();
	}

}
