package member.service;

import java.sql.Connection;

import member.dao.JdbcUtil;
import member.dao.MemberDAO;
import member.dto.MemberDTO;

public class MemberAddService {
	
	public boolean insertMember(MemberDTO insertDto) {
		boolean isAddSuccess=false;
		
		
		//비지니스로직을 처리하는게 목표 ->테이블에 member 처리하기!
		Connection con=JdbcUtil.getConnection(); //static 안쓰고 일케 걍 불러도 됨
		MemberDAO dao=new MemberDAO(con);
		
		
		
		if(dao.insert(insertDto)) {
			isAddSuccess=true;
			JdbcUtil.commit(con);
		}else
			JdbcUtil.rollback(con);
		JdbcUtil.close(con);
		//비즈니스 로직 결과를 리턴해준다. 잘 됐는지 안됐는지!..
		return isAddSuccess;
	}
}
