package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//한 어린이의 키를 2015~2021년 사이에 1년 단위로 입력받아
		//ArrayList에 저장하고, 가장 키가 많이 자란 연도를 출력하라
		//예시)    15  16  17  18  19  20  21
		// 입력값: 120 122 125 130 139 145 149
		//출력값: 가장 키가 많이 자란 년도는 2019년 9cm입니다.
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("키를 입력해주세요~! ");
		String tall=sc.nextLine();
		
		List<Integer> list=new ArrayList<Integer>();
		
		StringTokenizer token=new StringTokenizer(tall); //공백을 기준으로 분리
		 while(token.hasMoreTokens()) //야 가져올 토큰이 있냐?
			 list.add(Integer.parseInt(token.nextToken()));
		 
		 int max=0,maxyear=0;
		 
		 for (int i =1; i <list.size()-1; i++) {
			 if(list.get(i)-list.get(i-1)>max) {
				 max=list.get(i)-list.get(i-1);
				 maxyear=i;
			 }
			
		}
		
		
		System.out.printf("가장 키가 많이 자란 년도는 %d년 %dcm\n",maxyear+2015,max);
		//굳이 변수 그렇게 많이 안 만들어도 됨ㅇㅇ
		
	
	}

}
