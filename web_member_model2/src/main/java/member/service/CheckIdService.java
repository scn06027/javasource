package member.service;
import static member.dao.JdbcUtil.*;

import java.sql.Connection;

import member.dao.MemberDAO;
public class CheckIdService {
	public boolean dupId(String userid) {
		
		Connection con=getConnection();
		MemberDAO dao=new MemberDAO(con);
		
		boolean result=dao.checkid(userid);
		
		if(result) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return result;
		
		
	}
}
