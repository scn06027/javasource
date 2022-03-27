package condition;

import java.util.Scanner;

public class RockScissorPaper {
public static void main(String[] args) {
	//가위바위보
	Scanner sc=new Scanner(System.in);
	//가위:1 바위:2 보자기:3
	//컴퓨터가 무작위로 1~3의 숫자중에서 하나를 .가지고있다
	int com=(int)(Math.random()*3+1);
	System.out.println("가위:1 바위:2 보자기:3");
	System.out.println("숫자를 입력하세요.");
	int me=sc.nextInt();
	
	
	/*
	if(com==1&&me==2) {
		System.out.println("나의 승리");
	}else if(com==2&&me==3) {
		System.out.println("나의 승리");
	}else if(com==3&&me==1) {
		System.out.println("나의 승리");
	}
	
	if(com==2&&me==1) {
		System.out.println("나의 패배");
	}else if(com==3&&me==2) {
		System.out.println("나의 패배");
	}else if(com==1&&me==3) {
		System.out.println("나의 패배");
	}
	
	if(com==me)
		System.out.println("무승부");
	*/
	
	switch (me - com) {
	case -1: case 2:
		System.out.println("나의 패배");
		break;
	case -2: case 1:
		System.out.println("나의 승리");
		break;
	case 0:
		System.out.println("비겼음");
		break;
	}
	
	

	
	sc.close();
}
}
