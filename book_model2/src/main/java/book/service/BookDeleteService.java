package book.service;
import static book.dao.JdbcUtil.*;

import java.sql.Connection;

import book.dao.bookDAO;
public class BookDeleteService {
	public boolean delete(int code) {
		//db작업
		Connection con=getConnection();
		bookDAO dao=new bookDAO(con);
		boolean result=dao.delete(code);
		
		if(result) {
			commit(con);
		}else {
			rollback(con);
		}
		
		close(con);
		return result;
	}
}
