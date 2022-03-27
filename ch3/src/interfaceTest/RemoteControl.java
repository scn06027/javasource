package interfaceTest;

public interface RemoteControl {
	//상수
	int MAX_VOLUME=10;
	int MIN_VOLUME=10;
	//추상 메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	//dafault  메소드 (8버전부터 가능함)
	static void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
		}else {
			System.out.println("무음 해제");
		}
	}
	//static 메소드 (8버전 부터 가능함)
	static void changeBattery() {System.out.println("건전지 교환");}
	

}
