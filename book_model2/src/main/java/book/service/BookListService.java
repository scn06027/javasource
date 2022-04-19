package book.service;

import java.sql.Connection;
import java.util.List;

import book.dao.bookDAO;
import book.dto.bookDTO;

import static book.dao.JdbcUtil.*;
public class BookListService {
	public List<bookDTO> listAll(){
		Connection con=getConnection();
		bookDAO dao=new bookDAO(con);
		
		List<bookDTO> list=dao.getList();
		
		close(con);
		
		return list;
	}
}
