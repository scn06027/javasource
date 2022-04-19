package board.service;

import java.sql.Connection;

import board.dao.BoardDAO;
import board.dto.BoardDTO;
import static board.dao.JdbcUtil.*;
public class BoardModifyService {
public boolean update(BoardDTO dto) {
	Connection con=getConnection();
	BoardDAO dao=new BoardDAO(con);
	boolean flag=dao.Update(dto);
	if(flag) {
		commit(con);
	}else {
		rollback(con);
	}
	close(con);
	
	return flag;
}
}
