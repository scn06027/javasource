package exam;

import java.util.Iterator;
import java.util.Scanner;

public class Account2Ex {
	
	//멤버변수
	private static Account2[] accountArray=new Account2[100];
	private static Scanner sc= new Scanner(System.in);
	static boolean run=true;
	private static int i=0;
	public static void main(String[] args) {
		
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택>>   ");
		
			int selectNo=Integer.parseInt(sc.nextLine());
			
			if(selectNo==1) {
				createAccount();
			}else if(selectNo==2) {
				//계좌목록보기
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				System.out.println("시스템 종료");
				run=false;
			}
		}
	}//main
	
	private static void createAccount() {
		
		System.out.print("계좌번호를 입력해주세요  ");
		String ano =sc.nextLine();

		System.out.print("사용자 이름을 입력해주세요   ");
		String owner=sc.nextLine();
		
		System.out.print("잔액을 설정하세요   ");
		int balance=Integer.parseInt(sc.nextLine());
		
		//account2 객체생성
		Account2 account2= new Account2(ano, owner, balance);
		
		//배열에 담아주는 역할
	
		
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]==null) {
				accountArray[i]=new Account2(ano,owner,balance);
				System.out.println("계좌 생성 완료");
				break;
			}
		}
		
		
	}//계좌생성 ano,owner,balance값 다 입력받고 account2객체 생성해서 배열에 담아주세요.
	
	private static void accountList(
) {
		//지금까지 생성된 모든 계좌목록을 보여주세요
		
		System.out.println("-------------------");
		System.out.println("계좌번호   계좌주   잔액");
		System.out.println("-------------------");
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]!=null) {			
				System.out.printf("%s\t%s\t%d\n",accountArray[i].getAno(),
						accountArray[i].getOwner(),(accountArray[i].getBalance()));
	
			}}
	}//계좌목록
	private static void deposit() {
		System.out.print("계좌번호를입력하세요>> ");
		String anoRight=sc.nextLine();
		
		System.out.println("예금액을 입력해주세요>> ");
		int balanceRight=Integer.parseInt(sc.nextLine());
		
		
		//account가 null이 아니면 입금해주세요
		Account2 Aright=findAccount(anoRight);
		if(Aright!=null) {
			
			Aright.setBalance(Aright.getBalance()+balanceRight); //이거 한번 보세요
		}else {
			System.out.println("계좌번호를 한번 확인해주세요.");
		}
		
		
		
	}//예금
	private static void withdraw() {
		System.out.print("계좌번호를입력하세요>> ");
		String anoRight=sc.nextLine();
		
		System.out.println("출금액을 입력해주세요>> ");
		int balanceRight=Integer.parseInt(sc.nextLine());
		
		//account가 null이 아니면 출금해주세요
		Account2 Aright=findAccount(anoRight);
		if(Aright!=null) {
			
			Aright.setBalance(Aright.getBalance()-balanceRight); //이거 한번 보세요
		}else {
			System.out.println("계좌번호를 한번 확인해주세요.");
		}
		
		
	}//출금
	private static Account2 findAccount(String ano) {
		//for문을 돌려주기
		//if(null이 아닌경우만~)
		//if(ano작업)
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]!=null) {
				if(accountArray[i].getAno().equals(ano)) //==말고 equals를 많이 사용하도록 하세요 ~!
					return accountArray[i];
			}else{
				break;
			}
		}
		//찾은 Account2를 리턴한다.. 못찾으면 null
		return null;
	}//Account1 배열에서 ano와 동일한 account 찾기

}
