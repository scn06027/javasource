package item.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import item.service.ItemDeleteService;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ItemDeleteAction implements Action {
	private String path;
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(request.getParameter("num"));
		
		//서비스 불러오기
		ItemDeleteService service=new ItemDeleteService();
		if(!service.delete(num)) {
			path="/delete.jsp";
		}
		
		return new ActionForward(path, true);
	}

}
