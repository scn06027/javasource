package book.service;

import java.sql.Connection;

import book.dao.bookDAO;
import book.dto.bookDTO;
import static book.dao.JdbcUtil.*;
public class BookInsertService {
	public boolean insertBook(bookDTO insertDto) {
		//서비스에선 db작업 해줘야됨
		Connection con=getConnection();
		bookDAO dao=new bookDAO(con);
		boolean flag=dao.insert(insertDto);
		
		if(flag) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		
		return flag;
	}
}
