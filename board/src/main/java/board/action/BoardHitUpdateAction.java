package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.service.BoardHitUpdateService;
import board.service.BoardViewService;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class BoardHitUpdateAction implements Action {
	private String path; //qView.do
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//bno 가져오기
		int bno=Integer.parseInt(request.getParameter("bno"));
		

		//service 작업 = > 조회수 업데이트
		BoardHitUpdateService service=new BoardHitUpdateService();
		service.hitUpdate(bno);
		
		path+="?bno="+bno; //qView.do?bno=3
		return new ActionForward(path,true);
	}

}
