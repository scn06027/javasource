package thread;
/*
 * 멀티스레드
 * cpu 사용률 향상, 자원 효율적으로 사용, 작업이 분리되어 코드가 간결해진다.
 * 
 * ex) 카카오톡은 메세지 전송, 파일주고받기도 하고,
 */
public class BigLetters {

	public static void main(String[] args) {
		
		//같이 수행할 클래스 지정해주기
		
		SmallLetters t1 = new SmallLetters();
		//걍 객체 생성 해주고 오버라이딩 된 run이 돌아가게 해주는 start(); 
		t1.start();
		
		Runnable r=new NumPrint();
		Thread t2=new Thread(r);
		t2.start();
		
		//대문자 A~Z까지 출력하는거
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch+" ");
		}
		
		
		
		
	}

}
