package classtest;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car=new Car();
		car.color="red";
		car.company="doyota";
		car.maxSpeed=150;
		car.model="CS-3";
		
		System.out.println("제조회사? : "+car.company);
		System.out.println("모델명 : "+car.model);
		System.out.println("색상? : "+car.color);
		System.out.println("아너무너무너문너무졸린게아니냐미친");
		
		car.forward();
		
		Student student = new Student();
		student.address="어쩌구주소";
	}

}
