package exception;

public class CatchExceptionEx {
//catch (Exception e) {} <=모든 익셉션을 처리할 수 있다.
	public static void main(String[] args) {
		try {
			//ArrayIndexOutOfBoundsException 이 일어날 수도 있음
			String data1=args[0];
			String data2=args[1];
			
			//NumberFormatException
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개 값의 수가 부족합니다.");
		}catch(NumberFormatException e){
			System.out.println("숫자로 변경할 수 없습니다.");
		} 
		
		
		
	}

}
