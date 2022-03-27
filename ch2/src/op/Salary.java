package op;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		//한달 월급 입력받고 10년동안 저축했을때?
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("당신의 한 달 월급을 입력하세요.");
		int wal=sc.nextInt();
		System.out.println("월급을 10년동안 저축했을 경우 "+wal*10*12+" 원을 얻게 됩니다.");
	sc.close();
	
	}

}
