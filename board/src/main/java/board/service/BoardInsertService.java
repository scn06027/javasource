package board.service;

import java.sql.Connection;
import static board.dao.JdbcUtil.*;
import board.dao.BoardDAO;
import board.dto.BoardDTO;

public class BoardInsertService {
	public boolean insert(BoardDTO dto) {
		Connection con=getConnection();
		BoardDAO dao=new BoardDAO(con);
		boolean flag=dao.insertArticle(dto);
		if(flag) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		
		return flag;
	}
}
