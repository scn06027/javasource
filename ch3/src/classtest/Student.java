package classtest;
//접근 제어자(public, private)
//class
//class명(클래스 이름은 대문자로 시작해야된다. 암묵적인 규칙입니다.)
public class Student {
	//속성(특성): 필수는 아님~! - 멤버변수(property)
	//기능(동작): 이것도 필수는 아님 - 멤버메소드(method)

	//속성: 학번,이름,주소.핸드폰
	int studentId;
	String studentName,address,mobile;
	
	//기능- 핸드폰 번호를 변경, 혹은 주소를 변경..
	
	void changeMobile() {
		
	}
	void changeAddress() {
		
	}
	
	//main이 없는 클래스는 돌아가지 않는다.
}
