package condition;

public class ForEx4 {

	public static void main(String[] args) {
		//for(int i=1,k=0; j<100&&k<=50; j++,k++) 다 가능~!
		//1부터 10까지 숫자 중에서 짝수만
		//1부터 10까지 숫자 중에서 짝수만
		//1부터 100까지 숫자 중에서 3의 배수만
		
		int hap=0;
		for(int i =0; i<=10;i+=2) {
			hap+=i;
		}
		System.out.println("1. 짝수들의 합은 "+hap);
		//이런 방법도 있다
		hap=0;
		for(int i =1; i<=10;i++) {
			if(i%2==0)
				hap+=i;
		}
		System.out.println("2. 짝수들의 합은 "+hap);
		
		hap=0;
		for(int i =1; i<=10;i+=2) {
			hap+=i;
		}
		System.out.println("1. 홀수들의 합은 "+hap);
		//이런 방법도 있다
		hap=0;
		for(int i =1; i<=10;i++) {
			if(i%2!=0)
				hap+=i;
		}
		System.out.println("2. 홀수들의 합은 "+hap);
		
		
		hap=0;
		for(int i =3; i<=100;i+=3) {
			hap+=i;
		}
		System.out.println("1. 3의 배수들의 합은 "+hap);
		//이런 방법도 있다!
		hap=0;
		for(int i =1; i<=100;i++) {
			if(i%3==0)
				hap+=i;
		}
		System.out.println("2. 3의 배수들의 합은 "+hap);
		
	}
	

}
