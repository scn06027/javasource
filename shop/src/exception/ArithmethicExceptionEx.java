package exception;

public class ArithmethicExceptionEx {

	public static void main(String[] args) {
	
		
		int num1=4, num2=0;
		// java.lang.ArithmeticException
		
		try { //예외가 발생할 만한 문장(코드)
			System.err.println(num1/num2);
		} catch (Exception e) { //에외가 발생함ㄴ 대신 ㅊ이거로 처리
	e.printStackTrace();
	//out.println("0으로 난루 수가 업ㅆㅅ븐다.");

				
	}

}
	}
