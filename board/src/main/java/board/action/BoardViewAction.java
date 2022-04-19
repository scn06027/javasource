package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import board.dto.BoardDTO;
import board.service.BoardViewService;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class BoardViewAction implements Action {
	private String path;
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//bno 가져오기 (주소줄에 있는걸로도 읽을 수 있다. get 방식이 그렇게 가는거니까!)
		int bno=Integer.parseInt(request.getParameter("bno"));
		
		//service작업
		BoardViewService service=new BoardViewService();
		BoardDTO dto=service.View(bno);

		//page이동.. 성공하면 qna_board_view..로 가야됨 
		request.setAttribute("dto", dto);
		return new ActionForward(path,false);
	}

}
