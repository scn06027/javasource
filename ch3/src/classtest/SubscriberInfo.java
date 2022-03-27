package classtest;

//가입자 정보 클래스

public class SubscriberInfo {
	//속성:이름,아이디,패스워드,전화번호,주소
	//기능: 비밀번호 변경,전화번호 변경,주소 변경
	
	
	String userName,userId,password,mobile,address;
	
	
	public SubscriberInfo() {
		super();
	}

	public SubscriberInfo(String userName, String userId, String password, String mobile, String address) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
	}

	public SubscriberInfo(String userName, String userId, String password) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.password = password;
	}

	void changeMobile(String newMobile){	
		this.mobile=newMobile;
		System.out.println("변경된 전화번호는 "+mobile);
		
	}
	
	void changePassword(String newPassword){	
		this.password=newPassword;
		
	}
	
	void changeAddress(String newAddress){	
		this.address=newAddress;
	}

}
