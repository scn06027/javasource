package pattern.action;

public class ActionForward {
	//path랑 이동방식땜에 만들었음..
	private String path;
	private boolean redirect;//true면 sendRedirect방식으로 갈거고 false면 forward형식으로 갈거다.
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isRedirect() {
		return redirect;
	}
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	public ActionForward(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}
	public ActionForward() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
