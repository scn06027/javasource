package condition;

import java.util.Scanner;

//삼항 연산자로 했던건 다 if~else로 변경이 가능함.
public class IfEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//숫자를 입력받고 양수, 음수 확인
		Scanner sc= new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num= sc.nextInt();
		
		if(num>0){
		System.out.println("양수");	
		}else {
			System.out.println("음수");
			
		}
		}

}
