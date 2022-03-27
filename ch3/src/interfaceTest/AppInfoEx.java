package interfaceTest;

public class AppInfoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SeparateVolume obj1=new SeparateVolume("863r445", "개미", "베르나르");
		Lendable obj1=new SeparateVolume("863r445", "개미", "베르나르");
	
		obj1.checkOut("홍길동", "20220228");
	
	AppCD obj=new AppCD("2022021", "oracle");
	obj.checkOut("성춘향", "234234");
			
	}
	
}
