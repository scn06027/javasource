package io;

import java.io.IOException;
import java.io.InputStream;

public class InputSteamEx2 {

	public static void main(String[] args) {
			//입력:키보드
		InputStream in=System.in; //Scanner sc=new Scanner(System.in);
		int input=0;
		try { //read(): 한 바이트만 읽어옴
			while((input=in.read())!=-1) {
				
				
				System.out.println((char)input);
				
				
			}
			
			//한바이트만 읽어오는거라 abc라고 치면 a의 byte값 97을 읽어줌
			 //char를 붙여줘야된다 ㅇㅇ
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
