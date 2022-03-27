package emp.action;

import java.util.List;
import java.util.Scanner;

//~action이 하는 일: 각 요청을 실질적으로 처리한다.
import emp.dto.EmpDTO;
import emp.service.EmpAddService;
import emp.service.EmpListService;
import emp.util.ConsoleUtil;

public class EmpListAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		
		//서비스객체 생성하고,호출해라
		
		EmpListService service = new EmpListService();
		List<EmpDTO> list=	service.getEmpList();
		
		ConsoleUtil util=new ConsoleUtil();
		util.printEmpList(list);

	}

}
