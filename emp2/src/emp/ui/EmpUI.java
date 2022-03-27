package emp.ui;

import java.util.Scanner;

import emp.action.Action;
import emp.action.EmpAddAction;
import emp.action.EmpListAction;
import emp.action.EmpModifyAction;
import emp.action.EmpRemoveAction;
import emp.action.EmpRowAction;
import emp.controller.EmpController;


public class EmpUI {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		EmpController empController=new EmpController();
		
		while(flag) {
			System.out.println("===============================");
		
			System.out.println("1.Emp 전체 조회");
			System.out.println("2. 사원 조회");
			System.out.println("3. 사원 정보 수정");
			System.out.println("4. 사원 탈퇴");
			System.out.println("5. 사원 추가");
			System.out.println("6. 프로그램 종료");
			System.out.println("===============================");
			System.out.println();
			
			System.out.print("메뉴 선택>> ");
			int no=Integer.parseInt(sc.nextLine());
			
			Action action=null;
			
			switch (no) {
			case 1: 
				action=new EmpListAction();
				break;
			case 2:
				action=new EmpRowAction();
				break;
			case 3:
				action=new EmpModifyAction();
				break;
			case 4:
				action=new EmpRemoveAction();
				break;
			case 5:
				action=new EmpAddAction();
				
				break;
			case 6:
				System.out.println("시스템 종료오");
				flag=false;
				break;
				
			default:
				break;
			}
			
			if(action!=null) {
				empController.processRequest(action, sc);
			}
			
		}
	}

}
