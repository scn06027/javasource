package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import lombok.AllArgsConstructor;
import member.dto.MemberDTO;
import static member.dao.JdbcUtil.*;
@AllArgsConstructor
public class MemberDAO {
	private Connection con;
	
	//C(회원 가입) R(로그인) U(비밀번호 변경) D(회원 탈퇴) 레 쮸 고
	
	//로그인 : 사용자가 입력한 아이디, 비밀번호가 존재합니까?
	//select userid,name from membertbl where userid='hong123' and password='hong123@';
	public MemberDTO islogin(String userid,String password) {
		MemberDTO loginDto=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select userid,name from membertbl where userid=? and password=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,userid);
			pstmt.setString(2,password);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				loginDto=new MemberDTO();
				loginDto.setUserid(rs.getString(1)); //rs.getString("userid")
				loginDto.setName(rs.getString(2)); //근데 왜 name값을 가져오는거임
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			
		}
		return loginDto;
	}
	
	//비밀번호값변경
	public boolean changePassword(String userid,String confirmPW) {
		boolean flag=false;
		PreparedStatement pstmt=null;
		String sql="update membertbl set password=? where userid=? ";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,confirmPW);
			pstmt.setString(2,userid);
			
			if(pstmt.executeUpdate()>0) {
				flag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return flag;
	}
	
	//회원탈퇴
	public boolean leave(String userid,String password) {
		boolean flag=false;
		PreparedStatement pstmt=null;
		String sql="delete from membertbl where userid=? and password=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,userid);
			pstmt.setString(2,password);
			int result=pstmt.executeUpdate();
			if(result>0) flag=true;	
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return flag;
	}
	
	//회원가입
	
	public boolean register(MemberDTO dto) {
		boolean flag=false;
		PreparedStatement pstmt=null;
		String sql="insert into membertbl values(?,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,dto.getUserid());
			pstmt.setString(2,dto.getPassword());
			pstmt.setString(3,dto.getName());
			pstmt.setString(4,dto.getGender());
			pstmt.setString(5,dto.getEmail());
			int result=pstmt.executeUpdate();
			if(result>0) flag=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return flag;
	}
	
	//중복 아이디 검사
	//select userid from membertbl where userid=?
	public boolean checkid(String userid) {
		boolean flag=true;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select userid from membertbl where userid=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,userid);
			rs=pstmt.executeQuery();
			if(rs.next()) flag=false;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		return flag;
	}
}
