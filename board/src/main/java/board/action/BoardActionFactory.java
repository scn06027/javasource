package board.action;

public class BoardActionFactory {
	private static BoardActionFactory maf;
	private BoardActionFactory() {}
	
	public static BoardActionFactory getInstance() {
		if(maf==null)
			maf=new BoardActionFactory();
	
		return maf;
	}
	Action action=null;
	public Action action(String cmd) {
		if(cmd.equals("/qWrite.do")) {
			action=new BoardInsertAction("/qList.do");
		}else if(cmd.equals("/qList.do")) {
			action=new BoardListAction("/view/qna_board_list.jsp");
		}else if(cmd.equals("/qView.do")){
			action=new BoardViewAction("/view/qna_board_view.jsp");
		}else if(cmd.equals("/qHitUpdate.do")) {
			action=new BoardHitUpdateAction("/qView.do");
		}
		
		
		return action;
	}
}
