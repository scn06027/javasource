package board.service;

import java.sql.Connection;
import static board.dao.JdbcUtil.*;

import board.dao.BoardDAO;
import board.dto.BoardDTO;
//service의 목적: db작업하고 리턴하는거임
public class BoardViewService {
	public BoardDTO View(int bno) {
		Connection con=getConnection();
		BoardDAO dao=new BoardDAO(con);
		
		BoardDTO viewDto=dao.bnoList(bno);
		close(con);
		return viewDto;

	}
}
