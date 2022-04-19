package pattern.action;

public class ActionFactory {
	//single ton 객체 생성
	//default 생성자: private, 다른 생성자는 제공 안한다..
	//getInstance 메소드 생성
	private static ActionFactory af;
	private ActionFactory() {} //객체생성못하게만들음
	
	public static ActionFactory getInstance() {
		if(af==null)
			af=new ActionFactory();
		
		return af;
	}//객체 생성하고싶음 이렇게 만들어야됨
	Action action=null;
	public Action action(String cmd) {
		if(cmd.equals("/select.do")) {
			action = new SelectAction();
		}else if(cmd.equals("/insert.do")){
			action = new InsertAction(); //얘를 생성하고
		}else if(cmd.equals("/login.do")) {
			action = new LoginAction();
		}
		//아까 그일을 얘한테시킬거,.
		//생성한 액션을 리턴해줌
		return action;
	}
}
