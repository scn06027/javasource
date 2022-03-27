package classtest;

public class Student2 {
//생성자? : default 생성자, 인자를 받는 생성자.
//			여러개 올 수 있다. (단, default 무조건 하나, 인자를 받는 생성자가 여러개로 오는 것)
//			접근 제한자(public,private,package) 클래스명(){}
//			인자(인수=argument) : 괄호안에 들어있는 변수 지칭
	int studentId;
	String studentName,address,mobile;
	
	//생성자 : 초기화 담당, 객체를 생성하면서 필요한 사전작업 하는것을 담당.
	//생성자 오버로딩: 여러개가 올 수 있다. (단, default는 무조건 하나. 인자받는 생성자가 여러개!)메소드가 여러개오면 메소드 오버로딩.
	//★★★★★★
	public Student2() {  //default 생성자는 한개만 만들수있다.. (원앤온리)
		System.out.println("Student2 객체생성");
	}
	public Student2(int studentId,String studentName) {
		System.out.println("인자받는 student2 생성.");
		this.studentName=studentName; //입력받은 값이 여기서의 값이다
		this.studentId=studentId;
		//인자를 받는 생성자..
		// this:객체 자기 자신!
		
	} 
	
	public Student2(String studentName, int studentId) {
		System.out.println("인자받는 student2 생성.");
		this.studentName=studentName;
		this.studentId=studentId;
		
	} 
	public Student2(int studentId,String studentName,String address) {
		System.out.println("인자받는 student2 생성.(2)");
		this.studentId=studentId;
		this.studentName=studentName;
		this.address=address;
	} 
	
	public Student2(int studentId,String studentName,String address,String mobile) {
		System.out.println("인자받는 student2 생성.(3)");
		this.studentId=studentId;
		this.studentName=studentName;
		this.address=address;
		this.mobile=mobile;
	} 
	
	
	void changeMobile() {}
	void changeAddress() {}
	
	
}
