package condition;

public class ForEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10의 합
		int hap = 0;
		int i=1;
		for(; i<=10; i++) {
			hap+=i;
		}
		System.out.println(i);
		System.out.println("합은 "+hap);
		hap=0;
		for(int j=1; j<=100;j++) {
			hap+=j;
		}
		System.out.println("1부터 100까지의 합은 "+hap);
		
	}

}
