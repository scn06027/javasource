package member.service;

import java.sql.Connection;
import java.util.List;

import member.dao.JdbcUtil;
import member.dao.MemberDAO;
import member.dto.MemberDTO;

public class MemberListService {
	//비즈니스로직호출
	public List<MemberDTO> list(){
		Connection con=JdbcUtil.getConnection(); //static 안쓰고 일케 걍 불러도 됨
		MemberDAO dao=new MemberDAO(con);
		
			//비즈니스 로직이 셀렉트면 commit,rollback 둘다 안함
		List<MemberDTO> memberList=dao.getList();
		JdbcUtil.close(con);
		
		return memberList;
	}
	
	
	
}
