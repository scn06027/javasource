package item.action;

public class ItemActionFactory {
	private static ItemActionFactory maf;
	private ItemActionFactory() {}
	
	public static ItemActionFactory getInstance() {
		if(maf==null)
			maf=new ItemActionFactory();
	
		return maf;
	}
	Action action=null;
	public Action action(String cmd) {
		if(cmd.equals("/list.do")) {
			action=new ItemListAction("list.jsp");
		}else if(cmd.equals("/insert.do")) {
			action=new ItemInsertAction("list.do");
		}else if(cmd.equals("/delete.do")) {
			action=new ItemDeleteAction("list.do");
		}else if(cmd.equals("/update.do")) {
			action=new ItemUpdateAction("list.do");
		}else if(cmd.equals("/search.do")) {
			action=new ItemSearchAction("/list.jsp");
		}
		
		
		
		return action;
	}
}
