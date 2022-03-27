package member.action;

import java.util.Scanner;

import member.dto.MemberDTO;
import member.service.MemberAddService;
import member.util.ConsoleUtil;

public class MemberAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		// 사용자에게 입력화면을 제시해주고
		ConsoleUtil util=new ConsoleUtil();
		
		//입력값을 받아서 서비스한테 전송해준다
		MemberDTO insertDto= util.getNewMember(sc);
		MemberAddService service=new MemberAddService();
		boolean result=service.insertMember(insertDto);
		
		// 서비스의 처리 결과를 화면으로 제시해준다
		
		if(result) {
			util.printAddSuccessMessage(insertDto);
		}else {
			util.printAddFailMessage(insertDto);
		}

	}

}
