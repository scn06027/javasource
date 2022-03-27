package member.ui;

import java.util.Scanner;

import member.action.Action;
import member.action.MemberAddAction;
import member.action.MemberListAction;
import member.action.MemberModifyAction;
import member.action.MemberRemoveAction;
import member.controller.MemberController;

public class MemberMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean isStop=false;
		MemberController controller = new  MemberController();
		do {
			System.out.println("==== 회원 관리 프로그램====");
			System.out.println("1. 회원등록");
			System.out.println("2. 회원목록보기");
			System.out.println("3. 회원정보수정");
			System.out.println("4. 회원정보삭제");
			System.out.println("5. 프로그램종료");
			System.out.println();
			
			System.out.print("메뉴번호 >>> ");
			int menu=Integer.parseInt(sc.nextLine());
			
			Action action=null;
			
			
			switch (menu) {
			case 1:
				action=new MemberAddAction();
				
				break;
			case 2:
				action=new MemberListAction();
				break;
			case 3:
				action=new MemberModifyAction();
				break;
			case 4:
				action=new MemberRemoveAction();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				isStop=true;
				break;
			default:
				System.out.println("");
				break;
			}
			
			//번호 잘못입력하면 액션이 null로 넘어가서
			//null point exception뜨니까 밑밥 깔아준거임ㅇㅇ 
			if(action!=null)
				controller.processRequest(action, sc);
			
		}while(!isStop);
	}

}
