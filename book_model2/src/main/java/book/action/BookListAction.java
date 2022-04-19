package book.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.dto.bookDTO;
import book.service.BookListService;

public class BookListAction implements Action {

	private String path;
	
	public BookListAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//가져올게없어서 getParamater 건너뛴다
		//service 호출
		BookListService service=new BookListService();
		List<bookDTO> list=service.listAll();
		//
		request.setAttribute("list", list);
		
		return new ActionForward(path,false);
								//상단에 있는 path
	}

}
