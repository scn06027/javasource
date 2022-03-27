package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileWriterEx2 {

	public static void main(String[] args) {
		// 사용자로부터 입력을 데이터를 입력받을겁니다: Scanner
		// c:\\temp\\output1.txt 파일을 생성합니다
		// 입력받은 데이터를 파일로 출력합니다 output1.txt
		
		
		File f= new File("c:\\temp\\output1.txt");
		
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		try (Scanner sc= new Scanner(System.in);
			Writer writer=new FileWriter(f)){
			{
				System.out.println("데이터 입력 (q를 입력하면 종료)>>");
				String input="";
				while(!(input=sc.nextLine()).equalsIgnoreCase("q")) {
					writer.write(input+"\r\n");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.print("아무 말이나 입력해주세요");

	}

}
