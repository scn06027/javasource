package classtest;

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
	
	
	int AddCash(int money){
		this.cash+= money;
		return cash;
	}
	int SubCash(int money){
		this.cash-= money;
		return cash;
	
	
	}
	
	
}
