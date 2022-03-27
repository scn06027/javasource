package extend;

public class CheckingTrafficCardAccount extends CheckingAccount {
	
	private boolean hasTrafficCard;
	public CheckingTrafficCardAccount(String account, String name,
			int cash, String cardNo,boolean hasTrafficCard) {
		super(account, name, cash, cardNo);
		this.hasTrafficCard=hasTrafficCard;
		// TODO Auto-generated constructor stub
	}

	
	

	//교통카드 기능이 있나요 없나요? (true false 형태로 주기) : hasTrafficCard

	
	
	//교통비 지불하는 기능.. -payTrafficCard();
	
	int payTrafficCard(String cardNo, int amount){
		if(!hasTrafficCard) {
			System.out.println("교통카드기능이없다~!");
			return -1;
		}
		
		//부모의 pay를 호출한다.
		return pay(cardNo,amount);
	}




	public int deposit(int i) {
		return i;
		// TODO Auto-generated method stub
		
	}

	public void withdraw(int i) {
		// TODO Auto-generated method stub
		
	}
	
	//cardNo,교통카드 사용액을 매개변수로 받는다.
	// 교통카드 기능이 있는지 확인해주세요.

	



}
