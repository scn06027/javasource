package condition;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time=(int)(Math.random()*4)+8;
		System.out.println("[현재시간: "+time+" 시]");
		
		switch(time) {
		case 8:
			System.out.println("출근하기");
			
		case 9:
			System.out.println("회의하기");
	
		case 10:
			System.out.println("업무하기");
		
		default:
			System.out.println("외근 나가기");
			break;
		
		}
	}

}
