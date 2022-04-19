package member.action;

public class MemberActionFactory {
	private static MemberActionFactory maf;
	private MemberActionFactory() {}
	
	public static MemberActionFactory getInstance() {
		if(maf==null)
			maf=new MemberActionFactory();
	
		return maf;
	}
	Action action=null;
	public Action action(String cmd) {
		
		if(cmd.equals("/logout.do")) {
			action=new MemberLogoutAction("/view/loginForm.jsp");
		}else if(cmd.equals("/leave.do")){
			action=new MemberLeaveAction("/index.jsp");
		}else if(cmd.equals("/modify.do")) {
			action=new MemberModifyAction("/view/loginForm.jsp");
		}else if(cmd.equals("/login.do")) {
			action=new MemberLoginAction("/view/loginForm.jsp");
		}else if(cmd.equals("/join.do")) {
			action=new MemberJoinAction("/view/loginForm.jsp");
		}else if(cmd.equals("/checkId.do")) {
			action=new CheckIDAction("/view/checkId.jsp");
		}
		
		
		return action;
	}
}
