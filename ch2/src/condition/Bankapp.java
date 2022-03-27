package condition;

import java.util.Scanner;

public class Bankapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			boolean run=true;
			int balance=0; //잔고
			int memu=0;
		
		while(run) {
			
			System.out.println("-------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-------------------------");
			System.out.print("선택>");
			int menu=sc.nextInt();
			
			switch(menu) {
			case 1:
				//예금액 입력받고 잔고에 추가하기
				System.out.print("예금액을 입력해주세요.");
				balance+=sc.nextInt();
				break;
			case 2:
				System.out.print("출금액을 입력해주세요.");
				balance-=sc.nextInt();
				break;
			case 3:
				System.out.println("현재 가지고 있는 잔고는 "+balance+"원입니다.");
				break;
			case 4:
				run=false;
				break;
			default:
				break;
			
			}
		}
		
		
		
	}
}
