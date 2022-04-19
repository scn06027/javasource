package board.action;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.service.BoardModifyService;
import board.util.UploadUtil;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class BoardModifyAction implements Action {
	private String path;
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		UploadUtil util=new UploadUtil();
		HashMap<String, String> dataMap=util.uploadFile(request);
		//datamap에서 가져와야됨 request.getParameter로 못가져오니..
		BoardDTO dto=new BoardDTO();
		
		int bno=Integer.parseInt(dataMap.get("bno"));
		dto.setPassword(dataMap.get("password"));
		dto.setTitle(dataMap.get("title"));
		dto.setContent(dataMap.get("content"));
		dto.setAttach(dataMap.get("attach")); //파일첨부를 안하면 null로 들어옴
		dto.setBno(bno);
	
		BoardModifyService service=new BoardModifyService();
		
		if(!service.update(dto)) {
			path="/qModify.do?bno="+bno;
		}else {
			path+="?bno="+bno; //qView.do?bno=3 이런식으로 가게됨.. 그럼 또 팩토리로 가는거임
		}
		
		return new ActionForward(path, true);
	
	}

}
