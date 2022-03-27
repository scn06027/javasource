package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	public static void main(String[] args) {
		//db서버랑 연결~!
		
		
		try {
			//드라이버 로드 oracle.jdb.driver.OracleDriver <-내가 기억하고있던 모양은 이거다아아아
			Class.forName("oracle.jdbc.OracleDriver");//이걸로오라클디비들어갈거야
			//데이터베이스연결을 위한 문자열 생성
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="TIGER";
			
			//드라이버매니저를통해 연결시도
			Connection con=DriverManager.getConnection(url, user, password);
			
			if(con!=null) {
				System.out.println("연결성공~!");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
