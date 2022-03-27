package access;

/*
 * 싱글톤 패턴 : 단 하나의 인스턴스만 사용하겠다!ㅅ
 * 1. 생성자를 private로 작성
 * 		-자동으로 생성자를 만들게 놔두면 public으로 생성해버림
 * 2. 클래스 내부에 static으로 유일한! 인스턴스 생성
 * 3.외부에서 참조 가능한 public 메소드 작성
 * */

public class Singleton {
	
	public static Singleton singleton=new Singleton();
	private Singleton() {}
	public static Singleton getInstance() {
		if(singleton==null) {
			singleton=new Singleton();
		}
		return singleton;
	}
}
