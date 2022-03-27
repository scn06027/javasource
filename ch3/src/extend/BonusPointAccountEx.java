package extend;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BonusPointAccount bonuspoint1=new BonusPointAccount("111-11","홍길동", 100000,3);
		BonusPointAccount bonuspoint2=new BonusPointAccount("222-22","성춘향", 30000,5);
		
		
		
		bonuspoint1.deposit(200000);
	
		
		System.out.println("보너스포인트 어쩌고는 "+bonuspoint1.getBonuspoint());
		System.out.println("잔액 어쩌고는 "+bonuspoint1.getCash());
				
	}

}
