package classtest;

//클래스를 왜 만들어야 될까요? 객체의 속성과 기능을 코드로 구현합니다
public class TV2 {
	//속성만들기 :색상(black(,전원상태, 채널. . . . . . .
	String color;
	boolean power;
	int channel;
	
	//생성자?
	public TV2(String color){
	
		this.color=color;
	}
	public TV2(String color, boolean power){
		
		this.power=power;
		this.color=color;
	}
	public TV2(String color, boolean power, int channel){
		this.channel=channel;
		this.power=power;
		this.color=color;
	}
	//기능: 전원on/off,채널 변경,
	
	void power() {
		power=!power;
		
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}


}
