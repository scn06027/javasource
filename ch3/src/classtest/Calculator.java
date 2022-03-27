package classtest;

public class Calculator {
	//같은 클래스 안에 같은 이름의 생성자들이 있는 것: 생성자-오버로딩
	//    ''   메소드 여러개가 있는 것 : 메소드-오버로딩 : 매개변수의 타입, 개수, 순서가 달라야함.
	
	//정사각형
	double areaRectangle(double width) {
		return width*width;
	}
	
	//직사각형
	double areaRectangle(double width,double height) {
		return width*height;
	}

}
