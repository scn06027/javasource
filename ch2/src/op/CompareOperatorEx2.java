package op;

public class CompareOperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str1="홍길동";
		String str2="홍길동";
		String str3=new String("홍길동");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));

	}

}
