package classtest;

public class NumberEx {
	//numbers 객체 생성 후 합계, 평균 구하기
	
	public static void main(String[] args) {
		//int arr[]= {15,35,25,99,26,33};
		
		Numbers num= new Numbers(new int[]{15,35,25,99,26,33} );
		
		System.out.println("합계 : "+num.getTotal());
		System.out.printf("평균 : %.2f",num.getAverage());
		
		
	}
}
