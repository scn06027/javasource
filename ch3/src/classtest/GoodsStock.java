package classtest;

public class GoodsStock {
	//속성 - 상품코드(P1010), 재고수량(25)
	//기능 - 재고추가, 재고감소
	
	String code;
	int stocknum;
	
	//생성자를 만들어 봅시다.
	
		public GoodsStock() {
	super();
	//default 생성자
}
public GoodsStock(String code, int stocknum) {
		super();
		this.code = code;
		this.stocknum = stocknum;
	}
	
	//기능 - 재고추가, 재고감소
	//메소드(==함수) : 어떤 기능을 가지고 있음
	//리턴타입 메소드명(인자....){해야될 일 명시}
	//리턴타입 : 데이터타입 (byte, short, int, long, char, float, double, boolean 다쌉가능)
	//배열도 가능함!!!!!!!!!!!!!( byte[], short[],int[]...)
	//클래스, 인터페이스 다 가능 ~!.
	//void? 메소드가 일을 끝내고 돌아갈때 가지고 가야 할 데이터타입. void는 암것도 리턴할 필요가 없다는 뜻.
	//int method1(){} : method1 일을 끝내고 int 타입을 가지고 돌아갈거임 ㅇㅇ..
	//재고추가: 재고수량 입력받아서 현재 재고수량에 추가하기 / 현재 재고 수량이 얼마인지 보내기
	


	int addStock(int amount) {
	stocknum+=amount;	
	return stocknum; 
	//return:? 메소드르르 호출한 곳으로 값을 보내준다.
	}
	
	

	int subStock(int amount) {
		stocknum-=amount;	
		return stocknum;
		}
}
