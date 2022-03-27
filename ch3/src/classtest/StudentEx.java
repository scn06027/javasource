package classtest;

public class StudentEx {

	public static void main(String[] args) {
		// 객체 생성, 실행
		// Student 클래스 사용해보기
		//클래스명 변수명=new 클래스명(); 생성
		Student student= new Student(); //heap 안에 생성됐음.
		//초기화를 해줘야 됩니다.
		
		student.studentId=20201010;
		student.studentName="홍길동";
		student.address="서울시 구로구";
		student.mobile="010-1234-5678";
		
		//틀만잇으면 계속 만들어낼수있다..
		student.changeAddress();
		//이건 메소드 호출
		
		Student student2=new Student();
		student2.studentId=20201011;
		student2.studentName="성춘향";
		student2.address="서울시 강남구";
		student2.mobile="010-8765-4321";
		
	}
}
