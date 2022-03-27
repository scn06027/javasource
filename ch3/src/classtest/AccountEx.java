package classtest;

public class AccountEx {

	public static void main(String[] args) {
		Account account=new Account("010-3444-4444", "홍길동", 100);
		account.AddCash(500);
		account.AddCash(6000);
	
		System.out.println("현재 " + account.name+"님의 잔액은 "+account.cash+"원입니다.");
		
		Account account2=new Account("010-3444-4444", "성춘향", 0);
		System.out.println("현재 " + account2.name+"님의 잔액은 "+account2.cash+"원입니다.");

	}

}
