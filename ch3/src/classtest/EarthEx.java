package classtest;

//java.util 패키지명
//import : 다른 패키지에 있는 클래스를 사용할 때 필요함.
//			:자바에서 제공하는 패키지 중 java.lang 패키지는 구문 없이 사용이 가능하다. (import 없어도 됨)
import java.util.Scanner;

public class EarthEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("반지름 "+Earth.Earth_RADIUS+" km");
		System.out.println("지구의 표면적 "+Earth.EARTH_SURFACE_AREA+" km^2");
		
	}

}
