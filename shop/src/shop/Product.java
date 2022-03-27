package shop;

public abstract class Product {
	//일반 클래스 + 추상메소드
	private String name; // 상품명
	private int price; //가격
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	//얘는 다 동일한 개념으로 출력할거라 첨부터 구현을 하는거임
	public void printDetail() {
		System.out.println("상품 이름: "+name);
		System.out.println("상품 가격: "+price);
		
		printExtra();
	}
	//얘는.상품마다 서로 다른 내용이 들어가야하기 때문
	public abstract void printExtra();
	
}
