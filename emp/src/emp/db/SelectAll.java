package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectAll {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="TIGER";
			
			con=DriverManager.getConnection(url, user, password);
			
			if(con!=null) {
				String sql="select * from exam_emp";
				
				pstmt=con.prepareStatement(sql);
				rs=pstmt.executeQuery();
				while(rs.next()) {
					//컬럼하나씩가져오기.
					int empno=rs.getInt(1); //empno
					String ename=rs.getString(2);
					String job=rs.getString(3);
					int mgr=rs.getInt(4);
					String hiredate=rs.getString(5);
					int comm=rs.getInt(7);
					int deptno=rs.getInt(8);
					
					//이건 바로 된거임?..커밋이된거임?
					System.out.printf("%d %s %s %d %s %d %d \n",empno,ename,job,mgr,hiredate,comm,deptno);
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
