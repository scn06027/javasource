package emp.service;

import java.sql.Connection;

import emp.dao.EmpDAO;

import static emp.dao.JdbcUtil.*;
public class EmpModifyService {
	public boolean modifyEmp(int empno,int mgr) {
		
		boolean isModifySuccess=false;
		
		Connection con=getConnection();
		EmpDAO dao=new EmpDAO(con);
		
		boolean modifyResult=dao.update(empno, mgr);
		//궁극적으로 하고싶은게 바로 이거임
		
		if(modifyResult) {
		commit(con);
		isModifySuccess=true;
		
	}else {
		rollback(con);
	}
	return isModifySuccess;
	}
}
