package extend;

public class CaptionTV2 extends TV2 {
	String color;
	boolean power;
	int channel;
		boolean caption;
	public CaptionTV2(String color, boolean caption, int channel) {
		super(color, caption, channel); 
		this.caption=caption;
		//부모의 인자를 받는 생성자를 호출하는 문구.!!
		//부모의 default 생성자 호출.
		// TODO Auto-generated constructor stub
	}
	
	//Implicit super constructor TV2() is undefined for default constructor. 
	//Must define an explicit constructorㄴㅋ
	
	//

	void display(String text) {
		if(caption) {
			System.out.println(text);
		}
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

	public boolean isCaption() {
		return caption;
	}

	public void setCaption(boolean caption) {
		this.caption = caption;
	}
	



}
