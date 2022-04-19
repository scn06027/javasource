package member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//여러개인 DAO 파일에서 중복되는 부분을 처리해준다

public class JdbcUtil {
	//static 으로 선언된거임?..
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
public static Connection getConnection() {
		Connection con=null;
		
		try {
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="javadb";
			String password="12345";
			
			con=DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}

public static void close(Connection con) {
	try {
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void close(PreparedStatement pstmt) {
	try {
		pstmt.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
}

public static void commit(Connection con) {
	try {
		con.commit();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public static void rollback(Connection con) {
	try {
		con.rollback();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
