package extend;

import java.util.Scanner;

//Account + 체크카드

public class CheckingAccount extends Account {

	private String cardNo; //체크카드 번호
	
	public CheckingAccount(String account, String name, int cash,String cardNo) {
		super(account, name, cash);
		this.cardNo=cardNo;
	}

	//직불카드 사용액을 지불한다 (먼소리임?)
	//매개인자로 직불카드번호와 사용액을 받아서 카드번호 일치 여부 및
	//은행 잔고와 비교한 후 지불한다.
	

	
	
	int pay(String cardNo,int amount){
	
		if(!this.cardNo.equals(cardNo)||getCash()<amount) {
			System.out.println("번호가 틀렸거나 잔액이 부족합니다. ");
			return 0;
		}else {
			//여기서 지불하면 되는거임
	//	return exam.Account2Ex.withdraw(amount);
		
		}
		return amount;
		
	}



	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
}
