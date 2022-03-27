package classtest;

public class Triangle {
	//속성: 밑변, 높이 (둘다 정수) 
	//기능: 면적을 구한다.
	
	int baseLine,height;
	
	
	
	public Triangle(int baseLine, int height) {
		super();
		this.baseLine = baseLine;
		this.height = height;
	}




	double getArea() {
		
	//	float area = baseLine*height/2;
	//	return area;
		return baseLine*height/2;
		
	}

}
