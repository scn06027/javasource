package book.service;
import static book.dao.JdbcUtil.*;

import java.sql.Connection;
import java.util.List;

import book.dao.bookDAO;
import book.dto.bookDTO;
public class BookSearchService {
	public List<bookDTO> list(String criteria,String keyword){
		Connection con= getConnection();
		bookDAO dao=new bookDAO(con);
		List<bookDTO> list=dao.search(criteria, keyword);
		
		close(con);
		return list;
	}
}
