package basic;

//변수 유효 범위
//변수를 어디서 선언했느냐에 따라 미치는 범위가 다름
//{}: 블록안에서 선언 => 선언된 블록 안에서만 사용이 가능하다.
// 클래스 내부에 선언
public class VariableScope1 {
	//클래스 내부에 선언
	
//	int age=5;
public static void main(String[] args) {
	//메소드 내부에서 선언 -지역(local)변수
	int age=4;
	int v1=3;
	{
		v1=age+30;
		int v2=4;
			System.out.println("v2"+v2);
	
//		System.out.println(age); 
	}
	System.out.println("v1"+v1);

	
}

public static void print() {
//	System.out.println(age);
}
}
