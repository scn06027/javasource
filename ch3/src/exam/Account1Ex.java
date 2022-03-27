package exam;

import java.util.Scanner;

public class Account1Ex {

	public static void main(String[] args) {
		Account1 acc=new Account1();
		
		
		Scanner sc=new Scanner(System.in);
	
		acc.setBalance(1000);
		System.out.println("현재 잔고는 "+acc.getBalance());
		acc.setBalance(-100);
		System.out.println("현재 잔고는 "+acc.getBalance());
		acc.setBalance(2000000);
		System.out.println("현재 잔고는 "+acc.getBalance());
		
		
	}

}
