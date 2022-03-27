package api;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자로부터 문자열을 입력받은 후 구분해서 출력하세요
		//예시) 아빠/엄마/수연/철수/영희
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("가족을 입력하세요~! >>   ");
		String fam=sc.nextLine();
		
		StringTokenizer fam1=new StringTokenizer(fam,"/");
		
		while(fam1.hasMoreTokens()) { // /을 기준으로 잘라냄
			System.out.print(fam1.nextToken()+" ");
	}
	}
}
