package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static board.dao.JdbcUtil.*;
import board.dto.BoardDTO;

public class BoardDAO {
	private Connection con;

	public BoardDAO(Connection con) {
		super();
		this.con = con;
	}
	
	//CRUD
	//게시글 삽입, 삭제,수정(게시글 수정, 조회수 수정),조회, 전체조회,
	public boolean insertArticle(BoardDTO insertDto) {
		
		String sql="insert into board(bno,name,password,title,content,attach,re_ref,re_lev,re_seq) "
				+ "values(board_seq.nextval,?,?,?,?,?,board_seq.currval,?,?)";
		PreparedStatement pstmt=null;
		boolean flag=false;
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, insertDto.getName());
			pstmt.setString(2, insertDto.getPassword());
			pstmt.setString(3, insertDto.getTitle());
			pstmt.setString(4, insertDto.getContent());
			pstmt.setString(5, insertDto.getAttach());
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 0);
			
			if(pstmt.executeUpdate()>0) flag=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
	return flag;
	}
	
	public List<BoardDTO> qList(){
		List<BoardDTO> list=new ArrayList<>();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		// select bno,name,title,regdate,readcount from BOARD;, 
		// Error Msg = ORA-00911: invalid character

		String sql="select bno,name,title,regdate,readcount from BOARD order by bno desc";		
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDTO dto= new BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setName(rs.getString("name"));
				dto.setTitle(rs.getString("title"));
				dto.setRegdate(rs.getDate("regdate"));
				dto.setReadcount(rs.getInt("readcount"));
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
		//bno는 꼭 갖고다녀야됨ㅇㅇ..pk라서 그런거임 안써도 갖고나오셈
		public BoardDTO bnoList(int bno) {
			BoardDTO dto=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			String sql="select bno,name,title,content,attach from board where bno=?";
			try {
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1, bno);
				rs=pstmt.executeQuery();
				
				if(rs.next()) {
				dto=new BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setName(rs.getString("name"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setAttach(rs.getString("attach"));
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				close(rs);
				close(pstmt);
			}
			return dto;
		}
		
		
		public boolean hitUpdate(int bno) {
			PreparedStatement pstmt=null;
			String sql="update board set readcount=readcount+1 where bno=?";
			boolean flag=false;
			try {
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1, bno);
				int result=pstmt.executeUpdate();
				if(result>0) flag=true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				close(pstmt);
			}
			return flag;
		}
		public boolean delete(int bno,String password) {
			boolean flag=false;
			PreparedStatement pstmt=null;
			String sql="delete from board where bno=? and password=?";
			try {
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1, bno);
				pstmt.setString(2, password);
				if(pstmt.executeUpdate()>0) flag=true;
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				close(pstmt);
			}
			return flag;
		}
		//게시물 수정
		public boolean Update(BoardDTO dto) {
			boolean flag=false;
			PreparedStatement pstmt=null;
			String sql="";
			try {
				if(dto.getAttach()==null) {
					sql="update board set title=?,content=? where bno=? and password=?";
					pstmt=con.prepareStatement(sql);
					pstmt.setString(1, dto.getTitle());
					pstmt.setString(2, dto.getContent());
					pstmt.setInt(3, dto.getBno());
					pstmt.setString(4, dto.getPassword());
					
					
				}else {
					sql="update board set title=?,content=?,attach=? where bno=? and password=?";
					pstmt=con.prepareStatement(sql);
					pstmt.setString(1, dto.getTitle());
					pstmt.setString(2, dto.getContent());
					pstmt.setString(3, dto.getAttach());
					pstmt.setInt(4, dto.getBno());
					pstmt.setString(5, dto.getPassword());
				}
				
				int result=pstmt.executeUpdate();
				if(result>0) flag=true;
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				close(pstmt);
			}
			return flag;
		}
}
