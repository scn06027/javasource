package api;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String : immutable(불변)객체
		String str1="Hello Java. Hello Java";
		str1.replace("Java", "자바"); //이렇게하면 원본은 바뀌지않는다 ㅇㅇ..ㅇ
		System.out.println(str1.replace("Java", "자바"));
	
	
		String str4=str1.replaceFirst("Java", "자바");
		//얘는 처음에 만나는 애만 바꿔줌 (first)
		System.out.println(str4);
		//String은 불변이다.
		
		String str2="Hello";
		str2+=" 안녕하세요";
		str2+=" 반갑습니다";
		str2+=" 감사합니다";
		str2+=" 안녕히가세요";
		
		System.out.println(str2);
	}

}
