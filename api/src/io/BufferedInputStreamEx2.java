package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis= new FileInputStream("c:\\temp\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis); //복사
				FileOutputStream fos= new FileOutputStream("c:\\temp\\hold_copy.mp4");
				BufferedOutputStream bos=new BufferedOutputStream(fos) //붙여넣기
				) {
			
			int data;
			while((data=bis.read())!=-1) {
				bos.write(data); 
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
