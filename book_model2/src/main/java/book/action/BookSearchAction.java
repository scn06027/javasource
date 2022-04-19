package book.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.dto.bookDTO;
import book.service.BookSearchService;

public class BookSearchAction implements Action {
	private String path;
	
	public BookSearchAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//getParameter?
		String criteria=request.getParameter("criteria");
		String keyword=request.getParameter("keyword");
		//service 불러오기
		BookSearchService service=new BookSearchService();
		
		List<bookDTO> list=service.list(criteria, keyword);
		request.setAttribute("list", list);
		
		return new ActionForward(path,false); 
		//뭔가 값이 넘어가기 때문에 false, forward 로 가는거임
		//값이 안 넘어가면 sendRedirect로 가는거임
	}

}
