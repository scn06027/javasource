package interfaceTest;

public class AppCD extends CDInfo implements Lendable {
	String borrower;
	String checkOutDate;
	int state;
	
	public AppCD(String registerNo, String title) {
		super(registerNo, title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void checkOut(String borrower, String date) {
		
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state=1;
		System.out.println("*** "+title+"이 대출되었습니다. ***");
		System.out.println("대출자 : "+borrower);
		System.out.println("대출일 : "+date);
	}

	@Override
	public void checkin() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state=0;
		System.out.println("*** "+title+"이 반납되었습니다. ***");

	}

}
