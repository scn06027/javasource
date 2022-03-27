package classtest;

public class DataEx {
	public static void main(String[] args) {
		Data d= new Data();
		
		d.x=10;
		System.out.println("main. d.x= "+d.x);
		
		change(d);
		System.out.println("change() 호출 후");
		System.out.println("main d.x= "+d.x);
		
		DataEx obj=new DataEx();
		obj.print();
	}
	
	private void print() {
		
	}

	static void change(int x) { // 기본형 매개변수(인자) 값이 복사돼서 여기서만 쓰이고 삭제됨
		x=1000;
		System.out.println("change x ="+x);
	}
	
	static void change(Data obj) { //참조형 매개변수 (클래스 형태로 받아내기) 얘는 주소에 값이 저장됨 공유하는거임
		obj.x=1000;
		System.out.println("change x ="+obj.x);
	}
}
