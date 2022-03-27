package api;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer(
				"this is a test");


		while(st.hasMoreTokens()) { //공백을 기준으로 잘라냄
			System.out.println(st.nextToken());
		}
		
		System.out.println();
		StringTokenizer st1= new StringTokenizer("This/is/a/test","/");
		
		while(st1.hasMoreTokens()) { // /을 기준으로 잘라냄
			System.out.println(st1.nextToken());
		}
		
		//split 이나  tokenizer로 잘라내면 됨
		
		System.out.println();
		String exp="1,김천재,100,100,100|2,박수재,90,95,80|이자바,80,90,90";
		StringTokenizer str2=new StringTokenizer(exp,"|,"); //|랑 , 를 기준으로 잘라낼거임 ㅇㅇ
		
		while(str2.hasMoreTokens()) { // /을 기준으로 잘라냄
			System.out.print(str2.nextToken()+" ");
		}
	}

}
