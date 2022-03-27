package op;

public class ConditionalEx1 {

	//삼항 연산자 : 조건?(참일때 수행해야될 코드): (거짓일 때 수행해야 될 코드)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=91;
		
		System.out.println(score>90 ? 'A' : 'B');
		char grade=score>90 ? 'A' : 'B';
		System.out.println(grade);
		
		//90 이상이면 A, 80이상이면 B
		
		System.out.println(score>90?'A':score>80? 'B':'C');
	}

}
