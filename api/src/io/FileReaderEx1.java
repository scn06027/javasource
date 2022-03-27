package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Reader reader= new FileReader("c:\\temp\\file1.txt")) {
			int ch;
			while((ch=reader.read())!=-1)
				System.out.println((char)ch);
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // == InputStream:얘는 문자글자영상다읽기가능ㅋ Reader는 문자만 읽을수있음 
 catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
