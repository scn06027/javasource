package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListEx8 {

	public static void main(String[] args) {
		//Scanner를 사용하여 5개의 실수값을 사용자로부터 받아서 ArrayList에 저장한다.
		//가장 큰 수를 출력하세요
		//예) 입력값: 3.14 2.1 -5.5 99.9 33.7
		double max = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("가장 큰 수를 출력하겠습니다. 다섯개의 숫자를 입력해주세요");
		String number=sc.nextLine();
		
		String[] ArraysNum=number.split(" ");
		
		List<String> num=new ArrayList<String>(Arrays.asList(ArraysNum));
		
		for(String nums:num) {
			if(max<Double.parseDouble(nums))
				max=Double.parseDouble(nums);
		}
		
		System.out.println("가장 큰수는 "+max+" 입니다. ");
		sc.close();
		
		
		/*
		 * 이런 방법도 있다~
		 * 
		 * List<Double> list=new ArrayList<Double>();
		 * 
		 * StringTokenizer token=new StringTokenizer(number); //공백을 기준으로 분리
		 * while(token.hasMoreTokens()) //야 가져올 토큰이 있냐?
		 * 		list.add(Double.parseDouble(token.nextToken())); //list에 담아주는역할
		 * 
		 * //Collections.max(); 이런 시스템 함수도 있다!@ 나중에 써먹을것.. 한방에 제일 큰 수 찾을 수
		 * . 있음
		 */
	}

}
