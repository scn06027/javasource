package extend;

public class SubListStringEx {

	public static void main(String[] args) {
		SubListString sub=new SubListString();
		sub.list(); //이건 무조건 자식메소드가 우선이라 자식꺼가 먼저 실행됨!
		//부모것을 호출하고싶다면 오버라이딩 했을 때 super.list(); 이런식으로 호출해주면 됨.
		sub.writer();
	}

}
