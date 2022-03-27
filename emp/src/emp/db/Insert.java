package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="TIGER";
			con=DriverManager.getConnection(url, user, password);
			if(con!=null) {
				String sql="insert into exam_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) ";
				//맨 뒤에 공백 일부러 준거임 저거 빼먹으면 안됨 
				sql +="values(7290,'zoe','MANAGER',7201,'2016-02-21',1400,null,80)";
			pstmt=con.prepareStatement(sql);
			
			int result=pstmt.executeUpdate();
			
			if(result>0)
				System.out.println("삽입성공~!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
