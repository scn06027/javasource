package op;

public class LogicalOperatorEx1 {

	//논리 기호
	// &&: 논리곱 and
	// ||: 논리합 or
	//!: 부정 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean result=(5>3) &&(5>2);
		System.out.println(result);
		
		result=(5>3)||(5<2); //죽은 코드: 계산을 아예 안함
		System.out.println(result);
	}

}
