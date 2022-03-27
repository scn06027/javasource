package extend;

public class CheckingTrafficCardAccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckingTrafficCardAccount account1 =new CheckingTrafficCardAccount("111-11", "홍길동", 50000, "5555-55", false);
		CheckingTrafficCardAccount account2 =new CheckingTrafficCardAccount("333-33", "성춘향", 20000, "2222-22", true);
		
		//예금
		account1.deposit(10000);
		//출금
		account1.withdraw(20000);
		
		
	}

}
