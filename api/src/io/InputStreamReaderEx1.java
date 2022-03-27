package io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
/*
 * InputStreamReader : 문자변환 보조 스트림
 * 바이트 스트림 => 문자(char)기반
 */
public class InputStreamReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		//얘를 통과하는 순간 인풋스트림은 리더방식으로 바뀐다~!
		try(InputStream in=new FileInputStream("c:\\temp\\file1.txt");
				InputStreamReader reader=new InputStreamReader(in,"ms949");) {
			int data=0;
			char cbuf[]=new char[100];
			while(reader.read(cbuf)!=-1) {
				System.out.println(cbuf);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
