package extend;

public class Car2 {
	
	private String name;
	final String color="white";
	
	public Car2(String name) {
		super();
		this.name = name;
	}
	public void startCar(){
		System.out.println("시동을 켭니다.");
	}
	public void turnOff(){
		System.out.println("시동을 끕니다.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
