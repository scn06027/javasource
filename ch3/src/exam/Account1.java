package exam;

public class Account1 {
//잔고(balance)필드
	//잔고 필드는 음수값이 될 수 없고 , 최대 백만원까지 저장가능
	//외부에서 balance 필드를 맘대로 변경하지 못한다. 0<=balance<1000000 범위의 값만 가짐

//setter, getter 작성 ,  0,1000000은 min_balancedhk max_balance 상수로 선언
	//setter의 매개값이 음수이거나 백만원을 초과하면 현재 balance값 유지한다.
	
	private int balance;
	
	static final int min_balance=0,max_balance=1000000;

	public Account1() {
		super();
		
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance<=max_balance&&balance>=min_balance)
			this.balance= balance;
	}
	
	
	
	
	
}
