package board.service;

import java.sql.Connection;

import board.dao.BoardDAO;

import static board.dao.JdbcUtil.*;
public class BoardDeleteService {
	public boolean delete(int bno,String password) {
		Connection con=getConnection();
		BoardDAO dao=new BoardDAO(con);
		boolean flag=dao.delete(bno, password);
		if(flag) {
			commit(con);
		}else {
			rollback(con);
		}
		
		return flag;
			
	}
}
