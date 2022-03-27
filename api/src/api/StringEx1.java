package api;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자열 만들 때 2가지 방법
		// 문자열 리터럴 지정
		//String 클래스 생성자 이용.
		String str1="Hello";
		String str2="Hello";
		String str3=new String("Hello");
		String str4=new String("Hello");
		
		System.out.println(str1==str2); //true가 나오는 이유: 주소가 같기 때문이다~!
		System.out.println(str3==str4); //false
		
		//내용비교를 하려면 equals를 써줘야 한다.
	}

}
