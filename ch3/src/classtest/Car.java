package classtest;

/*
 * 코딩컨벤션: 코딩할때규칙
 * 변수는 무조건 문자로 시작해야된다..소문자로 이름을 지정하는게 일반적인 규칙.
 * 클래스 이름은 대문자로 시작한다. (camel case: 단어가 두개 합쳐졌을 때 뒷단어의 시작을 대문자로 하기..)
 * (stdent_case: snakecase)-> 이건 주로 파이썬.
 * )
 */
public class Car {
	//속성(property,필드,attribute) : 제조회사, 모델명, 색상, 속도...
	//
	String company,model,color;
	int maxSpeed; 
	
	//기능 : 전진, 후진
	
	void forward() {
		System.out.println("전진하겠습니다.");
	}
	void backward() {
		System.out.println("후진하겠습니다.");
	}

}
