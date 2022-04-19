package book.action;

public class BookActionFactory {
	private static BookActionFactory baf;
	private BookActionFactory() {}
	
	public static BookActionFactory getInstance() {
		if(baf==null) {
			baf=new BookActionFactory();
		}
		return baf;
	}
	Action action=null;
	public Action action(String cmd) {
		//Action 생성시 Path를 지정한다.. 근데 작업이 성공할 경우! 움직일 페이지임
		if(cmd.equals("/list.do")) {
			action=new BookListAction("/list.jsp");
			//받아온 cmd가 /list라면? /list.jsp로 이동해라
			
		}else if(cmd.equals("/insert.do")) {
			action=new BookInsertAction("/list.do");
		}else if(cmd.equals("/delete.do")) {
			action=new BookDeleteAction("/list.do");
		}else if(cmd.equals("/update.do")) {
			action=new BookUpdateAction("/list.do");
		}else if(cmd.equals("/search.do")) {
			action=new BookSearchAction("/list.jsp");
		}
		
		return action;
	}
}
