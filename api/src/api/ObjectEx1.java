package api;
//Object 메소드
//equals() : 부모는 주소 비교의 형태로 정의가 되어 있다.
//String 클래스에서는 오버라이딩을 통해 문자열을 비교할 때 주소가 아닌 문자열 값을 비교하는 형태로 사용함.

public class ObjectEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//객체 생성: default 생성자 호출
		Object obj1=new Object();
		Object obj2=new Object();
		String str="1";
		//메소드 호출
		//equals() : String 문자열 비교시 == 대신에 
		        // : 오버라이딩이 이미 들어가 있었다 . . .
		if(obj1.equals(obj2)) { //부모가 넘겨줄 땐 (heap)주소비교의개념
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(obj1==obj2) { //이것도 주소비교
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		Value value1=new Value(10);
		Value value2=new Value(10); 
		System.out.println(value1.equals(value2)?"같다":"다르다");
		
		System.out.println("obj1.toString() : "+obj1.toString());
		System.out.println("obj2.toString() : "+obj2.toString());
		//toString 오버라이딩을 햇다고?! 그건 담주에 할거임
		//뭐가다르다는거임?!
		
		System.out.println(value1.toString());
		System.out.println(value1);
	}
//인스턴스가 가지고 있는 문자열 반환


}
