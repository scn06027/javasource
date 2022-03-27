package exception;

public class ThrowsEx {

	public static void main(String[] args) {
		
		Exception e1;
		try {
			findClass();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void findClass() throws ClassNotFoundException{
		Class cls=Class.forName("java.lang.String2");
		//나 안할거야 ㅋㅋ던져버림 던져버려서 호출했던 곳에서 처리하게생겻음
	}
}
