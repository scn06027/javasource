package classtest;

public class TVEx {

	public static void main(String[] args) {
		// (default 생성자를 호출하면서) 객체 생성
		TV tv= new TV();
		//초기화하자
		tv.color="black";
		tv.channel=11;
		tv.power=false;
		//생성자를 명시하지 않으면 컴파일러가 자동으로 디폴트생성자 만들어줌
		//객체를 사용한다.
		tv.power(); //전원을 켜겠다는 메소드 
		System.out.println("현재 전원 상태 "+ tv.power);
		System.out.println("현재 채널 "+tv.channel);
		tv.channelUp();//채널 번호 증가
		System.out.println("현재 채널 "+tv.channel);
		
	}

}
