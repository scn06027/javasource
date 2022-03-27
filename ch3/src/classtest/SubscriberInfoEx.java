package classtest;

public class SubscriberInfoEx {

	public static void main(String[] args) {
		SubscriberInfo sub=new SubscriberInfo();
		
	sub.userId="hong1234";
	sub.userName="홍길동";
	sub.password="hong1234@";
	
	objectPrint(sub);
//	//가입자 정보 출력

//	//두번째 가입자
//	System.out.println();
	SubscriberInfo sub2=new SubscriberInfo("성춘향","sung1234","sung12345*");
	objectPrint(sub2);

//	//세번째 가입자
//	System.out.println();
SubscriberInfo sub3=new SubscriberInfo("송중기","song1234","song12345*","010-1234-5678","서울시 강남구");
//	System.out.println("아이디: "+sub3.userId);
//	System.out.println("이름: "+sub3.userName);
//	System.out.println("비밀번호: "+sub3.password);
//	System.out.println("주소: "+sub3.address);
//	System.out.println("전화번호: "+sub3.mobile);
objectPrint(sub3);

	
	
	}

	static void objectPrint(SubscriberInfo sub) { //이건 여기에다 새로 지정한 sub임 위에있는거랑 관련없음
		//가입자 정보 출력을 해줬으면 좋겠음.
		System.out.println();
		System.out.println("아이디: "+sub.userId);
		System.out.println("이름: "+sub.userName);
		System.out.println("비밀번호: "+sub.password);
		System.out.println("주소: "+sub.address);
		System.out.println("전화번호: "+sub.mobile);
	}
}
