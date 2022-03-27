package exam;

public class IPTV extends ColorTV {

	String ip;
	
	public IPTV(int size, int color,String ip) {
		super(size, color);
		this.ip=ip;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printProperty() {
		
		System.out.print("나의 IPTV는 "+ip+" 주소의"+getSize()+" 인치  "+color+" 컬러");
	}

}
