package api;

public class StringBuilderEx {
	public static void main(String[] args) {
		
		//String 클래스와 다른점? mutable(변경이 가능하다!) :append,insert,delete 다 쌉가능
		//StringBuilder :문자열 클래스, 싱글 스레드
		//StringBuffer: 문자열 클래스, 멀티 스레드
		
		StringBuilder builder=new StringBuilder("Hello Java");
		builder.append("안녕하세요");
		System.out.println(builder);
		
		//builder=""; 이렇게 값을 직접 집어넣는건 안됨
		
		System.out.println(builder.delete(0, 2)); //0부터 2까지 잘라내겠다.
		System.out.println(builder);
		
		builder.insert(2,"T"); //2다음에 T 삽입
		System.out.println(builder);
		
		StringBuilder builder1=new StringBuilder("Hello");
		StringBuilder builder2=new StringBuilder("Hello");
		//equlas가 오버라이딩이 안돼있어서 그럼
		System.out.println(builder1.equals(builder2));
		
		String str1=new String(builder1);
		String str2=new String(builder2);
		System.out.println(str1.equals(str2));
		//이건 true가 나옴.
	}
}
