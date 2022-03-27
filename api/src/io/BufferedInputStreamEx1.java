package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInputStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try (InputStream in=new FileInputStream("c:\\temp\\file1.txt");
			//입력 (in)
			BufferedInputStream bis=new BufferedInputStream(in);
			//보조 (in을 여기에다 넣어준거임)
			
			//굳이 변수를 만들 필요는 없고 인풋스트림을 버퍼스트림 in에다 다이렉트로 넣어줘도 됨
			OutputStream out=new FileOutputStream("c:\\temp\\output2.txt");
			BufferedOutputStream bos=new BufferedOutputStream(out);
				){
			//파일 읽기=>파일 쓰기
			byte b[]=new byte[1024];
			while(bis.read()!=-1) {
				bos.write(b);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
