package member.action;

import java.util.Scanner;

import member.service.MemberModifyService;
import member.util.ConsoleUtil;

public class MemberModifyAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		//주소, 이메일 수정 하게 만들고 싶다.
	
		
		ConsoleUtil util=new ConsoleUtil();
		//아이디 입력받음
		int id=util.pirntModifyIdMessage(sc);
		
		//어떤 부분을 수정할건지 사용자한테 물어봄 .질문화면 제시
		int no=util.printModifyMessage(sc); //1(주소) 2(이메일)
		//변경할 값에 대해서 사용자에게 입력받는 화면 제시
		String input=util.pirntModifyValueMessage(sc);
		
		
		//서비스 작업 요청
		MemberModifyService service=new MemberModifyService();
		
		
		//잘 됐는지 안됐는지 결과 판단.
		boolean result=service.update(no, input, id);
		
		if(result) {
			util.printModifySuccessMessage();
		}else {
			util.printModifyFailMessage();
		}
	}

}
