package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class PerformanceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileInputStream 만 사용할 경우
		
		try(FileInputStream fis= new FileInputStream("c:\\temp\\pawel.jpg")) {
			long start = System.currentTimeMillis();
			while(fis.read()!=-1) {}
			long end= System.currentTimeMillis();
			
			System.out.println("FileInput 만 사용할 경우 "+(end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//FileInputStream + BufferedInputStream 사용 시
		try(FileInputStream fis = new FileInputStream("c:\\temp\\pawel.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis)) {
			long start = System.currentTimeMillis();
			while(bis.read()!=-1) {}
			long end= System.currentTimeMillis();
			
			System.out.println("FileInput+BufferedInputStream 사용시 "+(end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
