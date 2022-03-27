package condition;

import java.util.Scanner;

public class MinValue {

	public static void main(String[] args) {
		// 세개의 정수를 입력받아 가장 작은 수를 출력
		
		Scanner sc=new Scanner(System.in);
		System.out.println("첫밴째 수를 입력하세요");
		int num1=sc.nextInt();
		System.out.println("두밴째 수를 입력하세요");
		int num2=sc.nextInt();
		System.out.println("세밴째 수를 입력하세요");
		int num3=sc.nextInt();
		
		if(num1>num2) {
			if(num2>num3) {
				System.out.println("가장 작은 수는 "+num3);
			}else {
				System.out.println("가장 작은 수는 "+num2);
			}
			}else {
				if(num1<num3) {
					System.out.println("가장 작은 수는"+num1);
					
			}else {
				System.out.println("가장 작은 수는 "+num3);
			}
		}
		
		int max=num1;
		
		if(max<num2)
			max=num2;
		if(max<num3)
			max=num3;
		System.out.println("가장 큰 수는 "+max);
	sc.close();
	
	}

}

