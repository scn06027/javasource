package api;

public class Value {
	int value;
	
	public Value(int value) {
		// TODO Auto-generated constructor stub
		this.value=value;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		//Object obj=value2;
		//obj instanceof Value: obj가 value 객체로 변환할 수 있는지 확인하는 과정..?
		//주소 비교가 아닌 값의 비교로 재정의를 하겠다
		
		
		if(obj instanceof Value) { //처음 선언될 때 value가 맞았음 ㅇㅇ
			Value v=(Value) obj;//원래 타입으로 강제 형변환!
			
			if(this.value==v.value) { //value1 == value2 실제 값 비교. equals 잘알아둘것
				return true;
			}
		}
		return false;
	}
	//인스턴스가 가지고 있는 문자열 반환
	@Override
	public String toString() {
		return "Value [value=" + value + "]";
	}
	
	
}
