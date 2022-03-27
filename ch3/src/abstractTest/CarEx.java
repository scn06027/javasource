package abstractTest;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car= new SportCar();
		car.startCar();
		car.drive();
		car.stop();
		car.turnOff();
		System.out.println();
		car=new Truck();
		car.startCar();
		car.drive(); //다형성 
		car.stop(); //다형성
		car.turnOff();
	}

}
