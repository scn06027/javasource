package condition;

import java.util.Scanner;

/*
 * if(조건){}
 * if(조건)else{}
 * if(조건)else if(조건){}else{}
 * 
 * if(조건){
 * if(조건){
 * }else{
 * }}
 * */

public class IfEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("점수를 입력하세요.");
int score=sc.nextInt();
char opt=' ', grade= ' ';
if(score>=90) {
	grade='A';
	if(score>=98) {opt='+';
	}else {
	opt='-';}
	}else if(score>=80){
		grade='B';
		if(score>=88) {opt='+';
		}else {
		opt='-';}
}else {
	grade='C';
}
System.out.printf("당신의 학점은 %c%c입니다.",grade,opt);
	
	sc.close();
	}

}
