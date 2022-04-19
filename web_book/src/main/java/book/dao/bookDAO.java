package book.dao;
import static book.dao.JdbcUtil.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import book.dto.bookDTO;

public class bookDAO {
	private Connection con;

	public bookDAO(Connection con) {
		super();
		this.con = con;
	}
	
	//CRUD
	
	public boolean insert(bookDTO dto) {
		boolean flag=false;
		PreparedStatement pstmt=null;
		String sql="insert into bookTBL values(?,?,?,?)";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, dto.getCode());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getWriter());
			pstmt.setInt(4, dto.getPrice());
			int result=pstmt.executeUpdate();
			
			if(result>0) flag=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return flag;
	}
	
	//전체 조회하는 뭐시기
	public List<bookDTO> getList() {
		List<bookDTO> list=new ArrayList<>();
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select * from bookTBL";
		
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				bookDTO dto=new bookDTO();
				dto.setCode(rs.getInt("code"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setPrice(rs.getInt("price"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		
		return list;
	}
	
	//delete code가 일치하면 삭제
	public boolean delete(int code) {
		boolean flag=false;
		PreparedStatement pstmt=null;
		String sql="delete from bookTBL where code=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,code);
			int result=pstmt.executeUpdate();
			if(result>0) flag=true;	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return flag;
	}
	
	public boolean update(int code,int price) {
		boolean flag=false;
		PreparedStatement pstmt=null;
		String sql="update bookTBL set price=? where code=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, price);
			pstmt.setInt(2, code);
			if(pstmt.executeUpdate()>0)
				flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return flag;
	}
	
	//검색
	//select * from bookTBL where code=1001
	//select * from bookTBL where writer like '%병모%'
	
	public List<bookDTO> search(String cri,String keyword) {
		List<bookDTO> list=new ArrayList<>();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="";
		
		
		try {
			
			if(cri.equals("code")) {
			sql="select * from bookTBL where code=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(keyword));
		}else {
			sql="select * from bookTBL where writer like ? ";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, "%"+keyword+"%");
		}
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				bookDTO dto=new bookDTO();
				dto.setCode(rs.getInt("code"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setPrice(rs.getInt("price"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		
		return list;
	}
	
	
}
