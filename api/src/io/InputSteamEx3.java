package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputSteamEx3 {

	public static void main(String[] args) {
		//입력: 키보드, 출력: 화면
		
		
		try(InputStream in = System.in;
		OutputStream out = System.out) {
			int input=in.read();
			out.write(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}

	}

