package extend;

public class CellPhone {
	//model,color,전원켜고끄기,벨이울린다.메세지주고받기, 전화끊기
	
	//DMBCellphone: cellphone의 기능은 그대로 갖고있고, dmb기능을 추가.
	
	String model,color;
	
	void powerOn() {System.out.println("전원을 켭니다");}
	void powerOff() {System.out.println("전원을 끕니다");}
	void bell() {System.out.println("벨이 울립니다");}
	void sendVoice(String msg) {System.out.println("본인 : "+msg);}
	void receiveVoice(String msg) {System.out.println("상대방 : "+msg);}
	void hangUp() {System.out.println("전화를 끊습니다");}	
}
