package abstractTest;

public abstract class Car {
	//추상메소드 :템플릿 메소드
	public abstract void drive();
	//넌 무조건 운전을 해야돼 ㅇㅇ 근데 내용은 니 알아서 하셈
	
	public void startCar(){
		System.out.println("시동을 켭니다.");
	}
	public void turnOff(){
		System.out.println("시동을 끕니다.");
	}
	
	public abstract void stop();

}

