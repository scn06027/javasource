package access;

/*
 * 접근 제한자가 뭔데? 언제 쓰는건데?
 * - 객체 생성을 막아야 하는 경우
 * - 특정 메소드 호출 못하도록 하는 경우
 * - 객체의 속성을 외부에서 함부로 변경하지 못하게 하는 경우
 * - 배고파서 배가 자꾸 구르릉거리는거같음 ( ? ? ? )
 * - 종류 : private < default(package) <protected < public
 * 			:default : 접근 제한자를 안 붙이면 된다.
 *
 * - 클래스의 접근을 제한
 * - public(같은 패키지, 다른 패키지 모두 다 허용한다!), default(같은 패키지만 허용함)
 * 
 * - 멤버 변수의 접근 제한
 * - private : 같은 패키지이건, 다른 패키지이건 상관없이 멤버 변수 사용이 불가하다. 
 * 			:속성의 값 변경을 위해서는 메소드를 통해서만 제공하고
 * 			직접적으로 변경하는 것은 허용하지 않기 위해 사용함.
 * */
public class Account  {
//속성: 계좌번호, 소유자,잔액
//기능: 입금, 출금
	
	private String account,name;
	private int cash;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String account, String name, int cash) {
		super();
		this.account = account;
		this.name = name;
		this.cash = cash;
		
	}

	int AddCash(int money){
		this.cash+= money;
		return cash;
	}
	int SubCash(int money){
		this.cash-= money;
		return cash;
	}
	
	//getter 메소드의 특징?
	//private 으로 설정된 변수에 대해서 외부에서 직접 접근은 불가능한 상황.
	// 해당 변수값을 리턴하는 기능
	
	public String getAccount() {
		return account;
	}
	public int getCash() {
		return cash;
	}
	public String getName() {
		return name;
	}
	
	
	public void setAccount(String account) {
		this.account = account;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	
	//setter 메소드?
	//직접 변경하지 말고 메소드를 통해서 변경(매개값의 유효성을 검증한 뒤 변경)
	
	
	
}
