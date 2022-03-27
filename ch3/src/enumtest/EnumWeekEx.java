package enumtest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EnumWeekEx {
public static void main(String[] args) {
		Week today=null;
		
		//오늘 날짜
		LocalDate now= LocalDate.now();
		//System.out.println(now);
		
		//요일에 따라 숫자를 리턴해주는 역할..(월요일:1)~(일요일:7)
	DayOfWeek week = now.getDayOfWeek();
	//  System.out.println(week.getValue());
	
	switch (week.getValue()){
	case 1: 
		today=Week.MONDAY;
		break;
	case 2: 
		today=Week.TUESDAY;
		break;
	case 3: 
		today=Week.WENDSDAY;
		break;
	case 4: 
		today=Week.MONDAY;
		break;
	case 5: 
		today=Week.FRIDAY;
		break;
	case 6: 
		today=Week.SATURDAY;
		break;
	case 7: 
		today=Week.SUNDAY;
		break;
		
	
	default:
		break;
	}
	System.out.println("오늘 요일은 "+today);
	}
}
