package member.service;
import static member.dao.JdbcUtil.*;

import java.sql.Connection;

import member.dao.MemberDAO;
import member.dto.MemberDTO;
public class MemberJoinService {
	public boolean join(MemberDTO memberDto) {
		Connection con=getConnection();
		MemberDAO dao=new MemberDAO(con);
		boolean result=dao.register(memberDto);
		
		if(result) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return result;
		
	}
}
