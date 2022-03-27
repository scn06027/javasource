package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PerformanceEx2 {

	public static void main(String[] args) {
	
		//FileInputStream + BufferedInputStream 사용 시
		try(FileInputStream fis = new FileInputStream("c:\\temp\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis)) {
			long start = System.currentTimeMillis();
			while(bis.read()!=-1) {}
			long end= System.currentTimeMillis();
			
			System.out.println("FileInput+BufferedInputStream 사용시 "+(end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		//FileInputStream + BufferedInputStream 사용 시+byte 배열 사용
		try(FileInputStream fis = new FileInputStream("c:\\temp\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis)) {
			byte data[]=new byte[4096];
			
			long start = System.currentTimeMillis();
			while(bis.read()!=-1) {}
			long end= System.currentTimeMillis();
			
			System.out.println("FileInput+BufferedInputStream +byte 배열 사용시 "+(end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
			
			//byte배열 아주 조금 성능이 좋다?아니다..// ㅜ믈;ㄳ딪;기ㅏㅅ ㅇ,;ㅁ;ㄹ미ㅣ버겊;디 사람이 진짜 졸려하면 언디ㅗ겟구나..졸리다.
			
		}
		
		//FileInputStream + BufferedInputStream 사용 시+byte 배열 사용
				try(FileInputStream fis = new FileInputStream("c:\\temp\\hold.mp4");
						BufferedInputStream bis = new BufferedInputStream(fis);
						FileOutputStream fos = new FileOutputStream("c:\\temp\\hold_copy2.mp4");		
						BufferedOutputStream bos = new BufferedOutputStream(fos)
						) {
					byte data[]=new byte[4096];
					
					long start = System.currentTimeMillis();
					while(bis.read(data)!=-1) {
						bos.write(data);
					}
					long end= System.currentTimeMillis();
					
					System.out.println("FileInput+BufferedInputStream +byte 배열 사용시 "+(end-start));
					
				} catch (Exception e) {
					e.printStackTrace();
					
					//byte배열 아주 조금 성능이 좋다?아니다..// ㅜ믈;ㄳ딪;기ㅏㅅ ㅇ,;ㅁ;ㄹ미ㅣ버겊;디 사람이 진짜 졸려하면 언디ㅗ겟구나..졸리다.
					
				}
				
				
				
				try(FileInputStream fis = new FileInputStream("c:\\temp\\hold.mp4");
						BufferedInputStream bis = new BufferedInputStream(fis);
						FileOutputStream fos = new FileOutputStream("c:\\temp\\hold_copy2.mp4");		
						BufferedOutputStream bos = new BufferedOutputStream(fos)
						) {
					int data;
					
					long start = System.currentTimeMillis();
					while((data=bis.read())!=-1) {
						bos.write(data);
					}
					long end= System.currentTimeMillis();
					
					System.out.println("FileOutputStream+BufferedOutputStream +byte 배열 사용시 "+(end-start));
					
				} catch (Exception e) {
					e.printStackTrace();
					
					//byte배열 아주 조금 성능이 좋다?아니다..// ㅜ믈;ㄳ딪;기ㅏㅅ ㅇ,;ㅁ;ㄹ미ㅣ버겊;디 사람이 진짜 졸려하면 언디ㅗ겟구나..졸리다.
					
				}
	
	}

}
