package api;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="자바 프로그래밍";
		
		System.out.println(str1.charAt(0));
		
		String str2="Hello Wolrd!";
		//str2 문자열을 char 배열로 생성하고 출력하기
		
		char[] arr1=new char[str2.length()];
		
		for (int i = 0; i < str2.length(); i++) {
			arr1[i]=str2.charAt(i);
		}
		System.out.println(arr1);
		
		
		//문자열에 '프'자가 들어있는지 판단하는 프로그램 작성
		//문자가 들어있음, 없음ㅍ
		
	char[] arr2=new char[str1.length()];
		boolean flag=false;
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i)=='프') {
				flag=true;
			break;
			}
		}
		System.out.println(flag?"문자가 들어있음":"없음");
		
	}

}
