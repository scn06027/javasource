package classtest;

public class MethodTest1 {
	// true,false 리턴하는 메소드 작성 =isRedirect()
	// 인자는 없음
	
	//void 빼고 다 보냄
	
	boolean isRedirect(){
		return true;
	}	
	
	//정수타입 리턴, sum()
	//인자는 정수타입 2개를 입력받음
	//넘어온 정수타입 2개를 더하기 한 후 결과값 리턴
	
	int sum(int a,int b) {
		return a+b;
	}
	 //문자 하나를 리턴하고싶음. method1()
	//인자 없음
	char method1() {
		
		return 'a';
	}

	//실수 리턴, divide1이라는 변수를 하나 가지고 있고,
	//인자는 실수 값 2개를 입력받을거임
	
	float divide1(float a,float b) {
		
		return a/b;
	}
	
	//int 타입 배열 리턴~!
	//array() :입력받은 배열을 리턴한다, 인자는 int 타입의 배열.
	
	int[] array(int[] sample) {
		sample[0]=8;
		return sample;
	}
	
	//문자열 타입을 리턴
	// method2() ,인자는 없음  :인사말 리턴
	
	String method2() {
		return"안녕하세요~!";
	}
	
	
}
