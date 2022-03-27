package condition;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫번째 수 입력>> ");
	//	String num1=sc.nextLine();
		//Integer.parseInt(num1); //String을 숫자로 인식되게 바꿔주는 역할.
		int num1=Integer.parseInt(sc.nextLine());
		
		System.out.println("두번째 수 입력>> ");
		int num2=Integer.parseInt(sc.nextLine());
		
		System.out.print("사칙 연산(+,-,*,/,%)중 하나 입력>> ");
		String op=sc.nextLine();
	//nextLine은 숫자,특수문자,한글,영어 다 받아들일 수 있다. 버퍼 상에 남아있는 엔터를 가져오기 때문..
		//nextInt 다음에 nextLine을 쓰면 그 전에 썼던 엔터가 남아있어서 의도치않게 프로그램 종료가 일어남.
		switch(op) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		case "%":
			System.out.println(num1%num2);
			break;
			
		default:
			break;
		}
		
		//System.out.printf("%d %s %d = %d",num1,op,num2,result);
		sc.close();
	}

}
