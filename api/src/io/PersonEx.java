package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/* 객체 전송
 * 직렬화(Serialization)
 * 
 * NotSerializableException <???>
 */
public class PersonEx {

	public static void main(String[] args) {
		Person personLee=new Person("이순신", "장군");
		Person personJang=new Person("장영실", "발명가");
//여기까지 직렬화과정
		try(FileOutputStream fos= new FileOutputStream("c:\\temp\\serial.dat");
			ObjectOutputStream oos =new ObjectOutputStream(fos)) {
			
			oos.writeObject(personLee);
			oos.writeObject(personJang);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		//역직렬화
		
		try(FileInputStream fis = new FileInputStream("c:\\temp\\serial.dat");
				ObjectInputStream ois= new ObjectInputStream(fis)) {
			
			for (int i = 0; i < 2; i++) {
				Person p=(Person)ois.readObject();
				System.out.println(p);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
