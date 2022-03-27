package array;

import java.util.Scanner;

public class ArrayEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String words[]= {"television","computer","mouse","phone"};
		
		
		/*
		String word="mouse";
		char[] question=word.toCharArray(); //char[] question= {'m','o','u','s',e'};
		//붙어있는걸 따로따로 낱개로 나눠준다..
		
		for (int i = 0; i < question.length; i++) {
			System.out.print(question[i]+" ");
		}
*/
		
		for (int i = 0; i < words.length; i++) {
			
		// words 배열 값을 읽어와서 char 배열로 변경
		char[]question=words[i].toCharArray();
		
		//변경 후 자리 교환
		for (int j = 0; j < question.length; j++) {
			int pos=(int)(Math.random()*+question.length);
			
			char temp=question[j];
			question[j]=question[pos];
			question[pos]=temp;
			
		}
		//문제 내기
		System.out.printf("Q%d) %s의 정답을 입력하세요\n",(i+1),new String(question));
		//new String(question): char 배열을 String으로 객체 생성한다. (char 배열을 문자열로 만들어줌)
		
		//사용자로부터 답 입력 받기
		Scanner sc=new Scanner(System.in);
		System.out.println("문자를 입력해주세요.");
		String answer=sc.nextLine();
		
		
		// 결과출력하기
		if(answer.equals(words[i])) {
			System.out.println("정답입니다");
		}else {
			System.out.println("정답이 아닙니다.");
		}
		
		}
		
		
		
		
		
		
	}

}
