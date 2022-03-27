package emp.service;

import java.sql.Connection;
import static emp.dao.JdbcUtil.*;
import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

public class EmpRowService {
public EmpDTO getRow(String job) {
	Connection con=getConnection();
	EmpDAO dao=new EmpDAO(con);
	EmpDTO dto=dao.getRow(job);
	
	close(con);
	
	return dto;
}

}
