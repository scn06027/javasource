package exception;

public class NullpointerExceptionEx {

	public static void main(String[] args) {
		Account[] account=new Account[2];
		
		try {
			System.out.println(account[0].account);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
