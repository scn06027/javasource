package io;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//DataInputStream : 메모리에 저장된 0,1상태를 읽기쓰기한다~!
//
public class DataInputStreamEx1 {

	public static void main(String[] args) {
		try(
			FileOutputStream fos =new FileOutputStream("c:\\temp\\data.txt");
			DataOutputStream dos= new DataOutputStream(fos);
			FileInputStream fis = new FileInputStream("c:\\temp\\data.txt");
			DataInputStream dis= new DataInputStream(fis)) {
			//자료형에 맞게 자료 작성 ?
			dos.writeUTF("홍길동");
			dos.writeDouble(95.5);
			dos.writeInt(5);
			dos.writeUTF("김자바");
			dos.writeDouble(9.5);
			dos.writeInt(8);
			//읽어오기
			for (int i = 0; i < 2; i++) {
				String name=dis.readUTF();
				double jumsu=dis.readDouble();
				int num=dis.readInt();
				System.out.printf("%s  %f  %d \n",name,jumsu,num);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
