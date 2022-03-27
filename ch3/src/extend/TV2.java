package extend;

//CaptionTV:TV+caption 
//클래스를 왜 만들어야 될까요? 객체의 속성과 기능을 코드로 구현합니다
public class TV2 {
	//속성만들기 :색상(black(,전원상태, 채널. . . . . . .
	private String color;
	private boolean power;
	private int channel;
	
	
	
	public TV2(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	//기능: 전원on/off,채널 변경
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
