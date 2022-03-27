package emp.db2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

public class EmpDAO {

	private Connection con;
	private PreparedStatement pstmt;//값전송할때
	private ResultSet rs; //결과받아올때

	public Connection getConnection() {
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="TIGER";
			
			con=DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	//전체조회하기
	public List<EmpDTO> getList() {
		
		List<EmpDTO> list=new ArrayList<EmpDTO>();
		String sql="select * from exam_emp";
		try {
			
			con=getConnection();
			pstmt=con.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			//rs에 담긴 sql 실행결과를 list에 담아서 리턴해보자
			while(rs.next()) {
				//첫번째 행의 각 컬럼들을 가져와서 EmpDTO 객체로 만들어줌..
				
				int empno=rs.getInt("empno");
				int sal=rs.getInt("sal");
				int comm=rs.getInt("comm");
				int mgr=rs.getInt("mgr");
				int deptno=rs.getInt("deptno");
				String ename=rs.getString("ename");
				String job=rs.getString("job");
				Date hiredate=rs.getDate("hiredate");
				EmpDTO dto= new EmpDTO(ename, job, empno, mgr, sal, comm, deptno, hiredate);
				
				list.add(dto); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
		
	}
	
	//사원조회하고시픔
	
	public EmpDTO getRow(int empno) {
		EmpDTO dto =null;
		
		String sql="select empno,ename,job,hiredate,deptno from exam_emp where empno=?";
		
		
		//? 이게 뭔데?
		try {
			
			
			con=getConnection();
			pstmt=con.prepareStatement(sql);
			//? 이게 뭔데?
			
			pstmt.setInt(1, empno); //첫번째 물음표에 empno를 넣을거란다
			rs=pstmt.executeQuery();
			
			if(rs.next()) {

				/*
				empno=rs.getInt("empno");
				String job=rs.getString("job");
				String ename=rs.getString("ename");
				Date hiredate=rs.getDate("hiredate");
				int deptno=rs.getInt("deptno");
				dto= new EmpDTO(ename, job, empno, deptno, hiredate);
				*/
				
				
				
				dto=new EmpDTO();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setEname(rs.getString("ename"));
				dto.setEmpno(rs.getInt("empno"));
				dto.setJob(rs.getString("job"));
				
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		return dto;
	}
	
	
	//정보수정 (update)
	
	public boolean update(int empno,int mgr) {
		EmpDTO dto =null;
		String sql="update exam_emp set mgr=? where empno=?";
		
		
		try {
			con =getConnection();
			pstmt=con.prepareStatement(sql);
			
			pstmt.setInt(1,mgr);
			pstmt.setInt(2, empno);
			int result= pstmt.executeUpdate();
			
			
			if(result>0) {
				return true;
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
		
		return false;
	}
	
	//삭제
	
	public boolean delete(int empno) {
		String sql="delete from exam_emp where empno=?";
		try {
			con=getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			int result=pstmt.executeUpdate();
			
			if(result>0) {
				
				return true;
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
		
		return false;
	}
	
	//사원추가아
	/*public boolean insert(int empno,String ename,String job,int mgr,int sal,int comm,int deptno) {
		String sql="insert into exam_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno)";
		sql+="values(?,?,?,?,sysdate,?,?,?)";
		
		try {
			
			con=getConnection();
			pstmt= con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			pstmt.setString(2, ename);
			pstmt.setString(3, job);
			pstmt.setInt(4, mgr);
			pstmt.setInt(5, sal);
			pstmt.setInt(6, comm);
			pstmt.setInt(7, deptno);
			
			int result=pstmt.executeUpdate();
			
			if(result>0) {
				return true;
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
		return false;
		
		}*/
	
	
	public boolean insert(EmpDTO insertDto) {
		String sql="insert into exam_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno)";
		sql+="values(?,?,?,?,sysdate,?,?,?)";
		
		try {
			
			con=getConnection();
			pstmt= con.prepareStatement(sql);
			pstmt.setInt(1, insertDto.getEmpno());
			pstmt.setString(2, insertDto.getEname());
			pstmt.setString(3, insertDto.getJob());
			pstmt.setInt(4, insertDto.getMgr());
			pstmt.setInt(5, insertDto.getSal());
			pstmt.setInt(6, insertDto.getComm());
			pstmt.setInt(7, insertDto.getDeptno());
			
			int result=pstmt.executeUpdate();
			
			if(result>0) {
				return true;
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
		return false;
		
		}
	

	
}
