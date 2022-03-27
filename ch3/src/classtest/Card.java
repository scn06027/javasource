package classtest;

public class Card {
//멤버변수 (인스턴스변수)
	String kind;
	int number;
	//클래스 변수 = 공유 
	static int width=100, height=150;
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	

}
