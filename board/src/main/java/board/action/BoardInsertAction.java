package board.action;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.service.BoardInsertService;
import board.util.UploadUtil;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class BoardInsertAction implements Action {
	private String path;
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		UploadUtil util=new UploadUtil();
		HashMap<String, String> dataMap=util.uploadFile(request);
		//datamap에서 가져와야됨 request.getParameter로 못가져오니..
		BoardDTO dto=new BoardDTO();
		dto.setName(dataMap.get("name"));
		dto.setPassword(dataMap.get("password"));
		dto.setTitle(dataMap.get("title"));
		dto.setContent(dataMap.get("content"));
		dto.setAttach(dataMap.get("attach"));
		
		BoardInsertService service=new BoardInsertService();
		if(!service.insert(dto))
			path="/view/qna_board_write.jsp";
		
		return new ActionForward(path, true);
	}

}
