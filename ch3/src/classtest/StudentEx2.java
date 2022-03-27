package classtest;

public class StudentEx2 {

	public static void main(String[] args) {
	
		//Student2 객체생성
//		default 생성자르 롷출하면 객체 생성
		Student2 student =new Student2(2011202,"이몽룡"); //이 시점에서 생성자가 자동으로 호출된다. (객체를 생성할때) 졸ㄹ려미친개졸려 ㅕ
		
		student.studentName="장발장";
		student.studentId=54601;
		
		System.out.println("학번 : "+student.studentId);
		System.out.println("이름은? "+student.studentName);
	
		System.out.println();
		//인자를 받는 생성자를 호출하면서 객체생서 
		Student2 student2=new Student2(2010202,"홍길동"); //순서,타입잘 맞추기.. 
		//이 방법을 제일 많이 쓴다!!!!!!!!!!!!!!!!1
		System.out.println("학번 : "+student2.studentId);
		System.out.println("이름은? "+student2.studentName);
		System.out.println("이름은? "+student2.address);
		System.out.println("이름은? "+student2.mobile);
		
		System.out.println("");
		
		Student2 student3 =new Student2(202211025, "성춘향", "강남");
	}

}
