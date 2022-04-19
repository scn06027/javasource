package board.service;

import java.sql.Connection;
import java.util.List;
import static board.dao.JdbcUtil.*;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

public class BoardListService {
	public List<BoardDTO> list(){
		Connection con=getConnection();
		BoardDAO dao=new BoardDAO(con);
		
		List<BoardDTO> list= dao.qList();
		
		close(con);
		
		return list;
	}
}
