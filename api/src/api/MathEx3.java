package api;


public class MathEx3 {

	public static void main(String[] args) {
		// 반복문돌리세요 1~3까지 임의의 난수를 3개 생성한 뒤 한줄에 출력
		//모두 같은 수가 나올 때까지 반복하고 , 모두 같은 수면 종료하셈
		int a,b,c;
		while(true) {
			a=(int)(Math.random()*3)+1;
			b=(int)(Math.random()*3)+1;
			c=(int)(Math.random()*3)+1;
			
			System.out.printf("%d, %d, %d\n",a,b,c);
			if(a==b&&b==c)
				break;
			
		}
	}

}
