package io;

import java.io.Serializable;
//직렬화는 이미 인터페이스로 만들어져있으니 그걸 상속받으면 됨
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2806855282281182967L;
	//지금 같은 객체를 내가 복원하는게 맞나?할때 이 시리얼 번호를 참고해서 보내주는거임
	
	//직렬화: 인스턴스를 저장,전송
	//역직렬화 :저장된 내용을 다시 복원
	//역직렬화시, 직렬화된 것과 같은 클래스인지 구별할때 써먹음
	private String name;
	//private String job;
	transient String job; //transient -> 이 필드는 직렬화 안시킬거임 ㅇㅇ!

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}

	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	
}
