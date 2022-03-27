package api;
public class StringEx2 {

	public static void main(String[] args) {
	//String 생성자
		
		String str1=new String();
		char chArr[]= {'a','b','c','d','e'};
		String str2=new String(chArr);
		System.out.println("str2= "+str2);
		
		byte bytes[]= {72,101,85,20,71,53,97,45};
		String str3=new String(bytes);
		System.out.println("str3= "+str3);
		
	
		

	}

}
