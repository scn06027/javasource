package extend;

public class CreditLineAccount extends Account {
//마이너스 한도 : CreditLine
	private int creditLine;
	public CreditLineAccount(String account, String name, int cash) {
		super(account, name, cash);
		this.creditLine=creditLine;
		// TODO Auto-generated constructor stub
	}
		
		@Override
		int deposit(int amount) {
			//잔액=잔액+마이너스 한도
			//사용액 amount 보다 잔액이 작은지 확인.
			if(amount>getCash()+creditLine) {
				System.out.println("잔액이 부족합니다.");
				return -1; 
				}
			//차감이 가능하다면? 잔액-사용액
			
			setCash(getCash()-amount);
			//리턴 값 잔액
			return getCash();
			
		}
	
	}


