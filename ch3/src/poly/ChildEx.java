package poly;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		//부모-자식 관계
		//parent 변수가 접근할 수 잇는 범위는 부모 클래스에 있는 필드와 메소드만 접근이 가능하다.
		//단 , 오버라이딩 된 메소드가 있다면 자식 클래스의 메소드가 대신 호출된다.
		Parent parent = new Child();
		parent.method1();
		parent.method2();
		
	
		
//		Child c = (Child) new Parent();
//		c.method1();
		//Child2 child2 = new Child();
		
	}

}
