package io;

import java.io.IOException;
import java.io.InputStream;

public class InputSteamEx1 {

	public static void main(String[] args) {
			//입력:키보드
		 //Scanner sc=new Scanner(System.in);
//		
//		try { //read(): 한 바이트만 읽어옴
//			int input=in.read(); //한바이트만 읽어오는거라 abc라고 치면 a의 byte값 97을 읽어줌
//			System.out.println((char)input); //char를 붙여줘야된다 ㅇㅇ
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			try {
//				in.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
		//try=with-resources 형태로 변경 :AutoClosable close()를 알아서 해줌
		
		try(InputStream in=System.in) {
			int input=in.read(); //한바이트만 읽어오는거라 abc라고 치면 a의 byte값 97을 읽어줌
			System.out.println((char)input); //char를 붙여줘야된다 ㅇㅇ
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
