package classtest;

public class PhysicalInfo {
	//속성: 이름 나이 키 몸무게
	// 생성자 : 네개 모두를 전달인자로 받음
	
	String name;
	int age,tall;
	double weight;
	public PhysicalInfo(String name, int age, int tall, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.tall = tall;
		this.weight = weight;
	}
	
//age를 받아서 현재 age를 변경하는 update 메소드 만들고 싶음
	
	void update(int age) {
		this.age=age;
	}
	
	void update(int age, int tall) {
		this.age=age;
		this.tall=tall;
	}
	
	void update(int age, int tall, double weight) {
		this.age=age;
		this.tall=tall;
		this.weight=weight;
	}
	
}
