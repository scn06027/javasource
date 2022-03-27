package basic;

//이름을 짓는 규칙이 있음
//클래스명이 두개의 단어로 이루어져 있다면? 각 시작은 대문자로 

//변수: 메모리 저장공간(무엇을 담을 것이냐에 따라서 타입을 지정)
//	:담는 값이 변할 수 있다. 
//	: 정수형(숫자의 크기에 따라서 메모리를 차지하는 공간이 달라짐), 문자형, 실수형
public class ByteVariable {
	public static void main(String[] args) {
		//정수형: byte 
		//타입 변수명=값;
		// byte b1=3 컴파일 에러는 IDE가 알려줌
		byte b1=3;
		System.out.println(b1);
		
		
		byte b2= -128;
		//byte b2= 128; // Type mismatch
		byte b3= 127;
		
		System.out.println("b2="+b2+",b3= "+b3);
	}

}
