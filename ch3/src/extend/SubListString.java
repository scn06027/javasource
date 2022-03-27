package extend;

public class SubListString extends ListString {
	String name="성춘향";
	//오버라이딩
	
	@Override //어노테이션 : 이거 오버라이드 한 메소드임 ㅋㅋ 하고 컴파일러하네 알려주기
	public void list() {
		// TODO Auto-generated method stub
		super.list();
		System.out.println(name+" 하위 클래스");
	}
	
	public void writer(){
		System.out.println("상위 클래스 name: "+ super.name); //super를 붙이면 부모가 가진 name이 나옴 
		System.out.println("하위 클래스 name: "+name); // 안붙이면 자식이 가지고 있는 name이 나옴.
		this.list(); //자식
		super.list(); //부모
	
	}
	
}
