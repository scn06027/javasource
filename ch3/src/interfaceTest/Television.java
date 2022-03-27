package interfaceTest;

public class Television implements RemoteControl,Searchable {
	
	private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else if(volume< RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else{
			this.volume=volume;
		}
		
		System.out.println("현재 Audio 볼륨: "+this.volume);
	}
	
	

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url+"을 검색합니다.");
	}

	
	
}
