package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

	
	public static void main(String[] args) {
		//1. db서버랑 연결해야됨
		Connection con=null;
		PreparedStatement pstmt=null;//select 쿼리문 결과 담을때 쓰임
		ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="TIGER";
			
			con=DriverManager.getConnection(url, user, password);

			if(con!=null) {
				String sql="select * from emp where empno=7521";
					//이게 실제로 쿼리문 실행하는 구문임
				//그리고 그걸 rs에다 받음
				
				//rs에 담긴걸 화면에다 출력하기만 하면 됨
				if(rs.next()) { //ResultSet 결과가 담겨 있는지 확인
						//컬럼을 하나씩 가져온다
					int empno=rs.getInt("empno");
					String ename=rs.getString("ename");
					String job=rs.getString("job");
					int mgr=rs.getInt("mgr");
					String hiredate=rs.getString("hiredate");
					int sal= rs.getInt("sal");
					int comm=rs.getInt("comm");
					int deptno=rs.getInt("deptno");
					
					System.out.printf("%d %s %s %d %s %d %d %d",empno,ename,job,mgr,hiredate,sal,comm,deptno);
				}
				
				
				
			}
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
