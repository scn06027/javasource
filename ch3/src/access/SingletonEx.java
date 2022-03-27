package access;

public class SingletonEx {
	public static void main(String[] args) {
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		
		System.out.println(obj1==obj2);
		
		Account account1=new Account("010-3444-4444", "홍길동", 100);
		Account account2=new Account("010-3444-4444", "길동", 100);
		
		System.out.println(account1==account2);
	}
}
