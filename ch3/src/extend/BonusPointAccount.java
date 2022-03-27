package extend;

public class BonusPointAccount extends Account {
	//보너스 포인트
	private int bonuspoint;
	public BonusPointAccount(String account, String name, int cash,int bonuspoint) {
		super(account, name, cash);
		this.bonuspoint=bonuspoint;
		// TODO Auto-generated constructor stub
	}

	//예금

	
	@Override
	int deposit(int amount) {
		
		super.deposit(amount);
		//보너스 포인트 = 예금액 * 0.1%
		bonuspoint+=(int)(amount*0.001);
		return bonuspoint;
	
	}

	public int getBonuspoint() {
		return bonuspoint;
	}

	public void setBonuspoint(int bonuspoint) {
		this.bonuspoint = bonuspoint;
	}
	
	
}
