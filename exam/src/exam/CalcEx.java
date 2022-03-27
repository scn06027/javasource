package exam;

import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Input Num1 : ");
		int num1= sc.nextInt();
		System.out.print("Input Num2 : ");
		int num2= sc.nextInt();
		System.out.print("Input Operator : ");
		String op=sc.next();
		
		switch(op) {
		
		case "+":{
			Calc calc=new Add(num1,num2);
			System.out.println(calc.calculate());
			break;}
		case "-":{
			Calc calc=new Sub(num1,num2);
			System.out.println(calc.calculate());
			break;}
		case "*":{
			Calc calc=new Mul(num1,num2);
			System.out.println(calc.calculate());
			break;}
		case "/":{
			Calc calc=new Div(num1,num2);
			System.out.println(calc.calculate());
			break;}
		default:
			System.out.println("바른 값을 입력해주세요.");
		}
		
		
	
		
		sc.close();
	}

}
