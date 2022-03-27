package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputEx {

	/*
	 * try{} 단독으로 사용할 수 없다
	 * try{}catch()finally{}
	 * try()catch  혹은 try{}finally. 혼자서는 쓸 수 없다.*/
	public static void main(String[] args) {
		FileInputStream fis=null;
//		try {
//			fis= new FileInputStream("file.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}

		//자동 리소스 닫기
		try(FileInputStream is= new FileInputStream("file.txt")){
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
