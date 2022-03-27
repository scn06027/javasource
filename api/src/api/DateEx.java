package api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date date1=new Date();
		System.out.println(date1);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		System.out.println(sdf.format(date1));
		LocalDate date2=LocalDate.now();
		System.out.println(date2);
		
		LocalDateTime date3=LocalDateTime.now();
		System.out.println(date3);
	}
}
