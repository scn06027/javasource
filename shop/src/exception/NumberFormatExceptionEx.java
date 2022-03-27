package exception;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		String data1="100"; //얜 안됨 ㅋ
		String data2="100";
		
		try {
			
		//System.out.println(value1+value2);
		} catch (Exception e) {
			e.printStackTrace();
		}finally { //예외여부랑 상관이없음 
			System.out.println("종료");
		}
		
		

	}

}
