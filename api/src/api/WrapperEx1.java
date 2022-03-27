package api;
/*
 * Wrapper 클래스
 * 기본형 타입을 객체로 다루기 위한 클래스들
 * 
 * int=> Integer (Intger.parseInt())
 * boolean=> Boolean(Boolean.parseBoolean())
 * byte=>Byte
 */
public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean b=new Boolean(true);
		Integer i=new Integer(100); //Integer i= new Integer(100)
		
		int i2=100;
		
		System.out.println(i==i2);
		System.out.println(i2
				);
	}

}
