package classtest;

public class Person {
		final String nation="Korea"; //The blank final field nation may not have been initialized
		final String ssn; 
		//final이 붙으면 무조건! 초기화를 해줘야됨. 직접해주거나 생성자에서라도 해줘야됨(수정불가)4
	// :final은 변수,클래스(상속금지) . 메소드(오버라이딩 금지)
		String name;
		
		public Person(String ssn, String name) {
			super();
			this.ssn = ssn;
			this.name = name;
		}
		
		
}
