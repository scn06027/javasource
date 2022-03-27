package exception;

public class CheckedException {

	public static void main(String[] args) {
		
		try {
			Class.forName(null); //컴파일러가 잡았음 :CheckedException
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
