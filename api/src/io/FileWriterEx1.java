package io;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Writer writer = new FileWriter("c:\\temp\\file3.txt")) {
			// 엔터: 타자기=> 1.한줄 올리고, 2.커서를 맨 앞으로 이동
			writer.write("FileWriter는 한글로 된\r\n");
			writer.write("문자열을 출력할 수 있다\r\n");
			writer.write("Writer 클래스는 문자단위의 \r\n");
			writer.write("출력만 가능합니다.");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
