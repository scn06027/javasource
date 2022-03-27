package access;

public class AccountEx {

	public static void main(String[] args) {
		Account account=new Account("010-3444-4444", "홍길동", 100);
	
		//System.out.println("현재 " + account.name+"님의 잔액은 "+account.cash+"원입니다.");
		System.out.println("계좌번호는?: " +account.getAccount());
		System.out.println("계좌주는?: " +account.getName());
		System.out.println("계좌잔고는?: " +account.getCash());
		
		

	}

}
