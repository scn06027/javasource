package poly;

public class Buyer {
	int money=1000;
	int bonusPoint=0;
	
	Product items[]=new Product[10];
	
	//TV tv[]=new TV[10];
	int i=0;
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족으로 물건 구매가 불가합니다.");
			return;
		}
		
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		items[i++]=p; //왼쪽: 부모변수 오른쪽: 자식변수 <-이게바로 다형성
		System.out.println(p+"을/를 구매하였습니다! ");
	}
}
