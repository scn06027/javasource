package basic;

public class EscapeChar {
	// \로 시작하는 문자는 약속된 규칙이 있다.
	// \n, \t
public static void main(String[] args) {
	System.out.println("\n안녕하세요");
	System.out.println("안녕하세요\t반갑습니다 ");
	System.out.println("\"Hello\"");
	// \ 하나를 표현하려면? \\ 이렇게 붙여서 적어주면 된다.
	
	
	System.out.print("Hello\n");
	System.out.print("world");
	
	System.out.println("C:\\");
}

}
