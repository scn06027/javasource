package condition;

//얘도 조건문임
/*
 * switch(변수)
 * 		case 1:
 * 			수행할 문장;
 * 			break;
 * 		case 2:
 * 			수행할 문장;
 * 			break;
 * 		case 3:
 * 			수행할 문장;
 * 			break;
 * 		default:
 * 			수행할 문장;
 * */
public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dice=(int)(Math.random()*6)+1;
		
		//break : 어디까지 실행되야하는지 알려주는 척도?같은 것
		switch(dice) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5: 
			System.out.println("5번");
			break;
		case 6:
			System.out.println("6번");
			break;
		default:
			System.out.println("이 숫자가 아닙니다.");
			break;
		
		}
	}

}
