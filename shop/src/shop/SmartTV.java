package shop;

public class SmartTV extends Product {

	private String resolution;
	
	public SmartTV(String name, int price,String resolution) {
		super(name, price);
		this.resolution=resolution;
	}

	@Override
	public void printExtra() {
		// TODO Auto-generated method stub
		System.out.println("해상도 정보 : "+resolution);
	}

}
