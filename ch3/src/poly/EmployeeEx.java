package poly;

public class EmployeeEx {

	public static void main(String[] args) {
		Employee employee =new Employee();
		employee.setName("홍길동");
		employee.setPosition("사원");
		work(employee);
		
		Ceo employee2 = new Ceo();
		employee2.setName("김동호");
		employee2.setPosition("관리자");
		work(employee2);
		
		Adminstrator employee3 = new Adminstrator();
		employee3.setName("정우성");
		employee3.setPosition("사장");
		employee3.work();

	} //매개 변수의 다형성
	public static void work(Employee employee1) {
		//Employee employee1 =employee; 라는 뜻 
		employee1.work();
	}
	
	public static void work(Ceo employee2) {
		//Employee employee1 =employee; 라는 뜻 
		employee2.work();
	}

}
