package extend;
/* 상속(extends) : ?
 * 부모(상위,super) 클래스라고 불림
 * 자식(하위)클래스라고 불림.
 * 클래스를 재사용한=> 중복을 줄여준다.
 * 
 * 상속할 때 자식이 부모를 선택한다. 반대는 안된다.
 * private 접근 제한자를 갖는 필드. 메소드는 상속이 불가능하다.
 * 상속은 하나의 클래스만 가능하다.
 * 
 * 모든 클래스는 하나의 클래스를 상속받고 있다. (Object라고 하는 클래스.)
 * 
 * 하나의 클래스 안에 동일한 이름으로 여러개 존재할때
 * 오버로딩 - 생성자, 메소드 
 * 
 * 메소드 오버라이딩(재정의) - 메소드 : 상속인 경우에만 사용이 가능하다.
 * - 부모가 넘겨주는 메소드를 자식 클래스에서 다시 정의하는 것! 
 * - 우선된ㄴ 메소드는 자식 메소드가 우선함 
 * 
 * */
public class DMBCellPhoneEx {

	public static void main(String[] args) {
		DMBCellPhone dmb=new DMBCellPhone();
		
		dmb.model="삼성";
		dmb.color="black";
		dmb.channel=7;
		
		dmb.powerOn();
		dmb.turnOn();
		dmb.changeChannel(9);
		dmb.bell();
		dmb.sendVoice("안녕하셍요");
		dmb.receiveVoice("안녕하시요");
	}

}
