package api;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="자바 프로그래밍";
		//indexOf() : 문자열 위치를 인덱스로 돌려준다
		int pos=str1.indexOf("프");
		System.out.println(pos); //3
		
		System.out.println(str1.indexOf("크")); //못찾으면 -1나옴
		if(str1.indexOf("자바")==-1){
			System.out.println("자바 문자열 없음");
		}else {
			System.out.println("자바 문자열 있음");
		}
		
		String str2=new String("HelloHello World");
		//가장 처음에 나오는 위치
		System.out.println(str2.indexOf('o'));
		//가장 나중에 나오는 위치
		System.out.println(str2.lastIndexOf('o'));
		
		System.out.println(str2.indexOf('o',6));//6번자리에서부터 찾아봐라 ㅇㅇ!!
	}

}
