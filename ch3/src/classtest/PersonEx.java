package classtest;

public class PersonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person= new Person("010-1234-5678", "홍길동");
		System.out.println("국적 : "+person.nation);
		System.out.println("주민번호 : "+person.ssn);
		System.out.println("이름 : "+person.name);
		
		person.name="홍두깨";
		//person.ssn="112";
		System.out.println("이름 : "+person.name);
	}

}
