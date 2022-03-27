package emp.service;

import java.sql.Connection;
import java.util.List;

import emp.dao.EmpDAO;
import emp.dto.EmpDTO;
import static emp.dao.JdbcUtil.*;
//~service :실질적인 비즈니스 로직을 처리한다.ㅏ??

public class EmpListService {
	public List<EmpDTO> getEmpList(){
		Connection con=getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		List<EmpDTO> list=dao.getList();
					//얘 호출하려면 dao 객체 생성해야 부를수있음 ..근데 또 dao는 con을 호출해야 부를수있음
		
		close(con);
		
		//걍 조회하기만 하는거니까아~!
		
		return list;
	}
}
