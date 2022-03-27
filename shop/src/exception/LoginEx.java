package exception;

public class LoginEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			login("white","12345");
		} catch (NotExistIDException | WrongPasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			login("blue","54321");
		} catch (NotExistIDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}                 
	public static void login(String id,String password) throws NotExistIDException, WrongPasswordException {
		//id가 blue가 아니라면 notexistid
		//출력: 아이디가존재하지않습니다.
		//password가 12345가 아니면 wrongpassword 
		//패스워드가틀립니다아.
		
		if(id.equals("blue")) {
			
		}else {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		if(password.equals("12345")) {
			
		}else {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
		
	}
}
