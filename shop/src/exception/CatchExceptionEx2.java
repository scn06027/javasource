package exception;

public class CatchExceptionEx2 {
//catch (Exception e) {} <=모든 익셉션을 처리할 수 있다.
	public static void main(String[] args) {
		try {
			//ArrayIndexOutOfBoundsException 이 일어날 수도 있음
			String data1=args[0];
			String data2=args[1];
			
			//NumberFormatException
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
		
		} catch (ArrayIndexOutOfBoundsException|NumberFormatException e){
		}	System.out.println("어쩌고저쩌고..");	
		
		
		
	}

}
