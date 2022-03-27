package classtest;

public class GoddsStockEx {

	public static void main(String[] args) {
		GoodsStock goods1=new GoodsStock("P1010",100);
		//200개가 입고된 상태..
		
		System.out.println("제품 번호: "+goods1.code);
		System.out.println("현재 재고수량: "+goods1.stocknum);
		
	//200개가 입고됐음. 여기서 메소드를 호출한다!
		//결과값이 넘어오는 경우를 처리하자.
		//1. 출력문 사용하기.(화면에 보여주고 다시 사용 안하는 경우) 2. 변수에 담기.(출력하고 다시 사용하는 경우)
		
		System.out.println("현재 재고는? "+goods1.addStock(200));
		int stock1=goods1.addStock(200);
		System.out.println("두번째 현재 재고는? "+stock1);
		
		//150개가 출고된 상황
	
		System.out.println("세번째 현재 재고는? "+goods1.subStock(150));
		int stock2=goods1.subStock(150);
		System.out.println("네번쨰 현재 재고는? "+stock2);
		
	}

}
