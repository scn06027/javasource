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

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reader in = new FileReader("c:\\temp\\file1.txt"); 이렇게하면 깨져보이고
		//밑에잇는 방법으로 하면 안깨지는것처럼 보임 어쩌고저쩌고 뭔말이야?
		try(InputStreamReader in=new InputStreamReader(new FileInputStream("c:\\temp\\file1.txt"),"ms949");
				BufferedReader bis = new BufferedReader(in);
				Writer out = new FileWriter("c:\\temp\\output2.txt");		
				BufferedWriter bos = new BufferedWriter(out)
				) {
			
			String str=null;
			while((str=bis.readLine())!=null) {
				bos.write(str);
				bos.newLine(); //엔터
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
			//byte배열 아주 조금 성능이 좋다?아니다..// ㅜ믈;ㄳ딪;기ㅏㅅ ㅇ,;ㅁ;ㄹ미ㅣ버겊;디 사람이 진짜 졸려하면 언디ㅗ겟구나..졸리다.
			
		}catch(IOException e1) {}
	}

}
