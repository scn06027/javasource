package emp.service;

import java.sql.Connection;

import emp.dao.EmpDAO;

import static emp.dao.JdbcUtil.*;
public class EmpRemoveService {

	public boolean empRemove(int empno) {
		boolean isRemoveSuccess=false;
		Connection con=getConnection();
		EmpDAO dao=new EmpDAO(con);
		
		boolean removeResult=dao.delete(empno);
		//비지니스 로직
		if(removeResult) {
			commit(con);
			isRemoveSuccess=true;
		}else {
			rollback(con);
		}
		return isRemoveSuccess;
	}
}
