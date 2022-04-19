package book.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.dto.bookDTO;
import book.service.BookInsertService;

public class BookInsertAction implements Action {

	private String path; //성공하면ㄹ갈곳
	
	public BookInsertAction(String path) {
		// TODO Auto-generated constructor stub
		super(); //insertaction에서 넘어온 list.do들어와있음
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//getParameter
		//insert.jsp에서 넘어오는 값 가져오고
		bookDTO dto=new bookDTO();
		dto.setCode(Integer.parseInt(request.getParameter("code")));
		dto.setTitle(request.getParameter("title"));
		dto.setWriter(request.getParameter("writer"));
		dto.setPrice(Integer.parseInt(request.getParameter("price")));
		
		//service호출
		BookInsertService service=new BookInsertService();
		if(!service.insertBook(dto)){
			path="/insert.jsp"; //슬래쉬 꼭 넣어주세용~!
		}
		//ActionForward 객체 생성 후 리턴
		
		return new ActionForward(path,true); //뭐 안담았으니까..sendRedirect로 갈수있는거임
	}

}
