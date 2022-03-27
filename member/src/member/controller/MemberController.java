package member.controller;

import java.util.Scanner;

import member.action.Action;

public class MemberController {

	public void processRequest(Action action,Scanner sc) {
		
		
		//사용자의 요청을 처리하는 액션 클래스의 메소드를 호출한다..
		try {
			action.execute(sc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
