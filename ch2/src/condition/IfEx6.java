package condition;

public class IfEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//주사위를굴리자구
		
		//0.0< Math.random() <1.0 랜덤 숫자가 나온다.
		
		int dice=(int)(Math.random()*6)+1;
		

		if(dice==1) {
			System.out.println("주사위 1번");
		}else if(dice==2) {
			System.out.println("주사위 2번");
		}else if(dice==3) {
			System.out.println("주사위 3번");
		}else if(dice==4) {
			System.out.println("주사위 4번");
		}else if(dice==5) {
			System.out.println("주사위 5번");
		}else {
			System.out.println("주사위 6번");
		}
		
	}

}
