package extend;

public class CheckingAccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount account1=new CheckingAccount("111-11","홍길동",2000,"5555-55");
		CheckingAccount account2=new CheckingAccount("222-22","홍길동",5000,"3333-33");
		
		//예금
		//account1.deposit(30000);
		//현재잔액
		System.out.println(account1.getName()+" 님 잔액은 : "+account1.getCash());
		//체크카드 사용
		account1.pay("5555-55", 2000);
		//체크카드 사용 후 현재 잔액
		System.out.println(account1.getName()+" 님의 잔액은 : "+account1.getCash());
	}

}
