package extend;

public class CaptionTVEx1 {

	public static void main(String[] args) {
		CaptionTV ctv= new CaptionTV();
		
		ctv.channel=10;
		ctv.channelUp();
		System.out.println("현재 채널 "+ctv.channel);
		ctv.display("Hello World"); 
		ctv.caption=true;
		ctv.display("Hello World");
		
		// 
		CaptionTV2 ctv2=new CaptionTV2("black", true, 8);
		ctv2.setChannel(11);
		ctv2.channelUp();
	
		System.out.println("현재 채널 "+ctv2.getChannel());
	}

}
