package extend;

public class CaptionTV extends TV {
	String color;
	boolean power;
	int channel;
	
	boolean caption;
	void display(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	



}
