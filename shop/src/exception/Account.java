package exception;

public class Account  {
//속성: 계좌번호, 소유자,잔액
//기능: 입금, 출금
	
	String account,name;
	int cash;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String account, String name, int cash) {
		super();
		this.account = account;
		this.name = name;
		this.cash = cash;
		
	}
	
	
	int deposit(int money){
		this.cash+= money;
		return cash;
	}
//	int withdraw(int money) throws BalanceInsufficientException{
//		if(cash<money)
//		{
//			//예외를 강제로 발생시킬 수 있다.
//			throw new BalanceInsufficientException("잔고부족: "+(money-cash)+" 부족");
//		}
		int withdraw(int money) throws Exception{
			if(cash<money)
			{
				//예외를 강제로 발생시킬 수 있다.
				throw new Exception("잔고부족: "+(money-cash)+" 부족");
			}
		cash-= money;
		return cash;
	
	
	}
	
	
}
