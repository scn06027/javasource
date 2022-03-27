package api;

public class SystemEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int i = 0; i < 10; i++) {
			System.out.println(i+"\t");
			
			if(i==5)
				System.exit(0);
		}*/
		
		long sum=0;
		long start=System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			sum+=i;
		}
		long end=System.currentTimeMillis();
		System.out.println("1~10000000 합: "+sum);
		System.out.println("1~10000000 합구하는데 걸린 시간: "+(end-start)+"ms");
	}

}
