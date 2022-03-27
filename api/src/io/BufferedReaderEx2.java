package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderEx2 {

	public static void main(String[] args) {
		// 자바 소스 파일을 읽어서 화면에 출력한다
		//src/io/~.java
		// 출력문 앞에 번호를 붙여서 화면에 보여주세요 (뭔솔임?)
		//Reader in = new FileReader("c:\\temp\\file1.txt");
		//InputStreamReader in=new InputStreamReader(new FileInputStream("C:\\Users\\song9\\eclipse-workspace\\api\\src\\io\\BufferedInputStreamEx1.java"),"ms949");
		
		try(Reader in = new FileReader("C:\\Users\\song9\\eclipse-workspace\\api\\src\\io\\InputStreamReaderEx1.java");
				BufferedReader bis = new BufferedReader(in);
				Writer out = new FileWriter("c:\\temp\\JAVAex2.txt");		
				BufferedWriter bos = new BufferedWriter(out)
				) {
			
			String str=null;
			int i=1;
			while((str=bis.readLine())!=null) {
				
				bos.write("["+(i++)+"]  ");
				bos.write(str);
				bos.newLine(); //엔터
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
			//byte배열 아주 조금 성능이 좋다?아니다..// ㅜ믈;ㄳ딪;기ㅏㅅ ㅇ,;ㅁ;ㄹ미ㅣ버겊;디 사람이 진짜 졸려하면 언디ㅗ겟구나..졸리다.
			
		}catch(IOException e1) {
			e1.printStackTrace();
		}
		
		
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
		

	

}
